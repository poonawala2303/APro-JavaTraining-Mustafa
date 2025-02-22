package com.aurionpro.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardTest 
{
	
	Board board;
	
	private char[][] grid = new char[3][3];
	
	@BeforeEach
	
	void init()
	{
		board = new Board();
	}

	@Test
	void testPlaceMark() {
		assertTrue(board.placeMark(0, 0, 'X'));
	}
	
	// for invalid move
	
	@Test
	void testPlaceMarkInvalid() 
	{
		board.placeMark(0, 0, 'X');
		assertFalse(board.placeMark(0, 0, 'O'));
	}

	@Test
	void testCheckWinner() 
	{
		
//		board.placeMark(0, 0, 'X');
//		board.placeMark(0, 1, 'X');
//		board.placeMark(0, 2, 'X');
		
		board.placeMark(0, 0, 'X');
		board.placeMark(1, 0, 'X');
		board.placeMark(2, 0, 'X');
		
		assertTrue(board.checkWinner());
	}

	@Test
	void testIsFull() 
	{
		
		for(int i =0; i<3; i++)
		{
			for(int j=0 ; j<3; j++)
			{
				board.placeMark(i, j, 'X');
			}
		}
		
		assertTrue(board.isFull());
	}

}
