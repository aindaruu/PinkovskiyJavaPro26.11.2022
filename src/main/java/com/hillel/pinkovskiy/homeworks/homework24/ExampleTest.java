package com.hillel.pinkovskiy.homeworks.homework24;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class ExampleTest {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface Test {
        int priority() default 5;
    }
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface BeforeSuite {
    }
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface AfterSuite {
    }

    @Test(priority = 1)
    public void testMethod1() {
        System.out.println("TestMethod1 with priority 1");
    }

    @Test(priority = 2)
    public void testMethod2() {
        System.out.println("TestMethod1 with priority 2");
    }

    @BeforeSuite
    public void setUp() {
        System.out.println("BeforeSuite method");
    }

    @AfterSuite
    public void tearDown() {
        System.out.println("AfterSuite method");
    }

}
