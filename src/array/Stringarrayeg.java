package array;

import java.util.Scanner;

public class Stringarrayeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = new String[10];
		System.out.println("Please enter the names:");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<10;i++)
		{
			arr[i] =sc.next();
		}
		System.out.println("The entered names are:");
		for(int i=0; i<10; i++)
		{
			System.out.println(arr[i]);
		}


	}

}
