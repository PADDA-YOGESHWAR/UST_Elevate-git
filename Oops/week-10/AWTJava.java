
//Demonstration a event registration form using AWT.
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegistrationForm extends JFrame implements ActionListener {
    Frame f = new Frame("FRAME");
    GridBagConstraints g = new GridBagConstraints();
    TextField tf1, tf2, tf3, tf4;

    RegistrationForm() {
        f.setLayout(new GridBagLayout());
        Label l = new Label("***EVENT REGISTRATION FORM***");
        g.gridx = 3;
        g.gridy = 0;
        g.insets = new Insets(5, 5, 5, 5);
        f.add(l, g);
        Label name = new Label("Name");
        g.gridx = 0;
        g.gridy = 1;
        g.gridwidth = 2;
        g.fill = GridBagConstraints.HORIZONTAL;
        g.insets = new Insets(5, 5, 5, 5);
        f.add(name, g);
        tf1 = new TextField("", 20);
        g.gridx = 3;
        g.gridy = 1;
        g.insets = new Insets(5, 5, 5, 5);
        f.add(tf1, g);
        Label email = new Label("Email-id");
        g.gridx = 0;
        g.gridy = 2;
        g.gridwidth = 2;
        g.fill = GridBagConstraints.HORIZONTAL;
        g.insets = new Insets(5, 5, 5, 5);
        f.add(email, g);
        tf2 = new TextField("", 20);
        g.gridx = 3;
        g.gridy = 2;
        g.insets = new Insets(5, 5, 5, 5);
        f.add(tf2, g);

        Label regdNo = new Label("Register Number");
        g.gridx = 0;
        g.gridy = 3;
        g.gridwidth = 2;
        g.fill = GridBagConstraints.HORIZONTAL;
        g.insets = new Insets(5, 5, 5, 5);
        f.add(regdNo, g);
        tf3 = new TextField("", 20);
        g.gridx = 3;
        g.gridy = 3;
        g.insets = new Insets(5, 5, 5, 5);
        f.add(tf3, g);
        Label password = new Label("Password");
        g.gridx = 0;
        g.gridy = 4;
        g.gridwidth = 2;
        g.fill = GridBagConstraints.HORIZONTAL;
        g.insets = new Insets(5, 5, 5, 5);
        f.add(password, g);
        tf4 = new TextField("", 20);
        g.gridx = 3;
        g.gridy = 4;
        g.insets = new Insets(5, 5, 5, 5);
        f.add(tf4, g);
        Button b = new Button("Submit");
        g.gridx = 2;
        g.gridy = 5;
        g.gridwidth = 2;
        g.fill = GridBagConstraints.HORIZONTAL;
        g.insets = new Insets(5, 5, 5, 5);
        f.add(b, g);
        b.addActionListener(this);
        f.setSize(1000, 1000);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent obj) {
        JLabel l1 = new JLabel();
        JLabel l2 = new JLabel();
        JLabel l3 = new JLabel();
        JLabel l4 = new JLabel();
        g.gridx = 2;
        g.gridy = 6;
        f.add(l1, g);
        String name = tf1.getText();
        String email = tf2.getText();
        String regdNo = tf3.getText();
        String Password = tf4.getText();
        char ch[] = name.toCharArray();
        for (char c : ch) {
            if (Character.isDigit(c)) {
                l1.setText("Enter a valid name!!!\nName shouldn't contain number");
                break;
            }
        }
        if (email.contains("@") == false) {

            g.gridx = 2;
            g.gridy = 7;
            f.add(l2, g);
            l2.setText("\nYour mail id must have @!!!");
        }
        if ((regdNo.length()) != 10) {
            g.gridx = 2;
            g.gridy = 8;
            f.add(l3, g);
            l3.setText("length of the registration Number should be 10!!!");
        }
        Pattern pattern1 = Pattern.compile(("[a-z]"));
        Matcher matcher1 = pattern1.matcher(Password);
        Pattern pattern2 = Pattern.compile(("[A-Z]"));
        Matcher matcher2 = pattern2.matcher(Password);
        Pattern pattern3 = Pattern.compile(("[0-9]"));
        Matcher matcher3 = pattern3.matcher(Password);
        if ((Password.length()) <= 6 || (matcher1.find() == false) || (matcher2.find() == false)
                || (matcher3.find() == false)) {
            g.gridx = 2;
            g.gridy = 9;
            f.add(l4, g);
            l4.setText("Password should meet these requirements:" + "\n" + "length of the Password should be atleast 6"
                    + "\n"
                    + "Password must contain atleast 1 Uppercase letter,1 lowercase letter,1 digit and a special character");
        }
        if (l1.getText() == "" && l2.getText() == "" && l3.getText() == "" && l4.getText() == "") {
            l1.setText("Successful");
        }
    }
}

public class AWTJava {
    public static void main(String[] args) {
        RegistrationForm obj = new RegistrationForm();
    }
}