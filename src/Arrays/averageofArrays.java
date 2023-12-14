package Arrays;

public class averageofArrays {

	public static void main(String[] args) {

		int array[] = {1,8,64,46,10,45};
		int avg;
		int sum=0;
		
		for(int i=0; i<array.length; i++) {
			sum = sum+array[i];
		}
		
		avg = sum/array.length;
		System.out.println(avg);
	}

}
