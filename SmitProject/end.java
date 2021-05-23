package SmitProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class end extends JFrame implements ActionListener {
    JButton B1;
    JFrame f1;
    JLabel l;
    end(){
        f1 = new JFrame("Thank You");
        B1 = new JButton("EXIT");

        B1.setBounds(615, 540,208,65);
        B1.setBackground(new Color(237,125,59));
        ImageIcon manu = new ImageIcon("D:\\SEM\\SEM2\\Java\\Adders Jframe project\\end.JPG");
        l= new JLabel(manu);

        B1.addActionListener(this);

        f1.add(B1);
        f1.add(l);

        f1.setSize(850,770);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == B1){
            f1.setVisible(false);

        }

    }

    public static void main(String[] args) {
        new end();
    }
}
