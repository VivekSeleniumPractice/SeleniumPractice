package Array;

import java.util.Arrays;

public class SortingAnArray {

	public static void main(String[] args) {

		int a[] = { 20, 10, 30, 40, 9, 11, 5 };

		System.out.println("Before Sorting ........");

		System.out.println(Arrays.toString(a));

		Arrays.sort(a);

		System.out.println("After Sorting ........");
		System.out.println(Arrays.toString(a));

		SortArray();
	}

	public static void SortArray() {

		String S[] = { "ABC", "XYZ", "DEF", "FED" };

		System.out.println("Before Sorting ........ " + Arrays.toString(S));

		Arrays.sort(S);

		System.out.println("After Sorting ........" + Arrays.toString(S));
	}

}
