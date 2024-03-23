import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

 class login extends JFrame implements ActionListener{

    GridBagConstraints gbc =new GridBagConstraints();
    Frame f = new Frame("Login Page");
    Color c1=Color.RED;
    TextField u,p;

    login(){
        
        f.setVisible(true);
        f.setSize(400,400);
        f.setLayout(new GridBagLayout() );
        Label head = new Label("Login Page");
        gbc.gridx=2;
        gbc.gridy=0;
        gbc.insets=new Insets(5,5,5,5);
        f.add(head,gbc);
        Label l=new Label("User Name");
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.insets=new Insets(5,5,5,5);
        f.add(l,gbc);
        u = new TextField("",20);
        gbc.gridx=2;
        gbc.gridy=1;
        gbc.insets=new Insets(5,5,5,5);
        f.add(u,gbc);
        Label l2 = new Label("Password");
        gbc.gridx=0;
        gbc.gridy=2;
        gbc.insets=new Insets(5,5,5,5);
        f.add(l2,gbc);
        p = new TextField("",20);
        gbc.gridx=2;
        gbc.gridy=2;
        gbc.insets=new Insets(5,5,5,5);
        f.add(p,gbc);
        Button b = new Button("Submit");

        gbc.gridx=2;
        gbc.gridy=5;
        gbc.insets=new Insets(5,5,5,5);
        f.add(b,gbc);
        b.addActionListener(this);


        

    }

    public void actionPerformed(ActionEvent obj){
        String userN = u.getText();
        String Pass = p.getText();
        JLabel l3 = new JLabel();
        
        gbc.gridx=2;
        gbc.gridy=7;
        f.add(l3,gbc);
        if(userN.equals("sailu")&&Pass.equals("100")){
            l3.setText("SuccessFul!");
            l3.setForeground(Color.GREEN);

        }
        else{
            l3.setText("Credentials Incorrect!");
            l3.setForeground(Color.RED);
        }

    }
}
public class Loginform{
    public static void main(String[] args) {
        login obj = new login();
        
    }
}











