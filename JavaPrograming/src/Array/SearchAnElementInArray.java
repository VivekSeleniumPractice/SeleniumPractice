package Array;

public class SearchAnElementInArray {

	public static void main(String[] args) {
		
		int a[] = {100,200,300,400,500};
		int b = 0;
		int c = 0;
		
		for (int x : a) {
			if (x==800){
				c = x;
				b++;
				break;
			}
		}
		if (b > 0) {
			System.out.println("Number is Present : " + c);
		}
		else {
			System.out.println("Number is not Present");
		}

	}

}
