package com.swa.oop3;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape;
        
        // assign subclass reference to subclass variable
        Rectangle rect = new Rectangle();
        
        // shape points to the object rect.
        shape = rect;

        // Set data in Rectangle's object 
        rect.setValues(78,5);
        
        //Display the area of rectangle
        System.out.println("Area of rectangle : " + shape.getArea());
        
        // assign subclass reference to subclass variable
        Triangle tri = new Triangle();
        
        // shape points to the object tri.        
        shape = tri;
        
        // Set data in Triangle's object         
        tri.setValues(34,3);
        
        //Display the area of triangle        
        System.out.println("Area of triangle : " + shape.getArea());
        
       Circle cir = new Circle();
        
        // shape points to the object cir.        
        shape = cir;
        
        // Set data in Triangle's object         
        cir.setValues(6);
        
        //Display the area of triangle        
        System.out.println("Area of circle : " + shape.getArea());
	}

}
