package Array;

import java.util.Scanner;

public class TakingMultipleInputs {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number : ");
		int num1 = sc.nextInt();

		System.out.println("Enter Second Number : ");
		int num2 = sc.nextInt();

		System.out.println("Addition of 2 numbers : " + (num1 + num2));

	}

}
