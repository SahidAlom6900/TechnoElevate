package com.technoelevate.multithreading.classes;

public class PrintingThreadDemo1 extends Thread {
	int x;
	int y;
	Printing printing;
	

	public PrintingThreadDemo1(int x, int y,Printing printing) {
		this.x = x;
		this.y = y;
		this.printing =  printing;
	}


	@Override
	public void run() {
		printing.print1(x,y);
		
		
	}

}
