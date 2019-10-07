package ArrayPack;

public class PassByRef_Array {

	public static void main(String[] args) {
		
		int a [] = new int[3];
		a[0] = 5;
		System.out.println("Before a [0]  = "+ a[0]);
		inc(a);
		System.out.println("After [0]  = "+ a[0]);
		
	}

	private static void inc(int[] a) {
		
		a[0] ++;
		
	}

}
