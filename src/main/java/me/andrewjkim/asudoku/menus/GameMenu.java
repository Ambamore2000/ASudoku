package me.andrewjkim.asudoku.menus;

import me.andrewjkim.asudoku.ASudoku;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GameMenu {


    public GameMenu() {
        initializeGame(ASudoku.menuFrame);
    }

    private void initializeGame(JFrame menuFrame) {
        menuFrame.getContentPane().removeAll();

        menuFrame.getContentPane().repaint();
    }
}
