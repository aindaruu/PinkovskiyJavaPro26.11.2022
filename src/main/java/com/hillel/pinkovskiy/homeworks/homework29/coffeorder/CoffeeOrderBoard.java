package com.hillel.pinkovskiy.homeworks.homework29.coffeorder;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private List<Order> orders;
    private int nextOrderNumber;

    public CoffeeOrderBoard() {
        orders = new ArrayList<>();
        nextOrderNumber = 1;
    }

    public void add(String customerName) {
        Order order = new Order(nextOrderNumber, customerName);
        orders.add(order);
        nextOrderNumber++;
    }

    public void deliver() {
        if (!orders.isEmpty()) {
            Order order = orders.get(0);
            System.out.println("Delivering order: " + order.getOrderNumber() + " - " + order.getCustomerName());
            orders.remove(0);
        } else {
            System.out.println("No orders to deliver.");
        }
    }

    public void deliver(int orderNumber) {
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            if (order.getOrderNumber() == orderNumber) {
                System.out.println("Delivering order: " + order.getOrderNumber() + " - " + order.getCustomerName());
                orders.remove(i);
                return;
            }
        }
        System.out.println("Order not found: " + orderNumber);
    }

    public void draw() {
        System.out.println("Current queue:");
        for (Order order : orders) {
            System.out.println(order.getOrderNumber() + " - " + order.getCustomerName());
        }
    }

}
