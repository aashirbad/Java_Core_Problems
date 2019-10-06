package TestImplementaion.SwapTestIntAndString;

public class StringSwap {

	public static void main(String[] args) {
		
		String s = "acb";
		String s2 = "xyz";
		swap(s,s2);
		System.out.println(s);
		System.out.println(s2);
	}

	private static void swap(String x, String y) {
		
		String temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println(x + "\n" + y);
	}

}
