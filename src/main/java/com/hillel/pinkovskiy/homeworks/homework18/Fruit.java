package com.hillel.pinkovskiy.homeworks.homework18;

import java.util.ArrayList;
import java.util.List;

public class Fruit {
    public static <T> List<T> toList(T[] arr) {
        List<T> list = new ArrayList<>();
        for (T element : arr) {
            list.add(element);
        }
        return list;
    }
    private float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}
