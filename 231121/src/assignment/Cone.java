package assignment;

public class Cone extends GeometricSolid {
    private final double PI = 3.14;
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        return PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }

    @Override
    public double volume() {
        return (1.0 / 3.0) * PI * radius * radius * height;
    }

    @Override
    public void getSurfaceArea() {
        System.out.println("Cone Surface Area : " + surfaceArea());
    }

    @Override
    public void getVolume() {
        System.out.println("Cone Volume : " + volume());
    }
}
