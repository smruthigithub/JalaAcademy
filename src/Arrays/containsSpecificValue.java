package Arrays;

import java.util.Scanner;

public class containsSpecificValue {

	public static void main(String[] args) {

		int a[] = { 2, 4, 75, 33, 64 };
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to check from the array");
		int value = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (value == a[i]) {
				System.out.println("The element is present in the Array");
				flag = true;
				break;
			}
		}

		if (flag == false) {
			System.out.println("The element is not present in the Array");
		}
	}

}
