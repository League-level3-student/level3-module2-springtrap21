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

    public static Boolean arraySearch(char[] arr, char key) {
    	//public int compare(String str1, String str2) {
          //  String lastLetter1 = str1.charAt(str1.length()-1) + "";
          //  String lastLetter2 = str2.charAt(str2.length()-1) + "";
            
          //  return lastLetter1.compareTo(lastLetter2);
      //  }
        return true;
    }
    
    public static Boolean listSearch(List<Character> list, Character key) {
        
        return null;
    }
}
