import javax.swing.*;
public class sframerunnable extends JFrame{
    sframerunnable(){
        setTitle("Swing");
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }
        public static void main(String[] args) {
            SwingUtilities.invokeLater(
                new Runnable(){
                    public void run(){
                        new sframerunnable();
                    }
                }
            );
        }
}