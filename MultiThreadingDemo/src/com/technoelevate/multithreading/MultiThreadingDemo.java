package com.technoelevate.multithreading;

import com.technoelevate.multithreading.classes.MyThread;

public class MultiThreadingDemo {
	/*
	 * public static void running() { for (char i = 'a'; i <= 'z'; i++) {
	 * Thread.currentThread().setName("Sahid"); try { Thread.sleep(1000); } catch
	 * (InterruptedException e) { e.printStackTrace(); } System.out.println(i +
	 * " / Thread Name : " + Thread.currentThread().getName() + " / is Demon : " +
	 * Thread.currentThread().isDaemon()); } }
	 */

	public static void main(String[] args) {

		/*
		 * Runnable r = () -> { for (char i = 'a'; i <= 'z'; i++) {
		 * Thread.currentThread().setName("Sahid"); try { Thread.sleep(1000); } catch
		 * (InterruptedException e) { e.printStackTrace(); } System.out.println(i +
		 * " / Thread Name : " + Thread.currentThread().getName() + " / is Demon : " +
		 * Thread.currentThread().isDaemon()); } };
		 */

//		Runnable r1 = MultiThreadingDemo::running; //method reference
//		Thread thread = new Thread(r);
//		Thread thread1 = new Thread(r1);
//		thread.start();
//		thread1.start();
		MyThread thread = new MyThread();
		thread.start();
		for (char i = 'A'; i <= 'Z'; i++) {
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
