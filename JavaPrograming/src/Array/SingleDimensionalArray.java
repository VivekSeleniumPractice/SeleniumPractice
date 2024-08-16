package Array;

public class SingleDimensionalArray {

	public static void main(String[] args) {

		int a[] = { 100, 200, 300, 400, 500 };

		System.out.println("Length of Array := " + a.length);

		System.out.println(a[4]);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		ForEach();
	}

	public static void ForEach() {

		System.out.print("--------ForEachLoop--------");
		System.out.println("");

		int a[] = { 1000, 2000, 3000, 4000, 5000 };

		for (int x : a) {
			System.out.println(x);
		}

	}

}
