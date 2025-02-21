package com.aurionpro.model;

class Board {
    private char[][] grid;

    public Board() {
        grid = new char[3][3];
        reset();
    }

    public boolean placeMark(int row, int col, char mark) 
    {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && grid[row][col] == '-') 
        {
            grid[row][col] = mark;
            return true;
        }
        return false;
    }

    public boolean checkWinner() 
    {
        for (int i = 0; i < 3; i++) 
        {
            if (grid[i][0] != '-' && grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2]) return true;
            if (grid[0][i] != '-' && grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i]) return true;
        }
        // check diagonally 
        return (grid[0][0] != '-' && grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) ||
               (grid[0][2] != '-' && grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]);
    }

    public boolean isFull() 
    {
        for (char[] row : grid) 
        {
            for (char cell : row) 
            {
                if (cell == '-') return false;
            }
        }
        return true;
    }

    public void reset() 
    {
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                grid[i][j] = '-';
            }
        }
    }

    public void display() 
    {
        for (char[] row : grid) 
        {
            for (char cell : row) 
            {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
    
}