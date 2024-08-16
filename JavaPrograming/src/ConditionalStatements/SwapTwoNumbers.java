package ConditionalStatements;

public class SwapTwoNumbers {
	
	public static void main(String[] args) {

		WithoutThirdVariable ();
		
		WithThirdVariable ();
	}
	
	public static void WithoutThirdVariable () {

	 int X = 48, Y = 20;

		System.out.println("Before Swapping := >>>>>> " + X + "......." + Y);
		X = X + Y;
		Y = X - Y;
		X = X - Y;
		
		System.out.println("After Swapping  := >>>>>> " + X + "......." + Y);
	}
	
public static void WithThirdVariable () {

	 int X = 48, Y = 20, Z = 0;
	 
	 System.out.println("Before Swapping := >>>>>> " + X + "......." + Y);
		Z = X;		
		
		X = Y;
		
		Y = Z;
		
		System.out.println("After Swapping  := >>>>>> " + X + "......." + Y);
	}

}
