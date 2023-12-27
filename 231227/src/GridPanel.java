import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridLayout;

public class GridPanel extends JPanel {
    public GridPanel() {
        setLayout(new GridLayout(2, 3));
        setBackground(Color.PINK);
        JButton b1 = new JButton("BUTTON 1");
        JButton b2 = new JButton("BUTTON 2");
        JButton b3 = new JButton("BUTTON 3");
        JButton b4 = new JButton("BUTTON 4");
        JButton b5 = new JButton("BUTTON 5");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
    }
}