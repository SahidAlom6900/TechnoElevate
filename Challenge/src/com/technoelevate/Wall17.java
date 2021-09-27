package com.technoelevate;

public class Wall17 {
	double width;
	double height;

	public Wall17(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Wall17() {
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		if (width < 0 || height < 0) {
			setWidth(0);
			setHeight(0);
		}
		return width * height;
	}
	Integer  i;
}
