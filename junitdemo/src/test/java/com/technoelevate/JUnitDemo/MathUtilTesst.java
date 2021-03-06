package com.technoelevate.JUnitDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MathUtilTesst{
	
	@BeforeAll
	public void printAll() {
		System.out.println("Before All");
	}
	@BeforeEach
	public void print() {
		System.out.println("Before Each");
	}
	@DisplayName("Test")
	@Test
	public void addTest() {
		MathUtil mathUtil = new MathUtil();
		assertEquals(20, mathUtil.add(11, 9),"Add Value");
		System.out.println("Test1 Each");
	}
	@Disabled
	@Test
	public void areaTest() {
		MathUtil mathUtil = new MathUtil();
		double expected=3.141592653589793;
		assertEquals(expected, mathUtil.area(1),"Add Value");
		System.out.println("Test2 Each");
	}
	
	@AfterEach
	public void print1() {
		System.out.println("After Each");
	}
	@AfterAll
	public void print12() {
		System.out.println("After All");
	}
}
