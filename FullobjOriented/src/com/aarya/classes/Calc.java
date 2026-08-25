package com.aarya.classes;

public class Calc {
	private int n;
	private int m;
	public int r;



public void setN(int n) {
	this.n=n;
}
public void setM(int m) {
	this.m = m;
}
public int getN() {
	return n;
}
public int getM() {
	return m;
}
public void add() {
	
	r=m+n;
	System.out.println("addition is "+r);
}
public void sub() {
	r=n-m;
	System.out.println("substraction is "+r);
}
}