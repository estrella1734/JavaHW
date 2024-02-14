package com.shelly.hw5_2;

public class Rectangle implements Shape{
	double length;
	double width;
	public Rectangle (double length, double width) {
	this.length= length;
	this.width = width;
	}
	public double computeArea(){
		double area = length * width; 
	 	return area ;
	}
	public double computeCircumference() {
		double circumference = 2 * (length + width );
		return circumference;
	}
}
