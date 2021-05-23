package SmitProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HALFADDER extends JFrame implements ActionListener{
    JFrame f1;
    JButton b1, b2, b3, b4,b5,b6,b7;
    JTextField A, B, xor1,xor2 , and1, and2,sum, carry;
    JLabel l1;

    HALFADDER(){
        f1 = new JFrame("HALF ADDER");


        b1 = new JButton("Back");
        b2 = new JButton("Exit");
        b3 = new JButton("TruthTable");
        b4 = new JButton("Boolean Equation");
        b5 = new JButton("OK");
        b6 = new JButton("Half Adder");
        b7= new JButton("RESET");

        A = new JTextField("");
        B = new JTextField("");
        xor1 = new JTextField("");
        xor2 = new JTextField("");
        and1 = new JTextField("");
        and2 = new JTextField("");
        sum= new JTextField("");
        carry = new JTextField("");

        b1.setBounds(20, 540, 208, 65);
        b1.setBackground(new Color(90, 155, 223));

        b2.setBounds(615, 540, 208, 65);
        b2.setBackground(new Color(237, 125, 59));

        b3.setBounds(250, 540, 150, 65);

        b4.setBounds(425, 540, 150, 65);

        b5.setBounds(25, 450, 100, 50);
        b7.setBounds(150, 450, 100, 50);

        b6.setBounds(275,10,300,75);
        b6.setBackground(Color.green);



        A.setBounds(170,165,40,40);
        B.setBounds(170,215,40,40);
        xor1.setBounds(385,175,30,30);
        xor2.setBounds(385,215,30,30);
        and1.setBounds(390,320,30,30);
        and2.setBounds(390,365,30,30);
        sum.setBounds(675,190,40,40);
        carry.setBounds(675,345,40,40);





        ImageIcon m = new ImageIcon("D:\\SEM\\SEM2\\Java\\Adders Jframe project\\SAdd.JPG");
        l1 = new JLabel(m);
        l1.setLocation(220,220);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b7.addActionListener(this);


        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);
        f1.add(b6);
        f1.add(b7);

        f1.add(A);
        f1.add(B);


        f1.add(xor1);
        f1.add(xor2);

        f1.add(and1);
        f1.add(and2);


        f1.add(sum);
        f1.add(carry);


        f1.add(l1);



        f1.setSize(850, 770);

        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            f1.setVisible(false);
            new HalfAdderDescription();
        }
        if (e.getSource() == b2) {
            f1.setVisible(false);
            new end();
        }
        if (e.getSource() == b3) {
            f1.setVisible(false);
            new SATT();
        }
        if (e.getSource() == b4) {
            f1.setVisible(false);
            new BooleanEqSA();
        }
        if (e.getSource() == b5){
            int A0,B0,sum0,carry0;
            A0=Integer.parseInt(A.getText());
            B0=Integer.parseInt(B.getText());

            if(A0!=0){
                A0=1;
            }

            if(B0!=0){
                B0=1;
            }

            xor1.setText(Integer.toString(A0));
            xor2.setText(Integer.toString(B0));

            and1.setText(Integer.toString(A0));
            and2.setText(Integer.toString(B0));

            sum0=A0^B0;
            carry0=A0&B0;
            sum.setText(Integer.toString(sum0));
            carry.setText(Integer.toString(carry0));

        }
        if (e.getSource() == b7){
            //A, B, xor1,xor2 , and1, and2,sum, carry
            A.setText("");
            B.setText("");
            xor1.setText("");
            xor2.setText("");
            and1.setText("");
            and2.setText("");
            sum.setText("");
            carry.setText("");
        }

    }

    public static void main(String[] args) {
        new HALFADDER();
    }
}





