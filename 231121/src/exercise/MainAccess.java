package exercise;

import example.methodabstract.Square;

public class MainAccess {
    public static void main(String[] args) {
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Parallelogram parallelogram = new Parallelogram();
        Triangle triangle = new Triangle();

        System.out.println("Square Area : " + square.getArea());
        System.out.println("Square Perimeter : " + square.getPerimeter());
        System.out.println("Rectangle Area : " + rectangle.getArea());
        System.out.println("Rectangle Perimeter : " + rectangle.getPerimeter());
        System.out.println("Circle Area : " + circle.getArea());
        System.out.println("Circle Perimeter : " + circle.getPerimeter());
        System.out.println("Parallelogram Area : " + parallelogram.getArea());
        System.out.println("Parallelogram Perimeter : " + parallelogram.getPerimeter());
        System.out.println("Triangle Area : " + triangle.getArea());
        System.out.println("Triangle Perimeter : " + triangle.getPerimeter());
    }
}