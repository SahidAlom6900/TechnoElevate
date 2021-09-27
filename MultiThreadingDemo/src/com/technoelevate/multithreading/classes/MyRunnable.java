package com.technoelevate.multithreading.classes;

public class MyRunnable implements Runnable {

	
	public void run() {
		for(char i='a';i<='z';i++) {
			Thread.currentThread().setName("Sahid");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+" / Thread Name : "+Thread.currentThread().getName()+" / is Demon : "+Thread.currentThread().isDaemon());
		}
	}

}
