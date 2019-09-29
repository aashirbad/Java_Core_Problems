package com.Program.Cls;

public class TypesOfMethods {
	
	public static void call()
	{
		System.out.println("Class Method ");
	}
	public void show ()
	{
		System.out.println("Object Method");
		
	}
	static {
		System .out .println("Static block");
	}
	{
		System.out.println("Object block");
	}

	public static void main(String[] args) {
		System.out.println("I am in Main Method ");
		call();
		TypesOfMethods p = new TypesOfMethods();
		p.show();

	}

}
