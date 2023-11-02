package module2.latihan.car;

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        

        car1.changeCandence(50);
        car1.speedUp(20);
        car1.changeGear(2);
        car1.printInfo();
        
        car2.changeCandence(50);
        car2.speedUp(20);
        car2.changeGear(2);
        car2.printInfo();
    }
}
