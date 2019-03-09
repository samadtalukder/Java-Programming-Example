package com.thread;

public class ThreadEx {
    public static class ThreadTest extends Thread {
        @Override
        public void run() {
            super.run();
            try {
                // Displaying the thread that is running
                System.out.println("Thread " + Thread.currentThread().getId() + " is running");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static class ThreadTest2 implements Runnable {
        @Override
        public void run() {
            try {
                System.out.println("Thread " + Thread.currentThread().getId() + " is running");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        /*System.out.println("Thread Class");
        for (int i = 0; i < 4; i++) {
            ThreadTest threadTest = new ThreadTest();
            threadTest.start();
        }*/
        System.out.println("Thread Implements");
        for (int i = 0; i < 4; i++) {
            Thread thread = new Thread(new ThreadTest2());
            thread.start();
        }
    }
}
