package com.technoelevate;

public class HondaVehicle {
	static String companyName;
	String vehicleName;
	String vNo;
	int cc;
	int mileage;
	int price;
	int maxSpeed;

	public HondaVehicle(String companyName, String vehiclaName, String vNo, int cc, int mileage, int price, int maxSpeed) {
		this.companyName = companyName;
		this.vehicleName = vehiclaName;
		this.vNo = vNo;
		this.cc = cc;
		this.mileage = mileage;
		this.price = price;
		this.maxSpeed = maxSpeed;
	}

	public HondaVehicle(String companyName, String vehiclaName, String vNo, int cc, int mileage, int maxSpeed) {
		this.companyName = companyName;
		this.vehicleName = vehiclaName;
		this.vNo = vNo;
		this.cc = cc;
		this.mileage = mileage;
		this.maxSpeed = maxSpeed;
	}

	public HondaVehicle() {
	}

	public void move() {
		System.out.println(
				"Vehicle Name " + this.vehicleName + " with a speed of " + maxSpeed + "\nkm/h you will get it in Rs:" + price);
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
