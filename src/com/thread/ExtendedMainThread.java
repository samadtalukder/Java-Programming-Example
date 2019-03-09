package com.thread;

public class ExtendedMainThread {
    public static class ExtendedThread extends Thread {
        @Override
        public void run() {
            String currentThread = Thread.currentThread().getName();
            System.out.println("Current Thread Name: "+currentThread);
        }
    }

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        ExtendedThread extendedThread = new ExtendedThread();
        extendedThread.setName("Extended Thread");
        extendedThread.start();
    }
}
