package com.Program.Wrapper;

public class CharacterWrapperClass {
	
	public static void main(String[] args) {
		
		Character c1 = new Character('X'); 
		System.out.println(c1);
		
		//Character c2 = new Character("ABD");  // Constructor Overload for Char type only not String
		//System.out.println(c2);
		
		String s = Character.toString(c1); // String type
		System.out.println(s + 1211111);
		
		char u = Character.toUpperCase('v');  // convert lower case to Upper case
		System.out.println(u);
		
		char l = Character.toLowerCase('W');	 // convert upper to lower
		System.out.println(l);
	}

}
/* O/p
X
X1211111
V
w
*/