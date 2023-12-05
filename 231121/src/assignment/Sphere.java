package assignment;

public class Sphere extends GeometricSolid {
    private final double PI = 3.14;
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return 4 * PI * radius * radius;
    }

    @Override
    public double volume() {
        return (4 / 3) * PI * radius * radius * radius;
    }

    @Override
    public void getSurfaceArea() {
        System.out.println("Sphere Surface Area : " + surfaceArea());
    }

    @Override
    public void getVolume() {
        System.out.println("Sphere Volume : " + volume());
    }
}
