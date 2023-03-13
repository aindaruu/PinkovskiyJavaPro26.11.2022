package com.hillel.pinkovskiy.homeworks.homework4;

public class Square implements GeometricFigure{
    private double side;
    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }
}
