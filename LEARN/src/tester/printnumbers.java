package tester;

public class printnumbers{

public static int num;
public printnumbers(int num){
this.num = num;
}

public static void main(String[] args){
	num=15;

	int oldcount = 1;
	for (int i= 1;i<=num; ){    

	for (int j=1; j<=oldcount; j++){
		System.out.print(i+" ");
		i++;
	} 
	oldcount=oldcount++;
	System.out.println("");

	}
}
}