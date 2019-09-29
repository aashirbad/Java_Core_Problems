package com.Program.Cls;

public class NonStaticBlock {

	public NonStaticBlock() {
		System.out.println(" Constructor ");
	}

	{
		System.out.println("After obj created, before constructor executed");
	}

	public static void main(String[] args) {
		NonStaticBlock n = new NonStaticBlock();
	}
}
