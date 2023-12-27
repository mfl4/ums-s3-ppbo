import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class LayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout Manager Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTabbedPane tabPane = new JTabbedPane();
        tabPane.addTab("Intro", new IntroPanel());
        tabPane.addTab("Flow", new FlowPanel());
        tabPane.addTab("Border", new BorderPanel());
        tabPane.addTab("Grid", new GridPanel());
        tabPane.addTab("Box", new BoxPanel());
        frame.getContentPane().add(tabPane);
        frame.pack();
        frame.setVisible(true);
    }
}