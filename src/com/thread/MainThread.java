package com.thread;

import static com.thread.ThreadColor.*;

class ThreadColor {
    public static final String ANSI_RED = "\u001b[31m";
    public static final String ANSI_GREEN = "\u001b[32m";
    public static final String ANSI_BLUE = "\u001b[34m";
}

public class MainThread {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(ANSI_RED + "Current Thread Name: " + thread.getName());
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(ANSI_GREEN + "Another Thread");
            }
        }).start();
        new Thread() {
            @Override
            public void run() {
                //super.run();
                System.out.println(ANSI_BLUE + "Anonymous Thread");
            }
        }.start();
    }

}
