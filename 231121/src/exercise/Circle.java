package exercise;

import example.methodabstract.AbstractMethod;

public class Circle extends AbstractMethod {
    private final float PI = 3.14f;
    private float radius = 5.0f;

    @Override
    public int area() {
        return (int) (PI*radius*radius);
    }

    @Override
    public int perimeter() {
        return (int) (2*PI*radius);
    }
}
