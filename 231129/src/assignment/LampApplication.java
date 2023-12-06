package assignment;

import java.util.Scanner;

public class LampApplication {
    public static void main(String[] args) {

        Lamp lamp = new Lamp();
        Scanner scanner = new Scanner(System.in);

        lamp.lampStatus = lamp.setSwitch(0);

        while (lamp.lampStatus == 0 || lamp.lampStatus == 1 || lamp.lampStatus == 2) {
            System.out.println("Lamp Status = " + lamp.lampStatus);
            System.out.println("Type\n0 to turn the light off\n1 to turn the light on\n2 to turn the light dim");

            int input = scanner.nextInt();

            if (input == 0) {
                lamp.turnOffLight();
            } else if (input == 1) {
                lamp.turnOnLight();
            } else if (input == 2) {
                lamp.turnDimLight();
            } else {
                System.out.println("Wrong input");
                break;
            }
        }
    }
}
