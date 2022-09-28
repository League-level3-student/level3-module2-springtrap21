package _00_Intro_to_Sorting_Algorithms;

import java.util.Iterator;

class _02_SwappingDigits {

    // 1. Complete the method so that the first two elements of the array are
    //    swapped.
    public static void swapArrayOfTwo(int[] arr) {
    	int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    // 2. Complete the method so that it sorts the array using a bubble sort.
    //    Iterate through the array and when you find two elements that are out
    //    of order, swap them. Repeat this until the array is in order.
    public static void sortIntArray(int[] arr) {
    	for(int i = 0; i < arr.length; i++) {
    		for(int d = 0; d < arr.length -1; i++) {
    			if (arr[d] >= arr[d+1]) {
					int temp = arr[d];
					arr[d] = arr[d+1];
					arr[d+1] = temp;
				}
    		}
    	}
    }

    // 3. Complete the method so that it finds the middle number in the array.
    //    *Hint* it helps to sort it first.
    //    *Double Hint* Use the method you already wrote in step 2 to sort it
    public static int findMiddle(int[] arr) {
    	for(int i = 0; i < arr.length; i++) {
    		for(int j = 0; j < arr.length -1; i++) {
    			
    		}
    	}
    	return arr[arr.length/2];
    }
}
