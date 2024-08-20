package week.day2;

import java.util.Iterator;

public class Fibonacci {
	public static void main(String[] args) {
		int range = 8;
		int a = 0;
		int b = 1;
		
		for (int i = 1; i <= range; i++) {
			System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;
		}
	}
}
