package Basics;

import java.util.Scanner;

public class ReverseDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int n=sc.nextInt();
		int reverse=0,reminder;
		while(n!=0) {
		 reminder= n%10;
		 reverse=(reverse*10)+reminder;
		 n=n/10;
		}
		System.out.println("Reverse "+reverse);
	}

}
