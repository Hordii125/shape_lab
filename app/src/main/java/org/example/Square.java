package org.example;

public class Square extends Rectangle {
    private double side;

    public Square(double side) {
        super(side, side); // Call the Rectangle constructor with both sides equal
        this.side = side;
    }

    @Override
    public String getName() {
        return "Square";
    }

    public double getSide() {
        return side;
    }

    @Override
    public String viewInfo() {
        return "Square: " + "side = " + side + ", area = " + getArea() + ", perimeter = " + getPerimeter();
    }

    // Since a square is a special case of a rectangle, it has 4 sides
    // So we don't need to override numberOfSides() here, as it will inherit from Rectangle
    
}
