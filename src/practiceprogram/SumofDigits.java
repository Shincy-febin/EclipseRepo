package practiceprogram;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit, num, sum =0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		 num = sc.nextInt();
		 while(num>0)
		 {
			 digit = num%10;
			 sum = sum+digit;
			 num = num/10;
		 }
		 System.out.println("The sum of digits = " + sum);
	}

}
