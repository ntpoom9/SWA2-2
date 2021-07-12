package com.swa.oop3;

public class Triangle extends Rectangle
{ 
    //Calculate and return area of triangle
    public double getArea() 
    {
        return (getHeight() * getWidth()) / 2;
    }
}   