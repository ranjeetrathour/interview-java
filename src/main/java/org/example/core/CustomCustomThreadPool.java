package org.example.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CustomCustomThreadPool {

    private final ExecutorService executor;

    public CustomCustomThreadPool(int poolSize) {
        this.executor = Executors.newFixedThreadPool(poolSize);
    }

    public void submitTask(Runnable task) {
        executor.submit(task);
    }

    public void shutdown() {
        executor.shutdown();
        System.out.println("Thread pool shut down.");
    }

    public static void main(String[] args) {

        CustomCustomThreadPool pool = new CustomCustomThreadPool(3);

        pool.submitTask(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Task 1 - Number: " + i +
                        " | Thread: " + Thread.currentThread().getName());
                sleep(500);
            }
        });

        pool.submitTask(() -> {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println("Task 2 - Letter: " + c +
                        " | Thread: " + Thread.currentThread().getName());
                sleep(500);
            }
        });

        pool.submitTask(() -> {
            System.out.println("Task 3 - Hello from thread pool! "
                    + Thread.currentThread().getName());
        });

        pool.shutdown();
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}