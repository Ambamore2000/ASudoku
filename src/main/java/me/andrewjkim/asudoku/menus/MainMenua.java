package me.andrewjkim.asudoku.menus;

import me.andrewjkim.asudoku.ASudoku;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MainMenua {

    //Main Menu: https://gyazo.com/3588061750c23a39f9e55e4c5415929a
    //Game Menu: https://gyazo.com/9ac25cb59213cb468b56a3361281706c


    //public MainMenua() {
    //    initializeMenu(ASudoku.menuFrame);
    //}

    private void initializeMenu(JFrame menuFrame) {

        //TITLE
        JTextField title = new JTextField("SuDoKu");
        title.setEditable(false);
        title.setPreferredSize(new Dimension(400, 100));
        title.setHorizontalAlignment(JTextField.CENTER);
        title.setFont(new Font("Arial", Font.PLAIN, 100));
        title.setHighlighter(null);
        title.setBorder(null);
        title.setForeground(Color.DARK_GRAY);
        title.setBackground(Color.WHITE);

        menuFrame.getContentPane().add(title, BorderLayout.NORTH);

        /*
        //LOGO
        JLabel logo = new JLabel(new ImageIcon(new ImageIcon("src\\main\\resources\\icon.png").getImage().getScaledInstance(100, 100, Image.SCALE_AREA_AVERAGING)));

        menuFrame.getContentPane().add(logo, BorderLayout.CENTER);*/

        JPanel menuOptions = new JPanel();

        //PLAY BUTTON
        JButton playButton = new JButton("PLAY");
        playButton.setPreferredSize(new Dimension(400, 120));
        playButton.setHorizontalAlignment(JTextField.CENTER);
        playButton.setFont(new Font("Arial", Font.PLAIN, 120));
        playButton.setForeground(Color.WHITE);
        playButton.setBackground(Color.MAGENTA);

        ActionListener playButtonListener = actionEvent -> {
            GameMenu gameMenu = new GameMenu();
        };
        playButton.addActionListener(playButtonListener);

        menuOptions.add(playButton, BorderLayout.SOUTH);

        menuFrame.getContentPane().add(menuOptions, BorderLayout.SOUTH);

        menuFrame.setVisible(true);
    }
}
