package com.Program.Wrapper;

public class DoubleWrapperClass {

	public static void main(String[] args) {
		
		Double d = new Double(53.565);    // const overloaded
		System.out.println(d);
		
		Double d2 = new Double("454.56563");   // const overloaded
		System.out.println(d2);
		
		double dd = Double.parseDouble("56.5656");  // str to double
		System.out.println(dd);
		
		String s1 = Double.toString(56.5656);    // double to str
		System.out.println(s1);

	}

}


// Outp
//53.565
//454.56563
//56.5656
//56.5656
