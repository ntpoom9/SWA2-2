package com.swa.oop3;

public class Rectangle extends Shape
{
	 private double height;  // To hold height.
	   private double width;  //To hold width or base

	   // Set height and width
	   public void setValues(double height, double width)
	   {
	      this.height = height;
	      this.width = width;
	   }

	   //Get height
	   public double getHeight() 
	   {
	       return height;
	   }
	     
	   //Get width
	   public double getWidth() 
	   {
	       return width;
	   } 

	   // The getArea method is abstract.   
	   // It must be overridden in a subclass. 
    //Calculate and return area of rectangle
    public double getArea()
    {
        return getHeight() * getWidth();
    }
}
