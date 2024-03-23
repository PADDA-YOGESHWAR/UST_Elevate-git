import javax.swing.*;
public class frame {
    frame(){
        JFrame f = new JFrame("Swing");
        JButton b = new JButton("SUBMIT");
        b.setBounds(50,50,100,30);
        f.add(b);
        f.setLayout(null);
        f.setSize(200,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new frame();
    }
}
