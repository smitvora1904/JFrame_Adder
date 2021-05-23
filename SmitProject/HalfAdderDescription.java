package SmitProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HalfAdderDescription extends JFrame implements ActionListener {

    JButton B1,B2,B3;
    JFrame f1;
    JLabel l;
    HalfAdderDescription(){
        f1 = new JFrame("Half Adder");
        B1 = new JButton("ENTER");
        B2 = new JButton("EXIT");
        B3 = new JButton("BACK");
        B1.setBounds(20,540,208,65);
        B1.setBackground(new Color(90,155,223));
        B2.setBounds(615,
                540,208,65);
        B2.setBackground(new Color(237,125,59));
        B3.setBounds(20,625,208,65);
        B3.setBackground(new Color(90,155,223));
        ImageIcon manu = new ImageIcon("D:\\SEM\\SEM2\\Java\\Adders Jframe project\\HalfAdderD.JPG");
        l= new JLabel(manu);

        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);

        f1.add(B1);
        f1.add(B2);
        f1.add(B3);
        f1.add(l);

        f1.setSize(850,770);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == B1){
            f1.setVisible(false);
            new HALFADDER();

        }
        if(e.getSource() == B2){
            f1.setVisible(false);
            new end();
        }
        if(e.getSource() == B3){
            f1.setVisible(false);
            new Frame1();

        }
    }

    public static void main(String[] args) {
        new HalfAdderDescription();
    }
}










