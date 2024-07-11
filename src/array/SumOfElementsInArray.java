package array;

import java.util.Scanner;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =new int[4];
		int sum=0;
		System.out.println("Enter the numbers");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<4; i++)
		{
			arr[i]= sc.nextInt();
			sum = sum + arr[i];
			
		}
		System.out.println(sum);
		

	}

}
