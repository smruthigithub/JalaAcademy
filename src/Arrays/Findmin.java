package Arrays;

public class Findmin {

	public static void main(String[] args) {

		int a[] = {5,22,66,3,78,1,9};
		int min=a[0];
		
		for(int i=1; i<a.length; i++) {
			 if(a[i]<min) { 
				 min=a[i];
				 continue;
			 }
		}
		System.out.println("Smallest number is " + min);
	}

}
