package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestShape {
    @Test 
    public void testCircle() {
        Circle circle = new Circle(5);
        assertEquals("Circle", circle.getName());
        assertEquals(5, circle.getRadius());
        assertEquals(78.5, circle.getArea(), 0.01);
        assertEquals(31.4, circle.getPerimeter(), 0.01);
        double expectedPerimeter = 2 * 3.14 * circle.getRadius();
        assertEquals("Circle: radius = 5.0, area = 78.5, perimeter = " + expectedPerimeter, circle.viewInfo());
        assertEquals(0, circle.numberOfSides());
    }
    @Test
    public void testRectangle() {
        Rectangle rectangle = new Rectangle(4, 6);
        assertEquals("Rectangle", rectangle.getName());
        assertEquals(4, rectangle.getLength());
        assertEquals(6, rectangle.getWidth());
        assertEquals(24, rectangle.getArea(), 0.01);
        assertEquals(20, rectangle.getPerimeter(), 0.01);
        assertEquals("Rectangle: length = 4.0, width = 6.0, area = 24.0, perimeter = 20.0", rectangle.viewInfo());
        assertEquals(4, rectangle.numberOfSides());
    }
    @Test
    public void testSquare() {
        Square square = new Square(4);
        assertEquals("Square", square.getName());
        assertEquals(4, square.getSide());
        assertEquals(16, square.getArea(), 0.01);
        assertEquals(16, square.getPerimeter(), 0.01);
        assertEquals("Square: side = 4.0, area = 16.0, perimeter = 16.0", square.viewInfo());
        assertEquals(4, square.numberOfSides());
    }
    @Test
    public void testRightTriangle() {
        RightTriangle triangle = new RightTriangle(3, 4, 5);
        assertEquals("Right Triangle", triangle.getName());
        assertEquals(3, triangle.getBase());
        assertEquals(4, triangle.getHeight());
        assertEquals(5, triangle.getHypotenuse());
        assertEquals(6, triangle.getArea(), 0.01);
        assertEquals(12, triangle.getPerimeter(), 0.01);
        assertEquals("Right Triangle: base = 3.0, height = 4.0, area = 6.0, perimeter = 12.0", triangle.viewInfo());
        assertEquals(3, triangle.numberOfSides());
    }

    @Test
    public void testIsocelesRightTriangle() {
        double base = 4;
        double height = 4;
         // Create an instance of IsocelesRightTriangle with base and height
        IsocelesRightTriangle triangle = new IsocelesRightTriangle(base, height);
        assertEquals("Isoceles Right Triangle", triangle.getName());
        assertEquals(4, triangle.getBase());
        assertEquals(4, triangle.getHeight());
        assertEquals(5.656854249492381, triangle.getHypotenuse(), 0.01);
        assertEquals(8, triangle.getArea(), 0.01);
        double expectedPerimeter = 4 + 4 + Math.sqrt(16 + 16);
        assertEquals(expectedPerimeter, triangle.getPerimeter(), 0.01);
        assertEquals("Isoceles Right Triangle: base = 4.0, height = 4.0, hypotenuse = 5.656854249492381, area = 8.0, perimeter = " + expectedPerimeter, triangle.viewInfo());
        assertEquals(3, triangle.numberOfSides());
    }



}