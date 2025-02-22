package com.aurionpro.model;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class TicTacToeFacadeTest {

	Board board = new Board();
	private TicTacToeFacade game = new TicTacToeFacade() ;

	@Test
	void testResetGame() 
	{
        game.resetGame();
        assertFalse(board.isFull());
	}

}
