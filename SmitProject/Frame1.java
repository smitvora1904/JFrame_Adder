package SmitProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame1 extends JFrame implements ActionListener

{
    JFrame f1;
    JButton b1,b2,b3,b4;
    JLabel l;
    Frame1(){

        f1 = new JFrame("Select the Operation");
        b1=new JButton("Half Adder");
        b2=new JButton("Full Adder");
        b3 = new JButton("BACK");
        b4 = new JButton("EXIT");

        //f1.setLayout(null);
        f1.setSize(850,770);
        b1.setBounds(300,200,250,75);
        b1.setBackground(Color.yellow);
        b2.setBounds(300,370,250,75);
        b2.setBackground(Color.yellow);
        b3.setBounds(20,540,208,65);
        b3.setBackground(new Color(90,155,223));
        b4.setBounds(615,540,208,65);
        b4.setBackground(new Color(237,125,59));
        ImageIcon manu = new ImageIcon("D:\\SEM\\SEM2\\Java\\Adders Jframe project\\slide.JPG");
        l= new JLabel(manu);


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);


        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(l);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == b1){
            f1.setVisible(false);
            new HalfAdderDescription();

        }
        if(e.getSource() == b2){
            f1.setVisible(false);
            new FullAdderDescription();


        }
        if(e.getSource() == b3){
            f1.setVisible(false);
            new FirstPage();

        }
        if(e.getSource() == b4){
            f1.setVisible(false);
            new end();

        }
    }

    public static void main (String[]args){
        new Frame1();
    }


}