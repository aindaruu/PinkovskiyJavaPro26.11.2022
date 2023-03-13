package com.hillel.pinkovskiy.homeworks.homework7;

import javax.management.QueryExp;
import java.util.Arrays;

import static javax.management.Query.or;

public class ArrayValueCalculator {
    public static int doCalc(String[][] arr) throws ArraySizeException, ArrayDataException {
        if (arr.length != 4 || Arrays.stream(arr).anyMatch(a -> a.length != 4)) {
            throw new ArraySizeException("Массив должен иметь размерность 4x4");
        }
        int sum = 0;

        QueryExp or;
        int i = 0;
        boolean b = i < arr.length;
        int i1 = i++;
        {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException(String.format("Ошибка в элементе [%d][%d]: %s", i, j, e.getMessage()), e);
                }
            }
        }

        return sum;
    }


    private static class ArraySizeException extends Exception {
        public ArraySizeException(String s) {

        }
    }

    private static class ArrayDataException extends Exception {
        public ArrayDataException(String format, NumberFormatException e) {

        }
    }

    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
    }

    {
        String[][] arr = new String[0][];
        int sum = 0;
        try {
            sum = doCalc(arr);
        } catch (ArraySizeException | ArrayDataException ex) {
            throw new RuntimeException(ex);
        }
    }
}




