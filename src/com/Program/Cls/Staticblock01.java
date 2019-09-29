package com.Program.Cls;

public class Staticblock01 {
	 static int i ;

	static {
		System.out.println("hello Static block " + i);
		main(null);
	}
	public static void main(String[] args) {
	
		System.out.print("It is main\n");
		}
	static {
		System.out.print("2n static\n");
	}
	

}
