package com.hillel.pinkovskiy.homeworks.homework4;

public class Circle implements GeometricFigure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
