import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IntroPanel extends JPanel {
    public IntroPanel() {
        setBackground(Color.green);
        JLabel l1 = new JLabel("Tampilan Layout untuk GUI.");
        JLabel l2 = new JLabel("Pilih tiap tab untuk melihat karakteristiknya ");
        add(l1);
        add(l2);
    }
}