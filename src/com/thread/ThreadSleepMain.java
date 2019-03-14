package com.thread;

class ThreadSleep extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println(i);
        }
    }
}

public class ThreadSleepMain {
    public static void main(String[] args) {
        ThreadSleep ts = new ThreadSleep();
        ThreadSleep ts2 = new ThreadSleep();
        ts.start();
        ts2.start();
    }
}
