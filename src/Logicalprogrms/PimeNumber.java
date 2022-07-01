package Logicalprogrms;

import java.util.Scanner;

public class PimeNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int input = sc.nextInt();
		int count=0;
		
		for(int i=2;i<input;i++) {
			if(input%i==0) {
				count++;
			}
			if(count==0) {
				System.out.println("you entered number "+input+" is prime number");
			}
			else {
				System.out.println("number "+input+ " is not a prime number");
			}
		}
		

	}

}
