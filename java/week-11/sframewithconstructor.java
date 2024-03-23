import javax.swing.*;
public class sframewithconstructor extends JFrame{
        sframewithconstructor(){
        setTitle("Swing");
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        public static void main(String[] args) {
            new sframewithconstructor();
}
}