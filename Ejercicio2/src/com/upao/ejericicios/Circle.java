
package com.upao.ejericicios;

public class Circle 
{
    private double radius;
    private String color;
    
    public static final String default_color="red";
    public static final double default_radius=3;
    
    public Circle()
    {
        this.color=default_color;
        this.radius=default_radius;
    }
    public Circle(double radius, String color) 
    {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }
    
    
}
