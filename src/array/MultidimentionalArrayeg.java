package array;

import java.util.Scanner;

public class MultidimentionalArrayeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr= new int[3][2];
		System.out.println("Enter the numbers");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
