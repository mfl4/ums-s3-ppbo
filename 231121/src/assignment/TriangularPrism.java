package assignment;

public class TriangularPrism extends GeometricSolid{
    private double baseSideA;
    private double baseSideB;
    private double baseSideC;
    private double height;
    private double side = (baseSideA + baseSideB + baseSideC) / 2;
    private double areaB = Math.sqrt(side*(side-baseSideA)*(side-baseSideB)*(side-baseSideC));

    public TriangularPrism(double baseSideA, double baseSideB, double baseSideC, double height) {
        this.baseSideA = baseSideA;
        this.baseSideB = baseSideB;
        this.baseSideC = baseSideC;
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        return 2*areaB+(baseSideA+baseSideB+baseSideC)*height;
    }

    @Override
    public double volume() {
        return areaB*height;
    }

    @Override
    public void getSurfaceArea() {
        System.out.println("Triangular Prism Surface Area : " + surfaceArea());
    }

    @Override
    public void getVolume() {
        System.out.println("Triangular Prism Volume : " + volume());
    }
}
