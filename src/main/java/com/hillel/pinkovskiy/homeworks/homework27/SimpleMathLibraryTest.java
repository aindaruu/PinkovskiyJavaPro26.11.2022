package com.hillel.pinkovskiy.homeworks.homework27;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleMathLibraryTest {
    @Test
    public void testAdd() {
        SimpleMathLibrary math = new SimpleMathLibrary();
        double result = math.add(2.0, 3.0);
        Assertions.assertEquals(5.0, result);
    }
    @Test
    public void testMinus() {
        SimpleMathLibrary math = new SimpleMathLibrary();
        double result = math.minus(5.0, 3.0);
        Assertions.assertEquals(2.0, result);
    }
}
