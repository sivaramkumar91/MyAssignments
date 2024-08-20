package week.day2;

import java.util.Arrays;

import freemarker.core._SortedArraySet;

public class FindMissingElement {
	public static void main(String[] args) {
		int[] Numbers = {1, 4,3,2,8, 6, 7};
		Arrays.sort(Numbers);
		for (int i = 0; i < Numbers.length; i++) {
			if (Numbers[i] != i + 1) {
				System.out.println("Missing Number is "+ (i+1));
				break;
			}
		}
	}
}

