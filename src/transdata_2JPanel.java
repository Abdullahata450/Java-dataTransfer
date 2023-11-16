import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class transdata_2JPanel {

    JFrame f;
    JPanel p1,p2;
    JTextField textField;
    JButton b1;
    JLabel label;

    transdata_2JPanel(){
        f=new JFrame("Data Transfer");
        f.setSize(400,200);

        textField=new JTextField(13);
        b1=new JButton("Data transfer");
        label=new JLabel("Enter Data");
        p1=new JPanel(new FlowLayout());          
        p2=new JPanel(new FlowLayout());


        p1.add(textField);
        p1.add(b1);
        p1.add(label);

        p1.setBackground(Color.LIGHT_GRAY);
        p2.setBackground(Color.yellow);

        f.add(p1,BorderLayout.NORTH);
        f.add(p2,BorderLayout.SOUTH);

      f.setVisible(true);

     b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            String data=textField.getText();
            transdata(data);
        }
     });

    }
    public void transdata(String Data){
        JLabel label=new JLabel("The Transfer data is: "+Data);
        p2.removeAll();
        p2.add(label);
        p2.revalidate();
    }

    public static void main(String[] args) {
        new transdata_2JPanel();
    }
}