package SmitProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FirstPage extends JFrame implements ActionListener {




    JButton B1,B2;
    JFrame f1;
    JLabel l;
    public FirstPage(){
        f1 = new JFrame("WELCOME TO SMIT PROJECT");
        B1 = new JButton("ENTER");
        B2 = new JButton("EXIT");
        B1.setBounds(20,540,208,65);
        B1.setBackground(new Color(90,155,223));
        B2.setBounds(615, 540,208,65);
        B2.setBackground(new Color(237,125,59));
        ImageIcon manu = new ImageIcon("D:\\SEM\\SEM2\\Java\\Adders Jframe project\\FirstPage.JPG");
        l= new JLabel(manu);

        B1.addActionListener(this);
        B2.addActionListener(this);

        f1.add(B1);
        f1.add(B2);
        f1.add(l);

        f1.setSize(850,770);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == B1){
            f1.setVisible(false);
            Frame1 F=new Frame1();

        }
        if(e.getSource() == B2){

            f1.setVisible(false);
            new end();
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new FirstPage();
    }

}
