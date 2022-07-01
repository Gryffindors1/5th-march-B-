package Logicalprogrms;

import java.util.Scanner;

public class ResverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter string");
		 String s = sc.next();
		 System.out.println("Given string is "+s);
		 String rev="";
		 //Velocity-->yticoleV
		 //PUNE
		 for(int i=s.length()-1;i>=0;i--)
		 {
		 rev= rev+s.charAt(i);
		 //i=3 //=""+E-->E
		 //i=2 //E+N-->EN
		 //i=1 //EN+U-->ENU
		 //i=0 //ENU+P-->ENUP
		 //syso(rev)
		 }
		 System.out.println("reverse string is "+rev);
	}

}
