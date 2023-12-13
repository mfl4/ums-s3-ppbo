package exercise.label;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import exercise.container.FrameB;
import exercise.frame.Main;

public class LabelDemo {
    public static void main(String[] args) {
        Main main = new Main();
        main.setSize(500, 500);
        URL img = FrameB.class.getResource("mfl4.png");
        ImageIcon icon = new ImageIcon(img);

        JLabel label = new JLabel("Label", icon, SwingConstants.CENTER);
        JPanel panel = new JPanel();

        panel.add(label);
        main.add(panel);
    }
}
