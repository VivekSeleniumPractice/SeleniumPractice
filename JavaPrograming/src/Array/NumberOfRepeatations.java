package Array;

public class NumberOfRepeatations {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 30, 30, 40, 50 };
		int b = 10;
		int d = 0;

		for (int x : a) {

			if (x == b) {
				d++;
			}
		}

		if (b > 0) {

			System.out.println(b + " is repeated " + d + " times");
		}

	}

}
