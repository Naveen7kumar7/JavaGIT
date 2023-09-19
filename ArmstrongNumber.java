package Basics;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The 3 Digit Number : ");
		int n=sc.nextInt();
		int temp=n;
		int Digit1,Digit2,Digit3;
		
		Digit3=temp%10; //3
		temp=temp/10;//12

		Digit2=temp%10; //2
		temp=temp/10;//1
		
		Digit1=temp%10; //1
		
		int Result=(Digit1*Digit1*Digit1)+(Digit2*Digit2*Digit2)+(Digit3*Digit3*Digit3);
		
		if(Result==n) {
			System.out.println("Given Number is ArmstrongNumber"+n);
		}else {
			System.out.println("Given Number is Not ArmstrongNumber"+n);
		}
	}

}
