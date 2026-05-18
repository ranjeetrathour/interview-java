package org.example.multithreading;

public class DeadlockExample{
    A a = new A();
    B b = new B();
    public static void main(String[] args) {
        DeadlockExample d = new DeadlockExample();
        Thread t1 = new Thread(() -> {d.a.test1(d.b);});
        Thread t2 = new Thread(() -> {d.b.test1(d.a);});
        t1.start();
        t2.start();
    }
}

class A {

    public synchronized void test1(B b) {

        System.out.println("Thread 1 locked A");

        System.out.println("Thread 1 waiting for B");

        b.demo();
    }

    public synchronized void demo() {

        System.out.println("Demo a called by b");
    }
}

class B {

    public synchronized void test1(A a) {

        System.out.println("Thread 2 locked B");

        System.out.println("Thread 2 waiting for A");

        a.demo();
    }

    public synchronized void demo() {

        System.out.println("Demo b called by a");
    }
}