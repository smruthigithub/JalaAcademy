package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class removeElement {

	public static void main(String[] args) {

		int a[] = { 3, 5, 82, 100, 2, 6, 10 };
		int b[] = new int[a.length - 1];
		//Scanner sc = new Scanner(System.in);
		System.out.println("First Array = " + Arrays.toString(a));
		// System.out.println("Enter the element from Array to remove");
		int remove = 100;
		for (int i = 0, j = 0; i < a.length; i++) {
			if (a[i] == remove) {
				continue;
			}
			b[j++] = a[i];
		}
		System.out.println("New Array = " + Arrays.toString(b));

	}

}
