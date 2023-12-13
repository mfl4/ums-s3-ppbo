package exercise.textfieldnpasswordfield;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import exercise.frame.Main;

public class TextFieldDemo {
    public static void main(String[] args) {
        Main main = new Main();
        main.setSize(500, 500);
        JLabel name = new JLabel("Name : ");
        JLabel password = new JLabel("Password : ");

        JTextField nameInput = new JTextField(15);
        JPasswordField passwordInput = new JPasswordField(15);
        JPanel panel = new JPanel();

        panel.add(name);
        panel.add(nameInput);
        panel.add(password);
        panel.add(passwordInput);
        main.add(panel);
    }
}
