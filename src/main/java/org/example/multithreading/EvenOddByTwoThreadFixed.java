package org.example.multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class EvenOddByTwoThreadFixed {

    static int count = 0;

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};

        ReentrantLock lock = new ReentrantLock(true);
        Condition condition = lock.newCondition();

        Thread evenThread = new Thread(() -> {
            while (count < arr.length) {
                lock.lock();
                try {
                    while (count < arr.length && arr[count] % 2 != 0) {
                        condition.await();
                    }
                    if (count < arr.length) {
                        System.out.println("Even Thread: " + arr[count]);
                        count++;
                        condition.signal();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });

        Thread oddThread = new Thread(() -> {
            while (count < arr.length) {
                lock.lock();
                try {
                    while (count < arr.length && arr[count] % 2 == 0) {
                        condition.await();
                    }
                    if (count < arr.length) {
                        System.out.println("Odd Thread: " + arr[count]);
                        count++;
                        condition.signal();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });

        evenThread.start();
        oddThread.start();
    }
}
