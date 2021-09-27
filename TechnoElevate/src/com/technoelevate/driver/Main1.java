package com.technoelevate.driver;

import com.technoelevate.HondaVehicle;

public class Main1 {

	public static void main(String[] args) {

		HondaVehicle hondaVehicle = new HondaVehicle("Honda", "Hero Honda", "AP1234", 100, 100, 100, 125);
		hondaVehicle.move();
	}

}
