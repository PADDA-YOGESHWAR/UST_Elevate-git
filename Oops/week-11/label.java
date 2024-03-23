import javax.swing.*;
import java.awt.*;

public class label {
    label(){
        JFrame f = new JFrame("SWING LABEL");
        //ImageIcon im = new ImageIcon("download.png");
        //JLabel l = new JLabel(im);
        //l.setText("This is label");
        JLabel ll = new JLabel("Left",JLabel.LEFT);
        JLabel lr = new JLabel("RIGHT",JLabel.RIGHT);
        JLabel lc = new JLabel("CENTER",JLabel.CENTER);
        JLabel lt = new JLabel("TRAILING",JLabel.TRAILING);
        JLabel le = new JLabel("LEADING",JLabel.LEADING);
        lr.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        ll.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        lc.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        lt.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        le.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        f.add(ll);f.add(lr);f.add(lc);f.add(lt);f.add(le);
        f.setSize(200,200);
        f.setVisible(true);
        f.getContentPane().setLayout(new GridLayout(5,1));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        new label();
    }
}
