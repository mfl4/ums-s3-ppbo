package assignment;

public class MainAccess {
    public static void main(String[] args) {
        Block block = new Block(2, 3, 4);
        Cube cube = new Cube(2);
        Sphere sphere = new Sphere(3);
        Cone cone = new Cone(3, 4);
        TriangularPrism triangularPrism = new TriangularPrism(2, 2, 3, 4);

        block.getSurfaceArea();
        block.getVolume();
        cube.getSurfaceArea();
        cube.getVolume();
        sphere.getSurfaceArea();
        sphere.getVolume();
        cone.getSurfaceArea();
        cone.getVolume();
        triangularPrism.getSurfaceArea();
        triangularPrism.getVolume();
    }
}