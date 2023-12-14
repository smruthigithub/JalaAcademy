package Arrays;

public class addIntegers {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,6,7};
		int res = a[0];
		
		for(int i=1; i<a.length; i++) {
			
			res = res +a[i];
		}
		
		System.out.println(res);
		
	}

}
