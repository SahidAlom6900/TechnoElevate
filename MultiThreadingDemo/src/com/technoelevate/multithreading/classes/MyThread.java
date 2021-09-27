package com.technoelevate.multithreading.classes;

public class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 26; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + " / Thread Name : " + Thread.currentThread().getName() + " / is Demon : "
					+ Thread.currentThread().isDaemon());
		}
	}
}
