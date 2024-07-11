package openclassroom;

import java.util.Scanner;

public class SimpleCalculatorDowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		do
		{ 
		System.out.println("Enter the 2 numbers");
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		System.out.println("Enter the choice");
		System.out.println("1: ADD, 2: SUBRACT, 3: MULTIPLY 4: DIVISION");
		choice =sc.nextInt();		
		switch(choice)
		{
		case 1 :
			System.out.println("Sum="+(a+b));
		break;
		case 2 : 
			System.out.println("Sub ="+(a-b));
		break;
		case 3 :
			System.out.println("multiply="+(a*b));
		break;
		case 4 :
			System.out.println("division ="+(a/b));
		break;
		default : System.out.println("Invalid choice");
	
		}
		}while(choice<=4 && choice>0);
	}

}
