package de.tum.in.ase;

public class Square extends Shape {
    private final double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return length * length;
    }
}
