package com.Program.Wrapper;

public class ByteWrapperClass {

	public static void main(String[] args) {
		
		byte b = (byte)184;   // type casting int to byte // cyclic -128 - 127
		System.out.println(b);
		
		byte b1  = new Byte("21");  /*    to string ()   // Constructor overLoaded//S */
		System.out.println(b1 );   
		
		byte b2 = new Byte((byte) 15);  // Constructor overLoaded
		System.out.println(b2);
		
		String s1 = Byte.toString(b1);   // toString()
		System.out.println(s1 + 21); // String type so it Concated
		
		byte bq = Byte.parseByte("121"); // parseByte()
		System.out.println(bq);
		
	}

}
/*   OutPut
 * 
-72
21
15
2121
121
		*/
