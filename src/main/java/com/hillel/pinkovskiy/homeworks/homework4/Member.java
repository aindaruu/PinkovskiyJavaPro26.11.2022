package com.hillel.pinkovskiy.homeworks.homework4;

public abstract class Member {
    private final int maxJumpHeight;
    private final String name;
    private final int maxRunDistance;

    public Member(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }
    public abstract boolean run(int distance);

    public abstract boolean jump(int height);

}
