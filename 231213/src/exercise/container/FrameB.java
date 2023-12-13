package exercise.container;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class FrameB extends javax.swing.JFrame {
    public FrameB() {
        super("Container");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        FrameB frameB = new FrameB();
        JPanel panel = new JPanel();
        URL img = FrameB.class.getResource("mfl4.png");

        JButton OKButton = new JButton("OK");
        JButton imgButton = new JButton(new ImageIcon(img));

        panel.add(OKButton);
        panel.add(imgButton);
        frameB.add(panel);
        frameB.setVisible(true);

    }
}
