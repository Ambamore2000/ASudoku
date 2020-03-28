package me.andrewjkim.asudoku.menus;

import me.andrewjkim.asudoku.utils.GameManager;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class MainMenu extends JFrame {

    public MainMenu() {
        initializeMenu();
    }

    private void initializeMenu() {
        super.setTitle("SuDoKu");
        super.setBackground(Color.WHITE);
        super.setSize(400, 600);
        try {
            super.setIconImage(ImageIO.read(new File("src\\main\\resources\\icon.png")));
        } catch (IOException e) {
            System.out.println("Could not find icon.png"); //TODO Better error messages?
            e.printStackTrace();
        }
        super.setVisible(true);

        //TODO delete
        initializeGameMenu();
    }

    private void initializeMainMenu() {

    }

    private void initializeGameMenu() {
        GameManager gameManager = new GameManager();
    }
}
