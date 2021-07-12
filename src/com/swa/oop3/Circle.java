package com.swa.oop3;

public class Circle extends Shape {
	private double radius;
	 public void setValues(double radius)
	   {
	      this.radius = radius;
	   }

	
	public double getArea() {
		this.area = Math.PI * Math.pow(radius,2);
		return this.area;
		
	}

} 
