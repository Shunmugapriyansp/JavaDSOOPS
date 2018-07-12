package tester;

import java.awt.List;
import java.util.Arrays;

public class ClsString {
	public static void main(String args[]){  
		String name="sonoo";  
		String sf1=String.format("name is %s",name);  
		String sf2=String.format("value is %f",32.33434);  
		String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0  
		  char ch[] = {'j','a','v','a'};
		  String s4= new String(ch);
		  
		System.out.println(sf1);  
		System.out.println(sf2);  
		System.out.println(sf3);
		System.out.println(s4);  
		System.out.println(s4.substring(2));
		System.out.println(s4.substring(1,3));
		System.out.println(s4.contains("ava"));
		System.out.println(String.join("-", "Priyan is a Good", "boy", s4));
	System.out.println(fibonacciseries(4));

		}
	
	public static int fibonacciseries(int n){
		
		if (n==0){
			return 0;}
		else if(n==1){
			System.out.println("1 ");
			return 1;
			
		}else{
			
			 int a=n*fibonacciseries(n-1);
			 System.out.print(a + " ");
			return a;
		}
		//return n;
		

		
	}
}
