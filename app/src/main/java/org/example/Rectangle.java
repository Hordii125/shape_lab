package org.example;

public class Rectangle extends Shape implements Polygon {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    public String viewInfo() {
        return "Rectangle:" + " length = " + length + ", width = " + width + ", area = " + getArea() + ", perimeter = " + getPerimeter();
    }

    @Override
    public int numberOfSides() {
        return 4; // A rectangle has 4 sides
    }
    
}
