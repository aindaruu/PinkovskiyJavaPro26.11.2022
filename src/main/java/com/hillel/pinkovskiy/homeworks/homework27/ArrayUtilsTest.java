package com.hillel.pinkovskiy.homeworks.homework27;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayUtilsTest {
    @Test
    public void testExtractElementsAfterLastFour() {
        ArrayUtils utils = new ArrayUtils();
        int[] arr1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] expected1 = {1, 7};
        Assertions.assertArrayEquals(expected1, utils.extractElementsAfterLastFour(arr1));

        int[] arr2 = {1, 2, 3, 5, 6};
        Assertions.assertThrows(RuntimeException.class, () -> utils.extractElementsAfterLastFour(arr2));
    }

    @Test
    public void testContainsOneAndFour() {
        ArrayUtils utils = new ArrayUtils();
        int[] arr1 = {1, 1, 1, 4, 4, 1, 4, 4};
        Assertions.assertTrue(utils.containsOneAndFour(arr1));

        int[] arr2 = {1, 1, 1, 1, 1, 1};
        Assertions.assertFalse(utils.containsOneAndFour(arr2));

        int[] arr3 = {4, 4, 4, 4};
        Assertions.assertFalse(utils.containsOneAndFour(arr3));

        int[] arr4 = {1, 4, 4, 1, 1, 4, 3};
        Assertions.assertFalse(utils.containsOneAndFour(arr4));
    }
}
