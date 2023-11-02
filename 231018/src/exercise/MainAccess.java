package exercise;

public class MainAccess {
    public static void main(String[] args) {
        Car car = new Car();
        Plane plane = new Plane();

        System.out.println(car.fuel);
        System.out.println(car.brandName);
        System.out.println(car.speed);
        System.out.println(car.capacity);

        System.out.println('\n');

        System.out.println(plane.type);
        System.out.println(plane.brandName);
        System.out.println(plane.speed);
        System.out.println(plane.capacity);
    }
}