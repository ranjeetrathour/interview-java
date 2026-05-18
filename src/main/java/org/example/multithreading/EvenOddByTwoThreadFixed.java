package org.example.multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class EvenOddByTwoThreadFixed {

    static int count = 0;
    static Object lock = new Object();
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};

        Thread even = new Thread(()->{
            while (count< arr.length){
                synchronized (lock){
                    if (count >= arr.length) {
                        break;
                    }

                    if (arr[count]%2==1){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if (count < arr.length) {
                        System.out.println("even print by even thread " + arr[count]);
                        count++;
                    }

                    lock.notify();
                }

            }
        });

        Thread odd = new Thread(()->{
            while (count< arr.length){
                synchronized (lock){
                    if (count >= arr.length) {
                        break;
                    }

                    if (arr[count]%2==0){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if (count < arr.length) {
                        System.out.println("odd print by odd thread " + arr[count]);
                        count++;
                    }

                    lock.notify();
                }

            }
        });

        even.start();
        odd.start();
    }
}

/**
 * ReentrantLock lock = new ReentrantLock(true);
 *         Condition condition = lock.newCondition();
 *
 *         Thread evenThread = new Thread(() -> {
 *             while (count < arr.length) {
 *                 lock.lock();
 *                 try {
 *                     while (count < arr.length && arr[count] % 2 != 0) {
 *                         condition.await();
 *                     }
 *                     if (count < arr.length) {
 *                         System.out.println("Even Thread: " + arr[count]);
 *                         count++;
 *                         condition.signal();
 *                     }
 *                 } catch (InterruptedException e) {
 *                     e.printStackTrace();
 *                 } finally {
 *                     lock.unlock();
 *                 }
 *             }
 *         });
 *
 *         Thread oddThread = new Thread(() -> {
 *             while (count < arr.length) {
 *                 lock.lock();
 *                 try {
 *                     while (count < arr.length && arr[count] % 2 == 0) {
 *                         condition.await();
 *                     }
 *                     if (count < arr.length) {
 *                         System.out.println("Odd Thread: " + arr[count]);
 *                         count++;
 *                         condition.signal();
 *                     }
 *                 } catch (InterruptedException e) {
 *                     e.printStackTrace();
 *                 } finally {
 *                     lock.unlock();
 *                 }
 *             }
 *         });
 *
 *         evenThread.start();
 *         oddThread.start();
 */
