package com.shelly.hw5_2;

public class Circle implements Shape {
	double radius;
	final double PI = 3.14159;
	public Circle (double radius) {
		this.radius= radius;
	}
	
	public double computeArea(){
		double area = radius * radius * PI; 
	 	return area ;
	}
	public double computeCircumference() {
		double circumference = 2 * radius * PI;
		return circumference;
	}
}
