package Array;

import java.util.Scanner;

public class TakingInputInRuntime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Enter a number");
		 * 
		 * int num = sc.nextInt();
		 * 
		 * System.out.println("Given Number is : " + num);
		 */

		/*
		 * System.out.println("Enter a decimal number");
		 * 
		 * double num = sc.nextDouble();
		 * 
		 * System.out.println("Given Number is : " + num);
		 */
		
		System.out.println("Enter your name");
		String Name = sc.next();
		System.out.println("Given Name is : " + Name);
	}

}
