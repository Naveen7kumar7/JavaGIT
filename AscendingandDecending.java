package Basics;

import java.util.Arrays;

public class AscendingandDecending {

	public static void main(String[] args) {
		
		int[] a= new int[] {10,20,47,58,93,40,20,4,9};
		System.out.println("Before Sorting = "+ Arrays.toString(a));
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
        System.out.println("Ater Sorting"+Arrays.toString(a));
	}

}
