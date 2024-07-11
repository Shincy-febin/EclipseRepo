package PracticeProgram18May;

import java.util.Scanner;

public class StringPalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ar, rev = "";
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		ar = sc.next();
		for(int i = ar.length()-1; i>=0; i--)
		{
			 rev = rev + ar.charAt(i);
		}
		if(ar.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
	}

}
