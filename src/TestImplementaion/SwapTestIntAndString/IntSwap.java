package TestImplementaion.SwapTestIntAndString;

public class IntSwap {

	public static void main(String[] args) {
		
		int a = 101;
		int a2 = 1;
		System.out.println(a );
		System.out.println( a2 );
		swap(a,a2);
		System.out.println(a );
		System.out.println( a2 );

	}

	private static void swap(int x, int y) {
		x = x * y;
		y = x / y;
		x = x / y;
		
	}

}
