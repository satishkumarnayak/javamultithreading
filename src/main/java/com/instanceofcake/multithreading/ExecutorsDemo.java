package com.instanceofcake.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {
	
	private int i ;
	public Task(int i) {
		this.i=i;
	}

	public void run() {
	  
		System.out.println("Started task:"+i);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		
		}
		System.out.println("Finshed task:"+i);
	}
	
}
public class ExecutorsDemo {

	public static void main(String[] args) {
	
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		for(int i = 0; i < 5; i++) {
			executor.submit(new Task(i));
		}
		executor.shutdown();
		try {
			executor.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e) {}
		
		System.out.println("All Task completed");
	}

}
