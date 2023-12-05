package exercise;

import example.methodabstract.AbstractMethod;

public class Rectangle extends AbstractMethod {
    private float length = 8.0f;
    private float width = 4.0f;

    @Override
    public int area() {
        return (int) (length*width);
    }

    @Override
    public int perimeter() {
        return (int) (2*(length+width));
    }
}
