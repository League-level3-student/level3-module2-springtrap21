package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

	/*
	 * A minimum of 3 tests are required for each method
	 */

	@Test
	public void testLinearSearch() {
		// 1. Use the assertEquals() method to test your linear search method
		String[] words = { "hi", "bye", "hello", "yes", "no" };
		assertEquals(_01_LinearSearch.linearSearch(words, "yes"), 3);
	}
	
	@Test
	public void testLinearSearchDupe() {
		String[] words = { "hi", "bye", "hello", "yes", "no", "bye" };
		assertEquals(_01_LinearSearch.linearSearch(words, "bye"), 1);
	}
	
	@Test
	public void testLinearSearchNegative() {
		String[] words = { "hi", "bye", "hello", "yes", "no", "bye" };
		assertEquals(_01_LinearSearch.linearSearch(words, "whatsup"), -1);
	}

	@Test
	public void testBinarySearch() {
		// 2. Use the assertEquals() method to test your binary search method
		// remember that the array must be sorted
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		assertEquals(_02_BinarySearch.binarySearch(array, 1, 20, 11), 11);
	}
	@Test
	public void testBinarySearchDupe() {
		// 2. Use the assertEquals() method to test your binary search method
		// remember that the array must be sorted
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 11, 17, 18, 19, 20 };
		assertEquals(_02_BinarySearch.binarySearch(array, 1, 20, 11), 11);
	}
	
	@Test
	public void testBinarySearchNegative() {
		// 2. Use the assertEquals() method to test your binary search method
		// remember that the array must be sorted
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		assertEquals(_02_BinarySearch.binarySearch(array, 1, 20, 21), -1);
	}
}
