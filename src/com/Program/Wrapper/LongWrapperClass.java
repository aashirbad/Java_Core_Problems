package com.Program.Wrapper;

public class LongWrapperClass {

	public static void main(String[] args) {
		
		Long l = new Long(152); // auto conversion int to long
		System.out.println(l); // const overloaded
		
		Long l1 = new Long("152"); // cost overLoad  str to long
		System.out.println(l);
		
		long l3 = Long.parseLong("153");
		System.out.println(l3);
		
		String s = Long.toString(1563);
		System.out.println(s);
		
	}

}
 // Op
//152
//152
//153
//1563
