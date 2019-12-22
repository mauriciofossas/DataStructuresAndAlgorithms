package dataStructures;

import java.util.HashSet;
import java.util.Set;

public class validSudoku {
	/*
Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.

Note:

-A Sudoku board (partially filled) could be valid but is not necessarily solvable.
-Only the filled cells need to be validated according to the mentioned rules.
-The given board contain only digits 1-9 and the character '.'.
-The given board size is always 9x9.
	 */
	public boolean isValidSudoku(char[][] board) {
        Set<Character> rows = new HashSet<Character>();
        for (int i = 0; i < board.length; ++i){
            rows.clear();
            for (int j = 0; j < board[i].length; ++j){
                if(board[i][j]!= '.'){
                    if(rows.add(board[i][j])==false){
                        return false;
                    }   
                }
            }
        }
        Set<Character> columns = new HashSet<Character>();
        for (int i = 0; i < board.length; ++i){
            columns.clear();
            for (int j = 0; j < board[i].length; ++j){
                if(board[j][i]!= '.'){
                    if(columns.add(board[j][i])==false){
                        return false;
                    }   
                }
            }
        }
        Set<Character> boxes = new HashSet<Character>();
        int rowBox = 0;
        int box = 0;
        int colBox = 0;
        while(box < 9) {
            for (int i = rowBox; i < rowBox + 3; ++ i){
                for (int j = colBox; j < colBox + 3; ++j){
                    if(board[i][j]!= '.'){
                        if(boxes.add(board[i][j])==false){
                            return false;
                        }   
                    }
                }
            }
            box = box+1;
            if(box%3==0){
                rowBox=rowBox+3;
            }
            boxes.clear();
            if(colBox < 6){
                colBox = colBox + 3;
            } else{
                colBox = 0;
            }
        }
        return true;
    }
}
