package Basics;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The 3 Digit Number : ");
		int n=sc.nextInt();
		
		int decimal=0;int reminder;
		int power=0;
		while(n!=0) {
			
			reminder= n%10;
			decimal+= reminder*Math.pow(2, power);
			n=n/10;
			power++;	
			
		}
		System.out.println("Decimal Value is"+decimal);
	}

}
