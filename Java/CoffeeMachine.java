
package javaapplication33;


import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

//Chetan

public class CoffeeMachine extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    JLabel l1, l2, l3, l4, l5, l6, l7;

    JButton b1, b2;

    JTextField t1, t2, t3;

    JCheckBox cream, raw, espresso;

    private JRadioButton small;

    private JRadioButton large;

    private JRadioButton medium;

    private ButtonGroup group;

    JMenuBar menuBar;

    JMenu mnFile = new JMenu("File");

    JMenuItem mntmExit = new JMenuItem("Exit");

    JMenu mnHelp = new JMenu("Help");

    JMenuItem mntmAbout = new JMenuItem("About");

    CoffeeMachine() {

        menuBar = new JMenuBar();

        l1 = new JLabel(" Customer Name");

        l2 = new JLabel(" amount to pay");

        l3 = new JLabel(" ");

        l4 = new JLabel(" ");

        l5 = new JLabel(" ");

        l6 = new JLabel(" ");

        l7 = new JLabel(" ");

        b1 = new JButton("COMPUTE");

        b2 = new JButton("EXIT");

        t1 = new JTextField(10);

        t2 = new JTextField(10);

        small = new JRadioButton("small", true);

        medium = new JRadioButton("medium", true);

        large = new JRadioButton("large", false);

        group = new ButtonGroup();

        group.add(small);

        group.add(medium);

        group.add(large);

        cream = new JCheckBox("cream", false);

        raw = new JCheckBox("raw sugar", false);

        espresso = new JCheckBox("espresso shot", false);

        add(l1);

        add(t1);

        add(l7);

        add(small);

        add(medium);

        add(cream);

        add(large);

        add(raw);

        add(l3);

        add(espresso);

        add(l2);

        add(t2);

        add(l5);

        add(l6);

        add(b1);

        add(b2);

        add(menuBar);

        menuBar.add(mnFile);

        mnFile.add(mntmExit);

        menuBar.add(mnHelp);

        mnHelp.add(mntmAbout);

        setJMenuBar(menuBar);

        b1.addActionListener(this);

        

// the Help menu item listener

        mntmAbout.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {

                JOptionPane.showMessageDialog(null, "Your Message", "About", JOptionPane.PLAIN_MESSAGE);

            }

        });

        setSize(500, 300);

        setLayout(new GridLayout(7, 2));

        setTitle("Coffee Machine");

    }

    public void actionPerformed(ActionEvent ae) {

        float price = 0;

        String a = "", message = "";

        if (cream.isSelected() == true) {

            price = price + 3;

        }

        if (raw.isSelected() == true) {

// perform a task ...

            price = price + 1;

        }

        if (espresso.isSelected() == true) {

// perform a task ...

            price = price + 10;

        }

        if (small.isSelected() == true) {

            System.out.println("small");

// perform a task ...

            price = price + 10;

        }

        if (medium.isSelected() == true) {

            System.out.println("medium");

// perform a task ...

            price = price + 15;

        }

        if (large.isSelected() == true) {

            System.out.println("large");

// perform a task ...

            price = price + 20;

        }

        if (ae.getSource() == b1) {

            a = t1.getText();

            if (a.charAt(0) >= '0' && a.charAt(0) <= '9') {

                JOptionPane.showMessageDialog(null, "Please enter valid name ", "", JOptionPane.PLAIN_MESSAGE);

                revalidate();

            } else {

                message = "your order: " + a + " $" + price + ", Thank you " + a;

                t2.setText(String.valueOf(price));

                JOptionPane.showMessageDialog(null, "Summary: \n" + message, "Order Summary",

                        JOptionPane.PLAIN_MESSAGE);

            }

        }

    }

    public static void main(String args[]) {

        CoffeeMachine a = new CoffeeMachine();

        a.setVisible(true);

        a.setLocation(200, 200);

    }

}