import javax.swing.*;
import java.awt.event.*;
public class event{
    event(){
        JFrame f = new JFrame("Swing");
        JButton b = new JButton("SUBMIT");
        b.setBounds(50,50,100,30);
        f.add(b);
        f.setLayout(null);
        f.setSize(200,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    b.setText("WELCOME..!");
                } 
            }
        );
    }
    public static void main(String[] args){
        new event();        
    }
}