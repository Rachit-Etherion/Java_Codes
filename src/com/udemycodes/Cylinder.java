package com.udemycodes;

public class Cylinder extends Circle
{
    private double height;
    public Cylinder(double radious,double height)
    {
        super(radious);
        if(height<0)
        {
            this.height = 0;
        }
        else
        {
            this.height = height;
        }
    }
    public double getHeight()
    {
        return height;
    }
    public double getVolume()
    {
        return height*super.getArea();
    }
}
