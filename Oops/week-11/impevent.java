import javax.swing.*;
import java.awt.event.*;
public class impevent implements ActionListener{
    JButton b;
    impevent(){
        JFrame f = new JFrame("Swing");
        b = new JButton("SUBMIT");
        b.setBounds(50,50,100,30);
        f.add(b);
        f.setLayout(null);
        f.setSize(200,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        b.setText("WELCOME");
    }
    public static void main(String[] args){
        new impevent();        
    }
}