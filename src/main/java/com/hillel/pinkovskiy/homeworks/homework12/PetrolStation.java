package com.hillel.pinkovskiy.homeworks.homework12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class PetrolStation {
    private final AtomicInteger amount;
    private final ExecutorService executorService;
    private static final int MAX_CONCURRENT_REQUESTS = 3;
    public PetrolStation(int amount) {
        this.amount = new AtomicInteger(amount);
        this.executorService = Executors.newFixedThreadPool(MAX_CONCURRENT_REQUESTS);
    }
    public void doRefuel(int requestedAmount) throws InterruptedException {
        executorService.execute(() -> {
            synchronized (amount) {
                if (requestedAmount <= amount.get()) {
                    System.out.println("Starting refuel of " + requestedAmount + " litres");
                    try {
                        Thread.sleep((long) (Math.random() * 8000 + 3000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int currentAmount = amount.get();
                    amount.set(currentAmount - requestedAmount);
                    System.out.println("Finished refuel of " + requestedAmount + " litres");
                } else {
                    System.out.println("Not enough fuel for refuel of " + requestedAmount + " litres");
                }
            }
        });
    }
}
