package methodpkg;

import java.util.Scanner;

public class VovelCountUsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		VovelCountUsingMethod v = new VovelCountUsingMethod();
		v.VovelCount(s);	

	}
	
	public void VovelCount(String s)
	{
		int count =0;
		for (int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
