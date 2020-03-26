package me.andrewjkim.asudoku;

import me.andrewjkim.asudoku.menus.MainMenu;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 *
 * The idea:
 * I worked on a Sudoku game on code.org as my submission for my AP Computer Science Principles class.
 * Interestingly enough, I failed to actually finish with making a functional game.
 * Receiving a 3 on the AP test, I knew for a fact I passed the Exam portion and completely bombed the programming portion.
 * Here's to finishing what I started.
 *
 * My failed project:
 * https://studio.code.org/projects/applab/3z2ZUpnpJW0L8lYo17SlW5bLgNwSypopALcIqKZbg8A
 *
 * @author AndrewJKim
 * @version %I%, %G%
 * @since 0.1-SNAPSHOT
 */

public class ASudoku {

    public static JFrame menuFrame;

    public static void main(String[] args) throws IOException {

        initializeMenuFrame();

        MainMenu mainMenu = new MainMenu();
    }

    private static void initializeMenuFrame() throws IOException {
        menuFrame = new JFrame("ASudoku");

        menuFrame.setIconImage(ImageIO.read(new File("src\\main\\resources\\icon.png")));

        menuFrame.getContentPane().setBackground(Color.WHITE);
        menuFrame.setSize(400, 600);
    }

}
