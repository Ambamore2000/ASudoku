package me.andrewjkim.asudoku.utils;

import java.util.HashMap;

public class GameManager {

    static HashMap<Integer, Integer> sudokuBoard;

// ATLEAST 17 NUMBERS, SO
// HARD 17
// MEDIUM 33
// EASY 50
    //The idea is to generate a "winning board", and then
    //delete 31 for easy, 48 for medium, 64 for hard
    /*
    _____________     _____
    |111|222|333| --> |123|
    |111|222|333|     |456|
    |111|222|333|     |789|
    _____________     _____
    |444|555|666|
    |444|555|666|
    |444|555|666|
    _____________
    |777|888|999|
    |777|888|999|
    |777|888|999|
    _____________

     */
}
