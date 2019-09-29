package com.Program.Cls;

public class InsatnceVariable01 {
	int data01 = 0;
	static int data02 = 0;

	void inc() {
		data01 += 5;
		data02 += 5;
	}

	public static void main(String[] args) {
		
		InsatnceVariable01 dd = new InsatnceVariable01();
		dd.	inc()	;dd.	inc()	;dd.	inc()	;
		System.out.println(dd.data01 + "\t" + dd.data02);;

		InsatnceVariable01 dd1 = new InsatnceVariable01();
		dd1.	inc()	;dd1.	inc()	;dd1.	inc()	;
		System.out.println(dd1.data01 + "\t" + dd1.data02);;
	
	}

}
