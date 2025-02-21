package com.aurionpro.model;

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
            board.display();
            if (board.checkWinner()) {
                System.out.println("Player " + currentPlayer.getMark() + " wins!");
                resetGame();
                return;
            } else if (board.isFull()) {
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

    private void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    public void resetGame() {
        board.reset();
        currentPlayer = player1;
        System.out.println("Game reset. Player X starts.");
    }
}
