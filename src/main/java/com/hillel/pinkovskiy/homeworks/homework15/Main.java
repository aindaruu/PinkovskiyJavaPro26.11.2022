package com.hillel.pinkovskiy.homeworks.homework15;

import com.hillel.pinkovskiy.homeworks.homework15.coffeeorder.CoffeeOrderBoard;
import com.hillel.pinkovskiy.homeworks.homework15.coffeeorder.Order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.add(new Order("Jane", 75));
        board.add(new Order("Karl", 97));
        board.add(new Order("Max", 58));

        board.draw();



    }

}
