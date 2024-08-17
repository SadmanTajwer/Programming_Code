
package javaapplication37;


import javax.swing.*;

import java.awt.event.*;

import java.awt.*;

public class automativeShop extends JFrame implements ActionListener, ItemListener

{

    public static JFrame f;

    public static JLabel l1,l2,l3,l4;

    public static JButton b1;

    public static JTextField tf;

    public static JCheckBox c1;

    public static JCheckBox c2;

    public static JCheckBox c3;

    public static JCheckBox c4;

    public static JCheckBox c5;

    public static int total=0;

    public void actionPerformed(ActionEvent e1)

    {

        String str=tf.getText();

        l3.setText("Name : "+str);

        l4.setText("Total Cost : $"+total+".00");



    }

    public void itemStateChanged(ItemEvent e)

    {

        if (e.getSource() == c1) {

            if (e.getStateChange() == 1)

                total=total+26;

        }

        if (e.getSource() == c2) {

            if (e.getStateChange() == 1)

                total=total+30;

        }

        if (e.getSource() == c3) {

            if (e.getStateChange() == 1)

                total=total+80;

        }

        if (e.getSource() == c4) {

            if (e.getStateChange() == 1)

                total=total+15;

        }

        if (e.getSource() == c5) {

            if (e.getStateChange() == 1)

                total=total+20;

        }



    }

    public static void main(String[] args) {

        automativeShop a=new automativeShop();

        f= new JFrame("Shop");

        b1=new JButton("Submit");

        l1=new JLabel("Customer's Name : ");

        l2=new JLabel("Choose services   : ");

        l3=new JLabel();

        l4=new JLabel();



        c1 = new JCheckBox("Oil Change for $26.00");

        c2 = new JCheckBox("Radiator flush for $30.00");

        c3 = new JCheckBox("Transmission flush for $80.00");

        c4 = new JCheckBox("Inspection for $15.00");

        c5 = new JCheckBox("Tire Rotation for $20.00");

        tf=new JTextField();



        l1.setBounds(40,30, 150,30);

        tf.setBounds(166,36, 120,20);

        l2.setBounds(40,55, 140,30);

        c1.setBounds(160,55, 200,30);

        c2.setBounds(160,85, 200,30);

        c3.setBounds(160,115, 200,30);

        c4.setBounds(160,145, 200,30);

        c5.setBounds(160,175, 200,30);



        b1.setBounds(220,215, 100,30);

        b1.addActionListener(a);

        c1.addItemListener(a);

        c2.addItemListener(a);

        c3.addItemListener(a);

        c4.addItemListener(a);

        c5.addItemListener(a);



        l3.setBounds(190,245, 140,30);

        l4.setBounds(190,275, 140,30);

        f.add(b1);

        f.add(l1);

        f.add(l2);

        f.add(l3);

        f.add(l4);

        f.add(c1);

        f.add(c2);

        f.add(c3);

        f.add(c4);

        f.add(c5);

        f.add(tf);

        f.setSize(500,500);

        f.setLayout(null);

        f.setVisible(true);

    }

}