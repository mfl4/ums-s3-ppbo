package assignment;

public abstract class GeometricSolid {
    public abstract double surfaceArea();
    public abstract double volume();

    public void getSurfaceArea(){
        System.out.println("Surface Area : " + surfaceArea());
    }

    public void getVolume(){
        System.out.println("Volume : " + volume());
    }
}
