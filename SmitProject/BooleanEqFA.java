package SmitProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BooleanEqFA extends JFrame implements ActionListener {
    JFrame f1;
    JLabel l1;
    JButton b1,b2;
    BooleanEqFA(){
        f1 = new JFrame("BooleanEquation");
        b1= new JButton("Back");
        b2 = new JButton("Exit");

        b1.setBounds(20,540,208,65);
        b1.setBackground(new Color(90,155,223));
        b2.setBounds(615,540,208,65);
        b2.setBackground(new Color(237,125,59));

        b1.addActionListener(this);
        b2.addActionListener(this);

        ImageIcon m = new ImageIcon("D:\\SEM\\SEM2\\Java\\Adders Jframe project\\FullBoolean.JPG");
        l1 = new JLabel(m);
        l1.setLocation(0,0);


        f1.add(b1);
        f1.add(b2);
        f1.add(l1);

        f1.setSize(850, 770);

        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BooleanEqFA();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            f1.setVisible(false);
            new FULLADDER();

        }
        if(e.getSource() == b2){
            f1.setVisible(false);
            new end();
        }
    }
}









