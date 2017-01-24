package com.anomalyproductions.memorygame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
  Anomaly-Productions Presents:
  **************************************
 * Memory Game *
 * *************************************
  Created by Bramwell on 24/01/2017.
 */
public class MemoryGame extends JFrame {
    private final int SCREEN_WIDTH = 260;
    private final int SCREEN_HEIGHT = 260;
    private final int ROWS = 3;
    private final int COLUMNS = 3;
    private final int BUTTON_GAP = 10;


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

        JPanel pane = new JPanel();
        GridLayout buttons = new GridLayout(ROWS, COLUMNS, BUTTON_GAP, BUTTON_GAP);
        pane.setLayout(buttons);
        JButton btnOne = new JButton("---");
        JButton btnTwo = new JButton("---");
        JButton btnThree = new JButton("---");
        JButton btnFour = new JButton("---");
        JButton btnFive = new JButton("---");
        JButton btnSix = new JButton("---");
        JButton btnSeven = new JButton("---");
        JButton btnEight = new JButton("---");
        JButton btnNine = new JButton("---");
        pane.add(btnOne);
        pane.add(btnTwo);
        pane.add(btnThree);
        pane.add(btnFour);
        pane.add(btnFive);
        pane.add(btnSix);
        pane.add(btnSeven);
        pane.add(btnEight);
        pane.add(btnNine);
        add(pane);
        setVisible(true);
        //Created nine buttons for the grid
    }

    public void setButtons(){

    }

    public static void main(String[] args) {
        MemoryGame game = new MemoryGame();
    }


}
