package com.technoelevate;

public class ComplexNumber18 {

	private double real;
	private double img;

	public ComplexNumber18() {
	}

	public ComplexNumber18(double real, double img) {
		this.real = real;
		this.img = img;
	}

	public double getReal() {
		return real;
	}

	public double getImg() {
		return img;
	}

	//addition
	public void add(double real, double img) {
		this.real = this.real + real;
		this.img = this.img + img;
	}

	//addition
	public void add(ComplexNumber18 complexNumber) {
		this.real = this.real + complexNumber.getReal();
		this.img = this.img + complexNumber.getImg();
	}

	//	subtraction
	public void sub(double real, double img) {
		this.real = this.real - real;
		this.img = this.img - img;
	}

	//subtraction
	public void sub(ComplexNumber18 complexNumber) {
		this.real = this.real - complexNumber.getReal();
		this.img = this.img - complexNumber.getImg();
	}

}
