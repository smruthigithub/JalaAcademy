package Arrays;

import java.util.Scanner;

public class indexOfElement {

	public static void main(String[] args) {

		int a[] = { 52, 5, 9, 2, 79, 3 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value from the given array");
		int value = sc.nextInt();
		
		for(int i=0; i<a.length; i++)
			
			if(a[i]==value)

System.out.println("Index of the array element " +value+ " is " +i);
			
	}

}
