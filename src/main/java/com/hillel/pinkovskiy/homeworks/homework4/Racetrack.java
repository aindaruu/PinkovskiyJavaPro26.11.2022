package com.hillel.pinkovskiy.homeworks.homework4;

public class Racetrack extends Obstacle {
    private int length;
     public Racetrack(int length) {
         this.length = length;
     }
    @Override
    public boolean overcome() {
        System.out.println("Бігова доріжка довжиною " + length + " метрів.");
        return true;
    }

    public int getLength() {
        return 0;
    }
}
