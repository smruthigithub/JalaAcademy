package Arrays;

public class FindMax {

	public static void main(String[] args) {

		int a[] = {1, 8,22,9, 29,5,33};
		int max = 0;
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]>=max) {
				max=a[i];
				continue;
			}	

		}
		
		System.out.println("Largest number is " + max);
 	}

}
