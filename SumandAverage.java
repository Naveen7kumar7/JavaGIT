package Basics;

import java.util.Scanner;

public class SumandAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int n=sc.nextInt();
		int sum=0;int a;
		for(int i=1;i<=n;i++) {
			
			System.out.println("Enter the Number"+ i+":");
			a=sc.nextInt();
			sum=+a;
		}
		System.out.println("Sum of the Given Number is"+ sum);
		System.out.println("Average of the Given Number is"+ sum/n);
	}

}
