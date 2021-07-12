package com.swa.oop3;

public class Circle extends Shape {
	private double radius;
	 public void setValues(double radius)
	   {
	      this.radius = radius;
	   }

	   //Get height
	   public double getRadius() 
	   {
	       return radius;
	   }
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		  return Math.PI*Math.pow(radius,2);
	}

}
