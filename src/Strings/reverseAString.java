package Strings;

public class reverseAString {

	public static void main(String[] args) {
		
		charAt ab = new charAt();
		ab.david();
	

		String str = "SHINY";
		String rev = "";

		
		/*  StringBuffer sb = new StringBuffer(str); 
		  StringBuffer rev = sb.reverse();
		  
		  System.out.print(rev);*/
		
		
		 for(int i=str.length()-1; i>=0; i--) 		  
		  rev = rev + str.charAt(i);
		  
		  System.out.print(rev);
		  
		  
		  }
		 
		  

	}

