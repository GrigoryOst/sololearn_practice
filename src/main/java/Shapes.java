import java.util.Scanner;

/* You are working on a graphical app, which includes multiple different shapes.
The given code declares a base Shape class with an abstract area() method and a width attribute.
You need to create two Shape subclasses, Square and Circle,
which initialize the width attribute using their constructor, and define their area() methods.
The area() for the Square class should output the area of the square (the square of the width), while for the Circle,
it should output the area of the given circle (PI*width*width).
The code in main creates two objects with the given user input and calls the area() methods. */

abstract class Shape {
    int width;
}

class Square extends Shape {
    public Square(int wdth) {
        this.width = wdth;
    }

    public void area() {
        System.out.println("Square's result: " + this.width * this.width);
    }
}

class Circle extends Shape {
    public Circle(int wdth) {
        this.width = wdth;
    }

    public void area() {
        System.out.println("Circle's result: " + Math.PI * this.width * this.width);
    }
}

public class Shapes {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the square's width...");
        int x = sc.nextInt();
        System.out.println("Enter the circle's width...");
        int y = sc.nextInt();

        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}
