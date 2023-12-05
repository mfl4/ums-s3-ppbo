package assignment;

public class Block extends GeometricSolid {
    private double length;
    private double width;
    private double height;

    public Block(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    @Override
    public double volume() {
        return length * width * height;
    }

    @Override
    public void getSurfaceArea() {
        System.out.println("Block Surface Area : " + surfaceArea());
    }

    @Override
    public void getVolume() {
        System.out.println("Block Volume : " + volume());
    }
}
