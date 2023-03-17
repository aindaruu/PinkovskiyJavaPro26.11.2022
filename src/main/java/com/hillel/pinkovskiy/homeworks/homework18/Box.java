package com.hillel.pinkovskiy.homeworks.homework18;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>{
    private List<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }
    public void addFruit(T fruit) {
        if (fruits.isEmpty() || fruit.getClass().equals(fruits.get(0).getClass())) {
            fruits.add(fruit);
        } else {
            throw new IllegalArgumentException("You cannot add different type of fruit to this box");
        }
    }
    public void addFruits(List<T> fruits) {
        for (T fruit : fruits) {
            addFruit(fruit);
        }
    }
    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }
    public boolean compare(Box<?> another) {
        return Math.abs(getWeight() - another.getWeight()) < 0.0001F;

    }
    public void merge(Box<T> another) {
        if (fruits.size() == 0 || fruits.get(0).getClass().equals(another.fruits.get(0).getClass())) {
            fruits.addAll(another.fruits);
            another.fruits.clear();
        } else {
            System.out.println("You cannot add different type of fruit to this box");
        }
    }
}
