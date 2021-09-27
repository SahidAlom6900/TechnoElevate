package com.technoelevate.test;

public class Assignment {
private int apple;
private int orage;
public Assignment(int apple, int orage) {
	this.apple = apple;
	this.orage = orage;
}
public Assignment() {
}
public int getApple(int apple) {
	return this.apple-=apple;
}
public void setApple(int apple) {
	this.apple = apple;
}
public int getOrage(int orage) {
	return this.orage-=orage;
}
public int getO(int i) {
	return i;
}
public int getA(int i) {
	return i;
}
public void setOrage(int orage) {
	this.orage = orage;
}

@Override
public String toString() {
	return "apple = " + apple + "  orage = " + orage ;
}

}
