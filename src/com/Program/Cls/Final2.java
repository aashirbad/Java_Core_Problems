package com.Program.Cls;

public class Final2 {
	void call()
	{
		final int c = 0;
		 cll1();
		 System.out.println(c + "out side");
		{
			System.out.println(c + 1 + "In sde");
		}
	}

	private void cll1() {
		
	}

	public static void main(String[] args) {
		final int  i = 0;
		System.out.println(i + " " );
		 new Final2(). call();
	}

}
