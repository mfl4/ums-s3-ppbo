package assignment.colorchange;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeGUI extends JFrame {
    private JPanel mainPanel;
    private JMenuBar menuBar;
    private JMenu colorMenu;
    private JMenuItem[] colorItems;

    public ColorChangeGUI() {

        super("Color Change GUI");

        mainPanel = new JPanel();
        setContentPane(mainPanel);

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        colorMenu = new JMenu("Colors");
        menuBar.add(colorMenu);

        String[] colorOptions = { "Red", "Green", "Blue", "Custom Color" };
        colorItems = new JMenuItem[colorOptions.length];

        ActionListener colorChangeListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JMenuItem source = (JMenuItem) e.getSource();
                if (source.getText().equals("Custom Color")) {
                    Color customColor = JColorChooser.showDialog(ColorChangeGUI.this, "Choose Custom Color",
                            mainPanel.getBackground());
                    if (customColor != null) {
                        mainPanel.setBackground(customColor);
                    }
                } else {
                    mainPanel.setBackground(getColorByName(source.getText()));
                }
            }
        };

        for (int i = 0; i < colorOptions.length; i++) {
            colorItems[i] = new JMenuItem(colorOptions[i]);
            colorItems[i].addActionListener(colorChangeListener);
            colorMenu.add(colorItems[i]);

            if (i < colorOptions.length - 1) {
                colorMenu.addSeparator();
            }
        }

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private Color getColorByName(String colorName) {
        switch (colorName) {
            case "Red":
                return Color.RED;
            case "Green":
                return Color.GREEN;
            case "Blue":
                return Color.BLUE;
            default:
                return mainPanel.getBackground();
        }
    }

    public static void main(String[] args) {
        new ColorChangeGUI();
    }
}
