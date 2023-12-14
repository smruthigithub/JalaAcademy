package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class AddElement {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<>();
		ar.add("Sweety");
		ar.add("Scotty");
		ar.add("Shiny");
		ar.add("Sitru");

		System.out.println(ar);

		// Iterate
		for (int i = 0; i < ar.size(); i++) {
			System.out.print(ar.get(i) + " ");
		}

		System.out.println();

		// Add element at specific index
		ar.add(4, "Grace");

		System.out.println(ar);

		// Update element at specific index
		ar.set(4, "Grace3");

		System.out.println(ar);

		// Remove element at specific index
		ar.remove(4);

		System.out.println(ar);

		
		 //Check the element is present at specific index 
		if(ar.contains("Shiny")) {
			System.out.println("True");
		}
	
		  

		// Get element at particular index

		System.out.println(ar.get(2));

		// size of Array list
		int size = ar.size();
		System.out.println(size);

		// Sorting
		Collections.sort(ar);
		System.out.println(ar);

	}

}
