package module2.latihan.car;

public class Car {
    private int speed;
    private int gear;
    private int candence;

    public void changeCandence(int candence) {
        this.candence = candence;
    }

    public void speedUp(int speed) {
        this.speed = speed;
    }

    public void changeGear(int gear) {
        this.gear = gear;
    }

    public void printInfo() {
        System.out.println("Speed: " + speed + " Gear: " + gear + " Candence: " + candence);
        System.out.println("code by MFL4 - L200220277\n");
    }
}