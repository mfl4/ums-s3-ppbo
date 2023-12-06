package experiment;

import java.util.Scanner;

public class LampApplication {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Scanner scanner = new Scanner(System.in);

        lamp.lampStatus = lamp.setSwitch(0);
        System.out.println("Lamp Status = " + lamp.lampStatus + "\nType");
        System.out.println("1 to turn the light on\n0 to turn the light off");

        if (lamp.setSwitch(scanner.nextInt()) == 0) {
            lamp.turnOffLight();
        } else {
            lamp.turnOnLight();
        }
    }
}
