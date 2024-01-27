package _03_More_Algorithms;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {
		return null;
	}

	public static int findBrokenEgg(List<String> eggs) {
//	This is how a for each loop works
//    	for (String egg : eggs) {
//			if (egg.equals("cracked")) {
//				return i;
//			}
//		}
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i)) {
				return i;
			}
		}
		return -1;
	}

	public static double findTallest(List<Double> peeps) {
		double max = peeps.get(0);
		for (int i = 1; i < peeps.size(); i++) {
			if (max < peeps.get(i)) {
				max = peeps.get(i);
			}
		}
		return max;
	}

	public static String findLongestWord(List<String> words) {
		String max = words.get(0);
		// for (int i = 1; i < words.size(); i++) {
		// if (max.length() < words.get(i).length()) {
		// max = words.get(i);
		// }
		// }
		for (String word : words) {
			if (max.length() < word.length()) {
				max = word;
			}
		}
		return max;
	}

	public static boolean containsSOS(List<String> message1) {
		String message = "... --- ...";
		for (String code : message1) {
			if (message.equals(code)) {
				return true;
			}
		}
		return false;
	}

	public static Double sortScores(List<Double> results, int index) {
		for (int k = 0; k < results.size(); k++) {
			for (int i = 0; i < results.size() -1 ; i++) {
				if (results.get(i) > results.get(i + 1)) {
					Double temp = results.get(i);
					results.set(i, results.get(i + 1));
					results.set(i + 1, temp);
				}
			}
		}
		return results.get(index);
	}
}
