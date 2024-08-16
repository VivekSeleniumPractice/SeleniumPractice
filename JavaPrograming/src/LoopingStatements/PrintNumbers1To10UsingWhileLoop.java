package LoopingStatements;

public class PrintNumbers1To10UsingWhileLoop {

	public static void main(String[] args) {

		// PrintNumbers1To10();

		// PrintHello();

		// PrintEvenNumbers1To10();

		// PrintEvenOrOddNumbers1To10();

		PrintNumbers10To1();
	}

	public static void PrintHello() {
		int i = 1;

		while (i <= 10) {
			System.out.println(i + ":- " + "Hello");
			i++;
		}
	}

	public static void PrintNumbers1To10() {
		int j = 1;

		while (j <= 10) {
			System.out.println(j);
			j++;
		}
	}

	public static void PrintEvenNumbers1To10() {
		int j = 2;

		while (j <= 10) {
			if (j % 2 == 0) {
				System.out.println(j);
			}
			j++;
		}
	}

	public static void PrintEvenOrOddNumbers1To10() {
		int j = 1;

		while (j <= 10) {
			if (j % 2 == 0) {
				System.out.println(j + " is Even");
			} else {
				System.out.println(j + " is ODD");
			}
			j++;
		}
	}

	public static void PrintNumbers10To1() {
		int j = 10;

		while (j >= 1) {
			System.out.println(j);
			j--;
		}
	}

}
