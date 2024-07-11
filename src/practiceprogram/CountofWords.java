package practiceprogram;

import java.util.Scanner;

public class CountofWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
	String[] ar = s.split(" ")	;
	int totalwords = ar.length;
	System.out.println("Total number of words = " +totalwords);
	}

}
