package org.example;

public class RightTriangle extends Shape implements Polygon {
    private double base;
    private double height;

    public RightTriangle(double base, double height, double hypotenuse) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getHypotenuse() {
        return Math.sqrt(base * base + height * height);
    }

    @Override
    public String getName() {
        return "Right Triangle";
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public double getPerimeter() {
        return base + height + Math.sqrt(base * base + height * height);
    }

    public String viewInfo() {
        return "Right Triangle: " + "base = " + base + ", height = " + height + ", area = " + getArea() + ", perimeter = " + getPerimeter();
    }
    
    @Override
    public int numberOfSides() {
        return 3; // A right triangle has 3 sides  
    }
}
