package assignment;

public class Cube extends GeometricSolid {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double surfaceArea() {
        return 6 * side * side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }

    @Override
    public void getSurfaceArea() {
        System.out.println("Cube Surface Area : " + surfaceArea());
    }

    @Override
    public void getVolume() {
        System.out.println("Cube Volume : " + volume());
    }
}
