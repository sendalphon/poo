
package com.upao.ejericicios;

public class Cylinder extends Circle
{
    private double heigth;
    public static final double default_heigth=1;
    
    public Cylinder()
    {
        
    }
    public Cylinder(double heigth) 
    {
        this.heigth = heigth;
    }
    public Cylinder(double radius,double heigth)
    {
        this.heigth = heigth;
    }
    public Cylinder(double heigth, double radius, String color) {
        super(radius, color);
        this.heigth = heigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
    
    public double volumen()
    {
        return 0;
    }

    @Override
    public String toString() {
        return "\nCylinder{" +super.toString()+"heigth=" + heigth + '}';
    }
    
}
