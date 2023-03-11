package com.hillel.pinkovskiy.homeworks.homework3;

public class Dog extends Animal {
    private static int count = 0;
    private final int maxRunDistance = 500;
    private final int maxSwimDistance = 10;

    public Dog() {
        count++;
    }

    public static int getCount() {
        return count;
    }


    public void run(int distance) {
        if (distance > maxRunDistance) {
            System.out.println("Собака не может пробежать больше " + maxRunDistance + " м.");
        } else {
            System.out.println("Собака пробежала " + distance + " м.");
        }
    }


    public void swim(int distance) {
        if (distance > maxSwimDistance) {
            System.out.println("Собака не может проплыть больше " + maxSwimDistance + " м.");
        } else {
            System.out.println("Собака проплыла " + distance + " м.");
        }
    }
}
