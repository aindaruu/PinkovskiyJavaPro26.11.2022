package com.hillel.pinkovskiy.homeworks.homework24;

import com.hillel.pinkovskiy.homeworks.homework15.coffeeorder.Order;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestRunner {
    public static void start(Class<?> testClass) throws Exception {
        Method beforeSuiteMethod = null;
        Method afterSuiteMethod = null;
        List<Method> testMethods = new ArrayList<>();
        Object testObject = testClass.getDeclaredConstructor().newInstance();

        for (Method method : testClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ExampleTest.BeforeSuite.class)) {
                if (beforeSuiteMethod == null) {
                    beforeSuiteMethod = method;
                } else {
                    throw new RuntimeException("More than one BeforeSuite method found");
                }
            } else if (method.isAnnotationPresent(ExampleTest.AfterSuite.class)) {
                if (afterSuiteMethod == null) {
                    afterSuiteMethod =method;
                } else {
                    throw new RuntimeException("More than one AfterSuite method found");
                }
                
            } else if (method.isAnnotationPresent(ExampleTest.Test.class)) {
                testMethods.add(method);
                
            }
        }
        testMethods.sort(Comparator.comparingInt((Method m) -> m.getAnnotation(ExampleTest.Test.class).priority()));

        if (beforeSuiteMethod != null) {
            beforeSuiteMethod.invoke(testObject);
        }
        if (afterSuiteMethod != null) {
            afterSuiteMethod.invoke(testObject);
        }
        for (Method testMethod : testMethods){
            testMethod.invoke(testObject);
        }

    }
}

