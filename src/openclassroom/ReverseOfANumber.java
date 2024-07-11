package openclassroom;

import java.util.Scanner;

public class ReverseOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		int rev=0, rem;
		while(n>0) //258>0  //25>0	2>0
		{
			rem = n%10;   //258%10=8	25%10=5		2%10=2
			rev =rev*10+rem; //0*10+8=8  8*10+5=85 		85*10+2=852
			n=n/10; //258/10=25 	25/10=2		2/10=0
		}
		System.out.println(rev);	//852

	}

}
