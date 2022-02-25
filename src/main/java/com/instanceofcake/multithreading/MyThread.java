package com.instanceofcake.multithreading;

class Processor extends Thread {

	int i;

	public Processor(int i) {
		this.i = i;
	}

	public void run() {

		for (int i = 0; i < 20; i++) {
			System.out.println("Thread :" + i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {}
		}

	}

}

public class MyThread {

	public static void main(String[] args) {

		Processor t1 = new Processor(1);
		t1.start();
		Processor t2 = new Processor(2);
		t2.start();

	}

}
