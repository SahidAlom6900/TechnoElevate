package com.technoelevate.driver;

import com.technoelevate.Alian;
import com.technoelevate.Human;

public class World {

	public static void main(String[] args) {
		Human human = new Human("Sahid Alom", 25, 5.5f, "15/02/1995", 123456789);
		System.out.println(human);
		human.setName("xyz");
		human.setAge(24);
		human.setHeight(5.5f);
		human.setDob("15/2/1996");
		System.out.println(human);
		human.sleep();
		System.out.println("***************************************");
		Human h1=new Alian("xyz1", 1, 5, "15/02/1356", 12345678, 1);
	    System.out.println(h1);
	    h1.sleep();
	    
	    System.out.println("***************************************");
		Human h11=new Alian("xyz2", 1, 5, "15/02/1356", 12345678, 2) {
			public void sleep() {
				System.out.println("next updateds");
			};
		};
	    System.out.println(h11);
	    h11.sleep();
	}

}
