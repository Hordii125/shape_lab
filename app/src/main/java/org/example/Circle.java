package org.example;

public class Circle extends Shape implements Polygon {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    public String viewInfo() {
        return "Circle: " + "radius = " + radius + ", area = " + getArea() + ", perimeter = " + getPerimeter();
    }

    @Override
    public int numberOfSides() {
        return 0; // A circle has no sides
    }
}
