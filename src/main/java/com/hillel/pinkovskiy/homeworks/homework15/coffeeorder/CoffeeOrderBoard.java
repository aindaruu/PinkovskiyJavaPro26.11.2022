package com.hillel.pinkovskiy.homeworks.homework15.coffeeorder;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private List<Order> orders;
    public CoffeeOrderBoard() {
        orders = new ArrayList<>();
    }
    public void add(Order order) {
        if (order==null) {
            throw new IllegalArgumentException("Order cannot be null");

        }
        if (orders.contains(order)) {
            throw new IllegalArgumentException("Order already exist");
        }
        int orderNumber = orders.size() + 1;
        order.setOrderNumber(orderNumber);
        orders.add(order);

    }
    public void deliver(int orderNumber) {
        if (orders.isEmpty()) {
            System.out.println("No orders to deliver");
            return;
        }
        Order orderToDeliver = null;
        for (Order order : orders) {
            if (order.getOrderNumber() == orderNumber) {
                orderToDeliver = order;
                break;
            }
        }
        if (orderToDeliver == null) {
            System.out.println("Order not found");
            return;
        }
        orders.remove(orderToDeliver);
        System.out.println("Delivering order:" + orderToDeliver);
    }
    public void draw() {
        for (Order order : orders) {
            System.out.println(order.getOrderNumber() + "|" + order.getName());
        }
    }
}
