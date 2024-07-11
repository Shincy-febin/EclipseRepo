package practiceprogram;

import java.util.Scanner;

public class CountofaSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count =0;
		for(int i=0;i<s.length();i++)
		{
			if (!(s.charAt(i)==' '))
			{
				count++;
			}
		}
		System.out.println("Count of characters is "+count);
		
	}

}
