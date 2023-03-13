package com.hillel.pinkovskiy.homeworks.homework4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Member[] Member = new Member[] {
                new Human("John",150,2),
                new Cat("Barsik",100,3),
                new Robot("R2D2",300,1)
        };
        Obstacle[] Obstacle = new Obstacle[] {
                new Racetrack(100),
                new Wall(2)
        };
        Random rand = new Random();

        for (Member participant : Member) {
            System.out.println("Participant: " + participant);
            boolean success = true;
            for (Obstacle obstacle : Obstacle) {
                System.out.println("Obstacle: " + obstacle);
                if (obstacle instanceof Racetrack) {
                    success = participant.run(rand.nextInt(((Racetrack) obstacle).getLength()) + 50);
                } else if (obstacle instanceof Wall) {
                    success = participant.jump(rand.nextInt(((Wall) obstacle).getHeight()) + 1);
                }
                if (!success) {
                    System.out.println(participant + " Не подолав перешкоду!");
                    break;
                }
            }
            if (success) {
                System.out.println(participant + " Подолав перешкоду!");
            }
            System.out.println();
        }
    }
}

