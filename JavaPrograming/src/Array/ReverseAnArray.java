package Array;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {

		int a[] = { 20, 10, 30, 40, 9, 11, 5 };

		for (int i = a.length - 1; i >= 0; i--) {
			//System.out.println(a[i]);
		}

		Arrays.sort(a);

		System.out.println(Arrays.toString(a));

	}

}
