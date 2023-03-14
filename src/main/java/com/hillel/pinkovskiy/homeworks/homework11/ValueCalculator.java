package com.hillel.pinkovskiy.homeworks.homework11;

import java.util.Arrays;

public class ValueCalculator {
    private float[] array;
    private int size;
    private int halfSize;

    public ValueCalculator(int size) throws InterruptedException {
        this.size = Math.max(size, 1000000);
        this.halfSize = size / 2;
        this.array = new float[size];
    }

    public void calculate() {
        long start = System.currentTimeMillis();
        Arrays.fill(array, 0.1f);
        float[] array1 = new float[halfSize];
        float[] array2 = new float[halfSize];
        System.arraycopy(array, 0, array1, 0, halfSize);
        System.arraycopy(array, halfSize, array2, 0, halfSize);


        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < array1.length; i++) {
                array1[i] = (float) (array1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < array2.length; i++) {
                int index = i + halfSize;
                array2[i] = (float) (array2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(array1, 0, array, 0, halfSize);
        System.arraycopy(array2, 0, array, halfSize, halfSize);

        long end = System.currentTimeMillis();
        System.out.println("Time elapsed: " + (end - start) + " ms");
    }
}
