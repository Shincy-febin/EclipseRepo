package openclassroom;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		int sum=0, rem, add;
		int temp =n;
		while(n>0)
		{
			rem = n%10; 
			add= rem*rem*rem;
			sum =sum+add;
			n=n/10;
			
		}
		
		System.out.println(sum);
		if(temp==sum)
		{
			System.out.println("Amstrong Number");
		}
		else
		{
			System.out.println("Not Amstrong");
		}

	}

}
