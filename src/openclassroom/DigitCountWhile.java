package openclassroom;

public class DigitCountWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 944603689;
		int count =0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println("Count = "+count);
		

	}

}
