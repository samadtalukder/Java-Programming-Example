package com.thread;

public class MainThread {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("Current Thread Name: "+thread.getName());


	}

}
