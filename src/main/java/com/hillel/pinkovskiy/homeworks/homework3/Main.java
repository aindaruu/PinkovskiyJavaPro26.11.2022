package com.hillel.pinkovskiy.homeworks.homework3;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("Количество созданных котов: " + Cat.getCount());

        Dog dog = new Dog();
        System.out.println("Количество созданных собак: " + Dog.getCount());

        cat.run(150);
        dog.run(600);
        dog.swim(5);
    }
}
