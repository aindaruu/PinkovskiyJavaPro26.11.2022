package com.hillel.pinkovskiy.homeworks.homework29.coffeorder;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();

        orderBoard.add("John");
        orderBoard.add("Alice");
        orderBoard.add("Bob");

        orderBoard.draw();

        orderBoard.deliver();

        orderBoard.draw();

        orderBoard.deliver(2);

        orderBoard.draw();
    }
}
