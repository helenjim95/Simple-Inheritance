package de.tum.in.ase;

public class Main {

    // TODO 1: Create a new subclass Rectangle of the superclass Shape
    Shape rectangle = new Rectangle(4, 5);

    // TODO 2: Optional challenge: create another subclass Square
    Shape Square = new Square(6);

    public static void main(String[] args) {

        // TODO 3: use the following code to test

        Rectangle rectangle = new Rectangle(5, 7);
        System.out.println("Rectangle area: " + rectangle.area());
        Square square = new Square(5);
        System.out.println("Square area: " + square.area());
        Circle circle = new Circle(3);
        System.out.println("Circle area: " + circle.area());

    }
}
