package com.Program.Wrapper;

public class IntegerWrapperClass {

	public static void main(String[] args) {
		
		int i = new Integer(1);   // const overloaded int 
		System.out.println(i);
		
		int i1 = new Integer("23");// const overloaded
		System.out.println(i1);
		
//		int i3 = Integer.parseInt("s"); // error it should number in it
//		System.out.println(i3);
		
		int i4 = Integer.parseInt("556"); // it should number in it of str type
		System.out.println(i4);
		
		String s = Integer.toString(153);// convert int - str
		System.out.println(s);
	}

}
// OP
//1
//23
//556
//153
