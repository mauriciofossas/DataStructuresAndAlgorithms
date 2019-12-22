package dataStructures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DataStructuresTests {

	@Test
	void noRepetition1() {
		NoRepetition nr = new NoRepetition();
		int result = nr.lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxyza");
		assertEquals(26, result);
	}
	@Test
	void noRepetition2() {
		NoRepetition nr = new NoRepetition();
		int result = nr.lengthOfLongestSubstring("aabbccddeeffghijaa");
		assertEquals(6, result);
	}
	@Test
	void sudoku1() {
		validSudoku sudoku = new validSudoku();
		char[][] board = {
					  {'5','3','.','.','7','.','.','.','.'},
					  {'6','.','.','1','9','5','.','.','.'},
					  {'.','9','8','.','.','.','.','6','.'},
					  {'8','.','.','.','6','.','.','.','3'},
					  {'4','.','.','8','.','3','.','.','1'},
					  {'7','.','.','.','2','.','.','.','6'},
					  {'.','6','.','.','.','.','2','8','.'},
					  {'.','.','.','4','1','9','.','.','5'},
					  {'.','.','.','.','8','.','.','7','9'}
					  };
		boolean result = sudoku.isValidSudoku(board);
		assertEquals(true, result);
	}
	@Test
	void sudoku2() {
		validSudoku sudoku = new validSudoku();
		char[][] board = {
					  {'5','3','.','.','7','.','.','.','.'},
					  {'6','.','.','1','9','5','.','.','.'},
					  {'.','9','3','.','.','.','.','6','.'},
					  {'8','.','.','.','6','.','.','.','3'},
					  {'4','.','.','8','.','3','.','.','1'},
					  {'7','.','.','.','2','.','.','.','6'},
					  {'.','6','.','.','.','.','2','8','.'},
					  {'.','.','.','4','1','9','.','.','5'},
					  {'.','.','.','.','8','.','.','7','9'}
					  };
		boolean result = sudoku.isValidSudoku(board);
		assertEquals(false, result);
	}
	@Test
	void anagramTest1() {
		Anagram ana = new Anagram();
		boolean result = ana.isAnagram("below", "elbow");
		assertEquals(true, result);
	}
	@Test
	void anagramTest2() {
		Anagram ana = new Anagram();
		boolean result = ana.isAnagram(" ", " ");
		assertEquals(true, result);
	}
	@Test
	void anagramTest3() {
		Anagram ana = new Anagram();
		boolean result = ana.isAnagram("and", "dam");
		assertEquals(false, result);
	}
	@Test
	void skyline1() {
		keepCitySkyline skyline = new keepCitySkyline();
		int[][] grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
		int result = skyline.maxIncreaseKeepingSkyline(grid);
		assertEquals(35, result);
	}
	@Test
	void skyline2() {
		keepCitySkyline skyline = new keepCitySkyline();
		int[][] grid = {{9,9,9},{9,9,9},{9,9,9}};
		int result = skyline.maxIncreaseKeepingSkyline(grid);
		assertEquals(0, result);
	}
	@Test
	void reverseInt1() {
		reverseInteger reversed = new reverseInteger();
		int result = reversed.reverse(100);
		assertEquals(1, result);
	}
	@Test
	void reverseInt2() {
		reverseInteger reversed = new reverseInteger();
		int result = reversed.reverse(-1233);
		assertEquals(-3321, result);
	}
	@Test
	void atoi1() {
		StringToInteger atoi = new StringToInteger();
		int result = atoi.myAtoi("1");
		assertEquals(1, result);
	}
	@Test
	void atoi2() {
		StringToInteger atoi = new StringToInteger();
		int result = atoi.myAtoi("-5642");
		assertEquals(-5642, result);
	}
	@Test
	void atoi3() {
		StringToInteger atoi = new StringToInteger();
		int result = atoi.myAtoi("10000000000000000000000000");
		assertEquals(Integer.MAX_VALUE, result);
	}
	
}
