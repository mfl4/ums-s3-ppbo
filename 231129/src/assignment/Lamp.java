package assignment;

import experiment.LampActivity;

public class Lamp implements LampActivity {
    public int lampStatus;
    static final int LIGHT_DIM = 2;

    @Override
    public void turnOffLight() {
        if (lampStatus == 0) {
            System.out.println("*\nThe light are off\n*");
        } else if (lampStatus == 1) {
            lampStatus = -1;
            System.out.println("*\nThe light have been turned off\n*");
        } else if (lampStatus == 2) {
            lampStatus = -2;
            System.out.println("*\nThe light have been turned off\n*");
        }
    }

    @Override
    public void turnOnLight() {
        if (lampStatus == 1) {
            System.out.println("*****\nThe light are on\n*****");
        } else if (lampStatus == 0) {
            lampStatus = +1;
            System.out.println("*\nThe light have been turned on\n*");
        } else if (lampStatus == 2) {
            lampStatus = -1;
            System.out.println("*\nThe light have been turned on\n*");
        }
    }

    public void turnDimLight() {
        if (lampStatus == 2) {
            System.out.println("***\nThe light are dim\n***");
        } else if (lampStatus == 0) {
            lampStatus = +2;
            System.out.println("***\nThe light have been turned dim\n***");
        } else if (lampStatus == 1) {
            lampStatus = +1;
            System.out.println("***\nThe light have been turned dim\n***");
        }
    }

    public int setSwitch(int switcher) {
        return lampStatus = switcher;
    }
}