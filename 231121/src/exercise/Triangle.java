package exercise;

import example.methodabstract.AbstractMethod;

public class Triangle extends AbstractMethod {
    private float base = 6.0f;
    private float height = 5.0f;
    private float sideA = 4.0f;
    private float sideB = 5.0f;

    @Override
    public int area() {
        return (int) ((base*height)/2);
    }

    @Override
    public int perimeter() {
        return (int) (base+sideA+sideB);
    }
}
