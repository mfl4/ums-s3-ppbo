package example.methodabstract;

public class MainMethod {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println("Perimeter = " + square.perimeter());
        System.out.println("Area = " + square.area());
    }
}
