package org.example;

public class IsocelesRightTriangle extends RightTriangle{
    public IsocelesRightTriangle(double base, double height) {
        super(base, height, Math.sqrt(base * base + height * height));
    }

    @Override
    public String getName() {
        return "Isoceles Right Triangle";
    }

    @Override
    public String viewInfo() {
        return "Isoceles Right Triangle: " + "base = " + getBase() + ", height = " + getHeight() + ", hypotenuse = " + getHypotenuse() + ", area = " + getArea() + ", perimeter = " + getPerimeter();
    }

    // Same as RightTriangle, so no need to override numberOfSides()
    
}
