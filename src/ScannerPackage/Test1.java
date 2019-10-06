package ScannerPackage;

import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter a next() arg : ");
		System.out.println(sc.next());
		
		
		System.out.println("Enter a nextLine() arg : ");
		System.out.println(sc1.nextLine());
		
		System.out.println("Enter a nextInt() arg : ");
		System.out.println(sc.nextInt());
		
		System.out.println("Enter a nextLong() arg : ");
		System.out.println(sc.nextLong());
		
		sc.close();
	}

}
