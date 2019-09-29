package com.Program.Cls;

public class StaticVariable01 {
	
	
	static int data ;
	 void  sinc()   // may static or not
	{
		data ++;
		System.out.println("Noraml " + data);
		new StaticVariable01(). data ++;
		System.out.println("With new obj " + new StaticVariable01(). data + "\t  " + data);
		
	}

	public static void main(String[] args) {
		System.out.println(data);
		new StaticVariable01(). sinc();
		
	}

}
