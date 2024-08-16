package LoopingStatements;

public class ProgramUsingForLoop {

	public static void main(String[] args) {

		// Print1To10 ();

		Print1To10EvenNumbers();

	}

	public static void Print1To10() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public static void Print1To10EvenNumbers() {

		for (int i = 2; i <= 10; i++) {

			if (i % 2 == 0) {
				System.out.println("Even Number is : " + i);
			}
			else {
				System.out.println("Odd Number is  : " + i);
			}
		}
	}
}
