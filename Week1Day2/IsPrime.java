package week.day2;

public class IsPrime {
	public static void main(String[] args) {
		int Number = 1;
		boolean value = true;
		for (int i = 2; i < Number; i++) {
			if (Number % i == 0) {
				value = false;
				break;
			}
		}
		if (value) {
			System.out.println(Number + " is Prime");
		}else {
			System.out.println(Number + " is not Prime");
		}
	}
}
