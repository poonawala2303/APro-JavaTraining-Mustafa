package com.aurionpro.model;

import java.util.Scanner;

public class TicTacToeFacade {
    private Board board;
    private Player player1, player2;
    private Player currentPlayer;

    public TicTacToeFacade() {
        board = new Board();
        player1 = new Player('X');
        player2 = new Player('O');
        currentPlayer = player1;
    }

    public void play(int row, int col) 
    {
    	
        if (board.placeMark(row, col, currentPlayer.getMark())) 
        {
        	Scanner scanner = new Scanner(System.in);
            board.display();
            if (board.checkWinner()) 
            {
                System.out.println("Player " + currentPlayer.getMark() + " wins!");
                resetGame();
                
                System.out.print("\nDo you want to play again ?");
                String choice = scanner.nextLine();
                
                if(choice.equalsIgnoreCase("no"))
                	System.exit(0);
             
                return;
                
            } 
            
            else if (board.isFull()) 
            {
                System.out.println("Game is a draw!");
                resetGame();
                return;
            }
            
            switchPlayer();
        } 
        
        else 
        {
            System.out.println("Invalid move! Try again.");
        }
        
    }

    private void switchPlayer() 
    {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
        
        if(currentPlayer == player1)
        {
        	System.out.println("Player X turn");
        }
        
        else
        {
        	System.out.println("Player O turn");
        }
        
    }

    public void resetGame() {
        board.reset();
        currentPlayer = player1;
        System.out.println("Game reset. Player X starts.");
    }
}
