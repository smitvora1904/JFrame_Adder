package SmitProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FULLADDER extends JFrame implements ActionListener {
    JFrame f1;
    JButton b1, b2, b3, b4,b5,b6,b7;
    JTextField A, B, C, xor11,xor12 , and11, and12, xor21, xor22, and21, and22, xor1out, and1out, xor2out, and2out, or1,or2,sum, carry;
    JLabel l1;

    FULLADDER() {

        f1 = new JFrame("FULL ADDER");


        b1 = new JButton("Back");
        b2 = new JButton("Exit");
        b3 = new JButton("TruthTable");
        b4 = new JButton("Boolean Equation");
        b5 = new JButton("OK");
        b6 = new JButton("Full Adder");
        b7 = new JButton("Reset");



        A = new JTextField("");
        B = new JTextField("");
        C = new JTextField("");

        xor11 = new JTextField("");
        xor12 = new JTextField("");

        and11 = new JTextField("");
        and12 = new JTextField("");

        xor21 = new JTextField("");
        xor22 = new JTextField("");

        and21 = new JTextField("");
        and22 = new JTextField("");

        xor1out= new JTextField("");
        and1out= new JTextField("");

        xor2out = new JTextField("");
        and2out = new JTextField("");

        or1 = new JTextField("");
        or2 = new JTextField("");

        sum = new JTextField("");
        carry = new JTextField("");



        //f1.setLayout(null);
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







        A.setBounds(80, 105, 40, 40);
        B.setBounds(80, 260, 40, 40);
        C.setBounds(80, 370, 40, 40);

        xor11.setBounds(230, 120, 20, 20);
        xor12.setBounds(230, 170, 20, 20);



        and11.setBounds(235, 275, 20, 20);
        and12.setBounds(235, 330, 20, 20);

        xor21.setBounds(430, 145, 20, 20);
        xor22.setBounds(430, 195, 20, 20);


        and21.setBounds(435, 280, 20, 20);
        and22.setBounds(435, 330, 20, 20);

        xor1out.setBounds(340, 145, 20, 20);
        and1out.setBounds(340, 305, 20, 20);

        xor2out.setBounds(540, 170, 20, 20);
        and2out.setBounds(540, 305, 20, 20);

        or1.setBounds(613, 290, 20, 20);
        or2.setBounds(613, 340, 20, 20);

        sum.setBounds(615, 160, 40, 40);
        carry.setBounds(790, 300, 40, 40);





        ImageIcon m = new ImageIcon("D:\\SEM\\SEM2\\Java\\Adders Jframe project\\FAdd.JPG");
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
        f1.add(C);

        f1.add(xor11);
        f1.add(xor12);

        f1.add(and11);
        f1.add(and12);

        f1.add(xor21);
        f1.add(xor22);

        f1.add(and21);
        f1.add(and22);

        f1.add(xor1out);
        f1.add(and1out);

        f1.add(xor2out);
        f1.add(and2out);

        f1.add(or1);
        f1.add(or2);

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
            new FullAdderDescription();
        }
        if (e.getSource() == b2) {
            f1.setVisible(false);
            new end();
        }
        if (e.getSource() == b3) {
            f1.setVisible(false);
            new FATT();
        }
        if (e.getSource() == b4) {
            f1.setVisible(false);
            new BooleanEqFA();
        }
        if (e.getSource() == b5) {
            int A0,B0,C0, xor1out0, and1out0, xor2out0, and2out0, carry0;
            A0=Integer.parseInt(A.getText());
            B0=Integer.parseInt(B.getText());
            C0=Integer.parseInt(C.getText());

            if(A0!=0){
                A0=1;
            }

            if(B0!=0){
                B0=1;
            }

            if(C0!=0){
                C0=1;
            }


            xor11.setText(Integer.toString(A0));
            xor12.setText(Integer.toString(B0));

            and11.setText(Integer.toString(B0));
            and12.setText(Integer.toString(A0));

            xor1out0=A0^B0;
            xor1out.setText(Integer.toString(xor1out0));

            and1out0=A0&B0;
            and1out.setText(Integer.toString(and1out0));

            xor21.setText(Integer.toString(xor1out0));
            xor22.setText(Integer.toString(C0));
            and21.setText(Integer.toString(xor1out0));
            and22.setText(Integer.toString(C0));

            xor2out0=xor1out0^C0;
            and2out0=xor1out0&C0;

            xor2out.setText(Integer.toString(xor2out0));
            and2out.setText(Integer.toString(and2out0));

            or1.setText(Integer.toString(and2out0));
            or2.setText(Integer.toString(and1out0));

            carry0=and1out0|and2out0;

            sum.setText(Integer.toString(xor2out0));
            carry.setText(Integer.toString(carry0));




        }
        if(e.getSource()==b7){
            //A, B, C, xor11,xor12 , and11, and12, xor21, xor22, and21, and22, xor1out, and1out, xor2out, and2out, or1,or2,sum, carry
            A.setText("");
            B.setText("");
            C.setText("");
            xor11.setText("");
            xor12.setText("");
            and11.setText("");
            and12.setText("");
            xor21.setText("");
            xor22.setText("");
            and21.setText("");
            and22.setText("");
            xor1out.setText("");
            xor2out.setText("");
            and1out.setText("");
            and2out.setText("");
            or1.setText("");
            or2.setText("");
            sum.setText("");
            carry.setText("");



        }

    }



    public static void main(String[] args) {
        new FULLADDER();
    }


}






