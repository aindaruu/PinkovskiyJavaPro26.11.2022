package com.hillel.pinkovskiy.homeworks.homework4;

public class Robot extends Member{
    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
    }

    @Override
    public boolean jump(int height) {
        boolean name = false;
        int maxJumpHeight = 1;
        if (height <= maxJumpHeight) {
            System.out.println(name + " Перестрибнув " + height + " метрів.");
            return true;
        } else {
            System.out.println(name + " Не зміг перестрибнути " + height + " метрів.");
            return false;
        }
    }
    @Override
    public boolean run(int distance) {
        boolean name = false;
        int maxRunDistance = 300;
        if (distance <= maxRunDistance) {
            System.out.println(name + " Пробіг " + distance + " метрів.");
            return true;
        } else {
            System.out.println(name + " Не зміг пробігти " + distance + " метрів.");
            return false;
        }
    }
}
