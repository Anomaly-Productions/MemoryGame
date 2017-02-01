package com.anomalyproductions.memorygame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


/**
  Anomaly-Productions Presents:
  **************************************
 * Memory Game *
 * *************************************
  Created by Bramwell on 24/01/2017.
 */
public class MemoryGame extends JFrame implements ActionListener{
    private final int SCREEN_WIDTH = 260;
    private final int SCREEN_HEIGHT = 260;
    private final int ROWS = 3;
    private final int COLUMNS = 3;
    private final int BUTTON_GAP = 10;
    private final String DEFAULT_LBL = "---";
    private final String[] PUZZLE_ANS = {"Horse", "Horse", "Cat", "Cat", "Dog", "Dog", "Mouse", "Mouse"};
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    public JPanel pane;
    private Random rand = new Random();
    //Rand.setSeed(System.currentTimeMillis());

    private void setLookAndFeel(){
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        }
        catch (Exception e) {
            System.err.println("Couldn't use the system " + "look and feel: " + e);
        }

    }

    public MemoryGame(){
        super("Memory Game");
        setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        pane = new JPanel();
        GridLayout buttons = new GridLayout(ROWS, COLUMNS, BUTTON_GAP, BUTTON_GAP);
        pane.setLayout(buttons);
        setButtons();
        addButtonsToWindow();
        setActions();

        //Created nine buttons for the grid

    }
    //Creates the buttons for the grid
    public void setButtons() {
        btn1 = new JButton(DEFAULT_LBL);
        btn2 = new JButton(DEFAULT_LBL);
        btn3 = new JButton(DEFAULT_LBL);
        btn4 = new JButton(DEFAULT_LBL);
        btn5 = new JButton(DEFAULT_LBL);
        btn6 = new JButton(DEFAULT_LBL);
        btn7 = new JButton(DEFAULT_LBL);
        btn8 = new JButton(DEFAULT_LBL);
        btn9 = new JButton(DEFAULT_LBL);
    }
    //Adds the action listner to the buttons
    public void setActions(){
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
    }
    //Does what is says
    public void addButtonsToWindow() {
        pane.add(btn1);
        pane.add(btn2);
        pane.add(btn3);
        pane.add(btn4);
        pane.add(btn5);
        pane.add(btn6);
        pane.add(btn7);
        pane.add(btn8);

        add(pane);
        setVisible(true);
    }
    //Sets the unknown label for the eight buttons
    String lbl1 = getLabelData();
    String lbl2 = getLabelData();
    String lbl3 = getLabelData();
    String lbl4 = getLabelData();
    String lbl5 = getLabelData();
    String lbl6 = getLabelData();
    String lbl7 = getLabelData();
    String lbl8 = getLabelData();

    public void actionPerformed(ActionEvent e) {
        /*if (e.getSource()() == btn1) {
            btn1.setText("The button has been clicked!");
            if (btn5.getText().equals(btn1.getText())) {
                btn2.setText("Both buttons are equal!");

            }
        }
        else if (e.getSource()() == btn5) {
            btn5.setText("The button has been clicked!");
            if (btn5.getText().equals(btn1.getText())) {
                btn2.setText("Both buttons are equal!");

            }
        }*/

        if (e.getSource() == btn1){
            btn1.setText(lbl1);
            if (btn1.getText() == null) {
                lbl1 = getLabelData();
                btn1.setText(lbl1);
            }
        }
        else if (e.getSource() == btn2) {
            btn2.setText(lbl2);
            if (btn2.getText() == null) {
                lbl2 = getLabelData();
                btn2.setText(lbl2);
            }
        }
        else if (e.getSource() == btn3) {
            btn3.setText(lbl3);
            if (btn3.getText() == null) {
                lbl3 = getLabelData();
                btn3.setText(lbl3);
            }
        }
        else if (e.getSource() == btn4) {
            btn4.setText(lbl4);
            if (btn4.getText() == null) {
                lbl4 = getLabelData();
                btn4.setText(lbl4);
            }
        }
        else if (e.getSource() == btn5) {
            btn5.setText(lbl5);
            if (btn5.getText() == null) {
                lbl5 = getLabelData();
                btn5.setText(lbl5);
            }
        }
        else if (e.getSource() == btn6) {
            btn6.setText(lbl6);
            if (btn6.getText() == null) {
                lbl6 = getLabelData();
                btn6.setText(lbl6);
            }
        }
        else if (e.getSource() == btn7) {
            btn7.setText(lbl7);
            if (btn7.getText() == null) {
                lbl7 = getLabelData();
                btn7.setText(lbl7);
            }
        }
        else if (e.getSource() == btn8) {
            btn8.setText(lbl8);
            if (btn8.getText() == null) {
                lbl8 = getLabelData();
                btn8.setText(lbl8);
            }
        }

    }

    public String getLabelData() {
        int i = rand.nextInt(PUZZLE_ANS.length);
        String labelData = PUZZLE_ANS[i];

        PUZZLE_ANS[i] = null;
        return labelData;
    }

    public static void main(String[] args) {

        MemoryGame game = new MemoryGame();

    }


}


