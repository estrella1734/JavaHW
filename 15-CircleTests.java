package com.shelly.hw5_2;

public class CircleTests {

	public static void main(String[] args) {
		Circle x = new Circle(5.0);
		double area = x.computeArea();
		System.out.println(area);
		double circumference = x.computeCircumference();
		System.out.println(circumference);
	}

}
