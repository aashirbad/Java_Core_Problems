package com.Program.Wrapper;

public class BooleanWrapperClass  {

	public static void main(String[] args) {
		
		BooleanWrapperClass b = new BooleanWrapperClass(); // b reference prints address 
		System.out.println(b);
		
		Boolean a = new Boolean(""); // Construct Overloaded
		System.out.println(a);// false
		
		Boolean b12=new Boolean(true); //  Construct Overloaded
		System.out.println(b12);
		
		boolean b1 = Boolean.parseBoolean("true"); // Boolean.parseBoolean("string")
		System.out.println(b1);
		
		String b2 = Boolean.toString(true);			// str type Boolean.toString(boolean)
		System.out.println(b2);
		
	}

}
