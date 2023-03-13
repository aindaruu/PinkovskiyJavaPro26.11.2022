package com.hillel.pinkovskiy.homeworks.homework4;

public class Triangle implements GeometricFigure{
   private double height;
   private double width;
    public Triangle(double base, double height) {
        this.width = base;
        this.height = height;
    }


    @Override
    public double getArea() {
        return 0.5 * width * height;

    }
}
