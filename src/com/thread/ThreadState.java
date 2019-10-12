package com.thread;

public class ThreadState implements Runnable {
    public static Thread thread;
    public static ThreadState threadStateObj;

    public static void main(String[] args) {
        threadStateObj = new ThreadState();
        thread = new Thread(threadStateObj);
        // thread created and is currently in the NEW state.
        System.out.println("State of thread after creating it - " + thread.getState());
        thread.start();
        // thread moved to Runnable state
        System.out.println("State of thread after calling .start() method on it -" + thread.getState());
    }

    @Override
    public void run() {
        ThreadTest threadTest = new ThreadTest();
        Thread thread1 = new Thread(threadTest);
        // thread created and is currently in the NEW state.
        System.out.println("State of thread1 after creating it - " + thread1.getState());
        thread1.start();
        // thread1 moved to Runnable state
        System.out.println("State of thread1 after calling .start() method on it -" + thread1.getState());
        // moving thread to timed waiting state
        try {
            //moving thread to timed waiting state
            Thread.sleep(3500);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("State of thread1 after calling .sleep() method on it - " + thread1.getState());
        try {
            // waiting for thread1 to die
            thread1.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("State of thread1 when it has finished it's execution - " + thread1.getState());
    }

    public static class ThreadTest implements Runnable {

        @Override
        public void run() {
            // moving thread to timed waiting state
            try {
                Thread.sleep(1500);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println("State of thread while it called join() method on thread1 -" + ThreadState.thread.getState());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException in) {
                in.printStackTrace();
            }
        }
    }
}

