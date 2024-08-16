package LoopingStatements;

public class ProgramUsingDoWhileLoop {

	public static void main(String[] args) {

		PrintEvenNumbers1To10();

	}
	
	public static void PrintEvenNumbers1To10() {
		int j = 2;
		
		do {
			if (j % 2 == 0) {
				System.out.println(j);
				}
				j++;
		}
		while (j <= 10);
		
	}

}
