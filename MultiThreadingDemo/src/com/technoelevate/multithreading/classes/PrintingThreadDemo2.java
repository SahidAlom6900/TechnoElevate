package com.technoelevate.multithreading.classes;

public class PrintingThreadDemo2 extends Thread {
	int x;
	int y;
	Printing printing;
	

	public PrintingThreadDemo2(int x, int y,Printing printing) {
		this.x = x;
		this.y = y;
		this.printing =  printing;
	}


	@Override
	public void run() {
		printing.print2(x,y);
		
		
	}

}
