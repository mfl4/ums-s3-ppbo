package assignment.review;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import exercise.frame.Main;

public class ReviewGUI {
    public static void main(String[] args) {
        Main main = new Main();
        main.setSize(500, 500);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Modul Praktikum Pemrograman Berorientasi Objek jelas dan mudah.");

        String[] options = { "Sangat tidak setuju", "Tidak setuju", "Kurang setuju", "Setuju", "Sangat setuju" };
        JComboBox<String> comboBox = new JComboBox<String>(options);

        panel.add(label);
        panel.add(comboBox);
        main.add(panel);
        main.setVisible(true);
    }
}
