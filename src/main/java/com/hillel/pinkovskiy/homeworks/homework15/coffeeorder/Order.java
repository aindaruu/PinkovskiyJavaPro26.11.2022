package com.hillel.pinkovskiy.homeworks.homework15.coffeeorder;

public class Order {
    private int orderNumber;
    public String name;

    public Order(String name, int orderNumber) {
        this.name =name;
        this.orderNumber = orderNumber;
    }
    public int getOrderNumber() {
        return orderNumber;
    }
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getName() {
        return name;
    }
    public int compareTo(Order o) {
        return this.getOrderNumber() - o.getOrderNumber();
    }
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", name='" + name + '\'' +
                '}';
    }

}
