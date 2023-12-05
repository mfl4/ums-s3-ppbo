package exercise;

import example.methodabstract.AbstractMethod;

public class Parallelogram extends AbstractMethod {
    private float base = 6.0f;
    private float height = 4.0f;

    @Override
    public int area() {
        return (int) (base*height);
    }

    @Override
    public int perimeter() {
        return (int) (2*(base+height));
    }
}
