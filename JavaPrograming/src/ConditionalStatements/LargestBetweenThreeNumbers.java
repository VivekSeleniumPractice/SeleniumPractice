package ConditionalStatements;

public class LargestBetweenThreeNumbers {

	public static void main(String[] args) {
		
		int X = 120, Y = 190, Z = 100;
		
		if (X > Y && X > Z) {
			System.out.println("X is the Largest Number :=  " + X);
		}
		else if (Y > X && Y > Z) {
			System.out.println("Y is the Largest Number :=  " + Y);
		}
		else {
			System.out.println("Z is the Largest Number :=  " + Z);
		}

	}

}
