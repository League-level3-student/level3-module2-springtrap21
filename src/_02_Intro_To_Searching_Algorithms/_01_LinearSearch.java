package _02_Intro_To_Searching_Algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

public class _01_LinearSearch {
	/*
	 * When finding the location of a certain element in an array, there are many
	 * algorithms that can do so. The simplest is the linear search. This is best
	 * for short unsorted lists of data. // 1. Complete the method using a for loop
	 * to find the value // in the array. Return the location in the array // where
	 * the value was found. // If the value is not found in the array, return -1.
	 */
	public static int linearSearch(String[] words, String value) {
		System.out.println("Using Linear Search on array to find: " + value + " in " + Arrays.toString(words));
		for (int i = 0; i < words.length; i++) {
			if (words[i] == value) {
				System.out.println(value + " found at index: " + i);
				return i;
			}
		}
		return -1;
	}

}
