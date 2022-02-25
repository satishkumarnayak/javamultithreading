package com.instanceofcake.multithreading;

import java.nio.channels.ShutdownChannelGroupException;
import java.util.Scanner;

class Processor3 implements Runnable {

	private volatile boolean  running = true;

	public Processor3() {

	}

	public void run() {

		while (running) {

			System.out.println("Thread : hello");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
		}

	}

	public void shutdown() {
		this.running = false;
	}

}

public class Volatile {

	public static void main(String[] args) {
		Processor3 w1 = new Processor3();
		Thread t1 = new Thread(w1);
		t1.start();
		System.out.println("Press enter for shutdown...");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		
		w1.shutdown();

	}

}
