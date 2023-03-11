package com.hillel.pinkovskiy.homeworks.homework3;

public class Cat extends Animal {
    private static int count = 0;
    private final int maxRunDistance = 200;

    public Cat() {
        count++;
    }

    public static int getCount() {
        return count;
    }


    public void run(int distance) {
        if (distance > maxRunDistance) {
            System.out.println("Кот не может пробежать больше " + maxRunDistance + " м.");
        } else {
            System.out.println("Кот пробежал " + distance + " м.");
        }
    }


    public void swim(int distance) {
        System.out.println("Кот не умеет плавать.");
    }
}


