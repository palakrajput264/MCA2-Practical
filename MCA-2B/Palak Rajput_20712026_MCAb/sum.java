package lab;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st integer: ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter 2nd integer: ");
		int n2 = sc.nextInt();
		
		System.out.println("Enter 3rd integer: ");
		int n3 = sc.nextInt();
		
		System.out.println("sum: " + (n1+n2+n3));

	}

}
