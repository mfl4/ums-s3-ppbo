package exercise.radiobuttonncheckbox;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import exercise.frame.Main;

public class RadioButtonDemo {
    public static void main(String[] args) {
        Main main = new Main();
        main.setSize(1000, 100);

        JRadioButton[] teams = new JRadioButton[5];
        teams[0] = new JRadioButton("Sangat tidak setuju");
        teams[1] = new JRadioButton("Tidak setuju");
        teams[2] = new JRadioButton("Kurang setuju");
        teams[3] = new JRadioButton("Setuju", true);
        teams[4] = new JRadioButton("Sangat Setuju");

        JPanel panel = new JPanel();
        JLabel statement = new JLabel("Modul Praktikum Pemrograman Berorientasi Objek jelas dan mudah.");
        panel.add(statement);

        ButtonGroup group = new ButtonGroup();
        for (int i = 0; i < teams.length; i++) {
            group.add(teams[i]);
            panel.add(teams[i]);
        }

        main.add(panel);
        main.setVisible(true);
    }
}
