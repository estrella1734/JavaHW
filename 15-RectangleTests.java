package com.shelly.hw5_2;

public class RectangleTests {

	public static void main(String[] args) {
		Rectangle x = new Rectangle (10,20);
		double area = x.computeArea();
		double circumference = x.computeCircumference();
		System.out.println(area);
		System.out.println(circumference);
	}

}
