package de.tum.in.ase;

public class Circle extends Shape {

    private final double radius;

    //The constructor
    public Circle(double radius) {
        this.radius = radius;

    }

    //Formula to calculate the area
    public double area() {
        return Math.PI * radius * radius;
    }
}
