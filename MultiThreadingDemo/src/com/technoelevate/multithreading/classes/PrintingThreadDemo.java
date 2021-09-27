package com.technoelevate.multithreading.classes;

public class PrintingThreadDemo extends Thread{
	int x;
	int y;
	Printing printing;
	

	public PrintingThreadDemo(int x, int y,Printing printing) {
		this.x = x;
		this.y = y;
		this.printing =  printing;
	}


	@Override
	public void run() {
		printing.print(x,y);
		
		
	}
}
