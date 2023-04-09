package com.hillel.pinkovskiy.homeworks.homework27;

public class ArrayUtils {
    public int[] extractElementsAfterLastFour(int[] arr) {
        int lastFourIndex = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) {
                lastFourIndex = i;
                break;
            }
        }

        if (lastFourIndex == -1) {
            throw new RuntimeException("Массив не содержит число 4");
        }

        int[] result = new int[arr.length - lastFourIndex - 1];
        System.arraycopy(arr, lastFourIndex + 1, result, 0, result.length);
        return result;
    }

    public boolean containsOneAndFour(int[] arr) {
        boolean containsOne = false;
        boolean containsFour = false;
        for (int num : arr) {
            if (num == 1) {
                containsOne = true;
            } else if (num == 4) {
                containsFour = true;
            }
        }
        return containsOne && containsFour;
    }
}
