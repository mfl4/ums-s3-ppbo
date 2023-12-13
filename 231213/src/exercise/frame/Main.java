package exercise.frame;

public class Main extends javax.swing.JFrame {
    public Main() {
        super("Learn about the GUI");
        setSize(300, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new Main();
    }
}
