package com.Program.Wrapper;

public class ShortWrapper {

	public static void main(String[] args) {
		
		Short s = new Short( (short ) 15);  // Construct Overloaded
		System.out.println(s);  		
		
		Short s2 = new Short ("15");	// Construct Overloaded
		System.out.println(s2);
		
		String s3 = Short.toString(s) ; 
		System.out.println(s3 + "1211");  // converts short to String type
		
		Short s4  =  Short .parseShort(s3 );  // convert string to short 
		System.out.println(s4);
	}

}
