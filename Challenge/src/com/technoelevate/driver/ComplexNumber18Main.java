package com.technoelevate.driver;

import com.technoelevate.ComplexNumber18;

public class ComplexNumber18Main {

	public static void main(String[] args) {
		ComplexNumber18 complex1 = new ComplexNumber18(4, 3);
		ComplexNumber18 complex2 = new ComplexNumber18(5, 4);
		System.out.println("Before Any Operation\n"+complex1.getReal()+" + i"+complex1.getImg());
		complex1.add(complex2);
		System.out.println("Addition Using Constractor\n"+complex1.getReal()+" + i"+complex1.getImg());
		complex1.add(10, 10);
		System.out.println("Addition Using Method\n"+complex1.getReal()+" + i"+complex1.getImg());
		complex1.sub(complex2);
		System.out.println("Subtraction Using Constractor\n"+complex1.getReal()+" + i"+complex1.getImg());
		complex1.sub(10, 10);
		System.out.println("Subtraction Using Method\n"+complex1.getReal()+" + i"+complex1.getImg());
	}

}
