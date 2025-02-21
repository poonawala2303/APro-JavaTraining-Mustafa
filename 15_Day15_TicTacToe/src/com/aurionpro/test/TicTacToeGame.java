package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.TicTacToeFacade;
public class TicTacToeGame 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        TicTacToeFacade game = new TicTacToeFacade();

        while (true) 
        {
            System.out.println("Enter row and column (0-2) to place your mark:");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            game.play(row, col);
        }
    }
}

