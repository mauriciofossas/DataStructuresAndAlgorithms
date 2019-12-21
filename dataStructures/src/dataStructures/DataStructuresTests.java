package dataStructures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DataStructuresTests {

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
}
