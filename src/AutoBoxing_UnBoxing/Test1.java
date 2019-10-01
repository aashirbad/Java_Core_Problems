package AutoBoxing_UnBoxing;

public class Test1 {

	public static void main(String[] args) {
		
		
		Boolean b  = new Boolean("ewe");
		
		
		boolean b1 = false;
		
		b = b1;   // AutoBoxing      variable is assign to object
		System.out.println(b + "\n" + b1);

		boolean b3;
		b3 = b;  // Unboxing        object is assign to a variable
		System.out.println(b3);
		
		
	}

}// Op
//false
//false
//false
