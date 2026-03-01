package org.example.multithreading;

class Demo extends Thread {
   boolean isVisible = true;
    @Override
    public void run() {
        while (isVisible){
            System.out.println(" is visible " + isVisible);
        }
        System.out.println(" is visible " + isVisible);

    }
    public void  stopThread(){
        isVisible=false;
    }
}

public class VolatileBasedQuestion {
    public static void main(String[] args) throws InterruptedException {
        Demo d = new Demo();
        d.start();
        Thread.sleep(2000);
        System.out.println("thread stop ");
        d.stopThread();
    }
}
