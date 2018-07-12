package tester;

import java.util.LinkedList;
import java.util.Scanner;

public class Palindrome {
	
	   public static void main(String args[])  
	   {  
	    /*  String original, reverse = ""; // Objects of String class  
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string/number to check if it is a palindrome");  
	      original = in.nextLine();   
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");   
	      */
	      String s1 = "MALAYALAM";
	      StringBuilder SB = new StringBuilder(s1);
	      //System.out.println(SB.reverse().toString());
	     if(SB.toString()==(SB.reverse().toString())){
	    	 System.out.println("Entered string/number is a palindrome.");   
	     }
	     LinkedList<String> ll = new LinkedList<>();
	    ll.add("TEST");
	    ll.add("Apple");
	    ll.add("Raja");
	    System.out.println(ll);
	     
	}  
}
