package AutoBoxing_UnBoxing;

public class Test2 {

	public static void main(String[] args) {
		
		Boolean b = new Boolean("java");
		System.out.println(b); /// false
		
		if (b) {
			System.out.println(b);
		}
		else if (b=true)
		{
			System.out.println("B");
		}
		
		else if (! b)
		{
			System.out.println("C");
		}
		
		else
		{
			System.out.println("U");
		}
	}

}
// OP
//false
//B
