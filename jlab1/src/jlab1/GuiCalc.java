/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlab1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*

public class GuiCalc implements ActionListener {
private JFrame frame;
private JTextField xfield;
private JLabel rslt;
private JButton computeButton;
public GuiCalc() {
frame = new JFrame();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(new FlowLayout());
xfield = new JTextField("x", 15);
//frame.add(xfield);
rslt = new JLabel("answer=");
frame.add(rslt);
computeButton = new JButton("Compute");
frame.add(computeButton);
computeButton.addActionListener(this);
frame.pack();
frame.setVisible(true);
}
public void actionPerformed(ActionEvent event) {
String xText = xfield.getText();
rslt.setText("answer=" + xText);
}
}

 */
public class GuiCalc implements ActionListener {
    //Declarations
    private JFrame frame;
    private JTextField xfield, yfield;
    private JLabel rslt;
    private JLabel x, y;

    private JButton computeButton;

    public GuiCalc() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        //X-component
        x = new JLabel("x:");
        xfield = new JTextField("5", 5);
        frame.add(x);
        frame.add(xfield);

        //Y-Component
        y = new JLabel("y:");
        yfield = new JTextField("5", 5);
        frame.add(y);
        frame.add(yfield);

        //Result
        rslt = new JLabel("x*y=");
        frame.add(rslt);

        //Functionality of Button Compute and calling method addActionListener
        computeButton = new JButton("Compute");
        frame.add(computeButton);
        computeButton.addActionListener(this);
        frame.pack();
        frame.setVisible(true);
    }
    
    //Method to be called when compute button is pressed
    public void actionPerformed(ActionEvent event) {
        try {
            String xText = xfield.getText();
            String yText = yfield.getText();
            int Number1 = Integer.parseInt(xText);
            int Number2 = Integer.parseInt(yText);
            int result = Number1 * Number2;
            rslt.setText("x*y=" + result);
        } catch (java.lang.NumberFormatException e) {
            rslt.setText("x*y=" + 0);

        }
    }
}
