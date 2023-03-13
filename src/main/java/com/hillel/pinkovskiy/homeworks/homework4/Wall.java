package com.hillel.pinkovskiy.homeworks.homework4;

public class Wall extends Obstacle{
    private int height;
    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome() {
        System.out.println("Стіна висотою " + height + " метрів.");
        return false;
    }

    public int getHeight() {
        return 0;
    }
}
