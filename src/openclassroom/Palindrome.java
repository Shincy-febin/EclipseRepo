package openclassroom;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		int rev=0, rem;
		int temp =n;
		while(n>0) 
		{
			rem = n%10;   
			rev =rev*10+rem; 
			n=n/10; 
		}
		if(temp==rev)
		{
			System.out.println("Palindrome");	
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
