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
	
}
