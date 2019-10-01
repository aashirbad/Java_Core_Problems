package com.Program.Cls;

public class TypeCasting01 {

	public static void main(String[] args) {
		byte b = 0 ;
		int i = 10;
		short s = 5;
		long l = 1000;
		float f =  10.2562F ;
		double d = 10.356565;
		
		System.out.println(f);
		i = b; // auto casting
		b = (byte) i;
		s = (short) i;
		l = i;// auto casting
		i = (int ) f; 
		f = i;
		
		
		d = i;
		i = (int) d;
		
		System.out.println(i);

	}
	
}
