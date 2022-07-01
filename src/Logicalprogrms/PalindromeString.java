package Logicalprogrms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter string");
		
		String orignal = sc.next();
		String reverse="";
		
		for(int i=orignal.length()-1;i>=0;i--)
		{
		reverse=reverse+orignal.charAt(i);
		}
		System.out.println("Given string is "+orignal);
		System.out.println("Reverse of string is "+reverse);
		
		//for string is palidrome or not we use if else 
		if(orignal.equals(reverse))
		{
		System.out.println("String is in palindrome");
		}
		else {
		System.out.println("String is not palindrome");

		}
	}

}
