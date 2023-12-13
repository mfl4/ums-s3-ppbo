package exercise.button;

import java.awt.Container;
import javax.swing.JButton;

public class FrameA extends javax.swing.JFrame {
    public FrameA() {
        super("Button");
        setSize(100, 50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        FrameA frameA = new FrameA();
        Container container = frameA.getContentPane();
        JButton OKButton = new JButton("OK");
        container.add(OKButton);
    }
}
