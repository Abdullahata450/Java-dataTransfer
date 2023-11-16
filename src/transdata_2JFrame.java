import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class transdata_2JFrame {

    JFrame f,f2;
    JPanel p1;
    JTextField textField;
    JButton b1;
    JLabel label;

    transdata_2JFrame(){
        f=new JFrame("Data Transfer");
        f.setSize(400,200);

        f2=new JFrame("Data Transfer in 2nd JFrame");
        f2.setSize(400,200);


        textField=new JTextField(13);
        b1=new JButton("Data transfer");
        label=new JLabel("Enter Data");
        p1=new JPanel(new FlowLayout());          

        p1.add(textField);
        p1.add(b1);
        p1.add(label);

        p1.setBackground(Color.LIGHT_GRAY);

        f.add(p1,BorderLayout.NORTH);

      f.setVisible(true);

     b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            String data=textField.getText();
            transdata(data);
        }
     });

    }
    public void transdata(String Data){
        JLabel label2=new JLabel("The Transfer data is: "+Data);
        JPanel p2=new JPanel(new FlowLayout());
        p2.add(label2);
        f2.add(p2,BorderLayout.CENTER);
        f2.setVisible(true);
        p2.setBackground(Color.yellow);
        
    }

    public static void main(String[] args) {
        new transdata_2JFrame();
    }
}