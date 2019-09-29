package com.Program.Cls;

public class Methods {

	public static void scall() {
		System.out.println("This is static block");	
		new Methods() . nonscall();
		
	}
	public  void nonscall() {
		System.out.println("This is Non Static");
		//scall();
		
		
	}
	public static void main(String[] args) {
		scall();
		}

}
