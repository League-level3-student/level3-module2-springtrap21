package _04_JavaClassSearchAndSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * Use the Arrays and Collections classes to implement the search and sort
 * methods below.
 */
public class _02_JavaClassSearchSort {
    
    public static int[] arraySort(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
    
    public static List<Double> listSort(List<Double> list){
        Collections.sort(list);
        return list;
    }

    public static boolean arraySearch(char[] arr, char key) {
    	Arrays.sort(arr);
    	int index = Arrays.binarySearch(arr, key);
    	if (index >= 0) {
			return true;
		}
    	if (index <= 0) {
    		return false;
		}
		return false;		   	
    }
    
    public static Boolean listSearch(List<Character> list, Character key) {
        Collections.sort(list);
        int index = Collections.binarySearch(list, key);
        if (index >= 0) {
			return true;
		}
        if (index <= 0) {
			return false;
		}
        return null;
    }
}
