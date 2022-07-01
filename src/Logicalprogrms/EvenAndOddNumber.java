package Logicalprogrms;

import java.util.Scanner;

public class EvenAndOddNumber {

	public static void main(String[] args) {
		
		//int a=2;
		//int b=30;
		
		//System.out.println(b/a);
		//System.out.println(b%a);

		//even number b%a---> will be zero
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int a = sc.nextInt();
		int b=2;
		
		if (a%b==0) {
			System.out.println("given no. is EVEN");
			
		}
		else {
			System.out.println("giver no. is ODD");
		}
		
	}

}
