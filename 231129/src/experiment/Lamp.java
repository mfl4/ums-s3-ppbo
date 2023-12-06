package experiment;

public class Lamp implements LampActivity {
    public int lampStatus;

    @Override
    public void turnOffLight() {
        if (lampStatus == 0) {
            System.out.println("The light are off");
        } else if (lampStatus == 1) {
            lampStatus = -1;
            System.out.println("The light have been turned off");
        }
    }

    @Override
    public void turnOnLight() {
        if (lampStatus == 1) {
            System.out.println("The light are on\n***");
        } else {
            lampStatus = +1;
            System.out.println("The light have been turned on");
        }
    }

    public int setSwitch(int switcher) {
        return lampStatus = switcher;
    }
}