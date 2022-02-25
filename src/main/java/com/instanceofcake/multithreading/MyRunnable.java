package com.instanceofcake.multithreading;

class Processor2 implements Runnable {

	int i;

	public Processor2(int i) {
		this.i = i;
	}

	public void run() {

		for (int i = 0; i < 20; i++) {
			System.out.println("Thread :" + i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
		}

	}

}

public class MyRunnable {

	public static void main(String[] args) {

		Processor2 w1 = new Processor2(1);
		Thread t1 = new Thread(w1);
		t1.start();
		Processor2 w2 = new Processor2(2);
		Thread t2 = new Thread(w2);
		t2.start();

	}

}
