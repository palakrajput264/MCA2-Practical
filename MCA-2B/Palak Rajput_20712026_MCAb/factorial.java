package lab;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int fac = 1;
		
		while(n>0) {
			fac *= n;
			n--;
		}
		System.out.println(fac);

	}

}
