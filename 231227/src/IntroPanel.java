import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IntroPanel extends JPanel {
    public IntroPanel() {
        setBackground(Color.RED);
        JLabel l1 = new JLabel("Tampilan Layout untuk GUI.");
        l1.setForeground(Color.WHITE);
        JLabel l2 = new JLabel("Pilih tiap tab untuk melihat karakteristiknya ");
        l2.setForeground(Color.WHITE);
        add(l1);
        add(l2);
    }
}