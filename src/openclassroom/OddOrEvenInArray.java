package openclassroom;

public class OddOrEvenInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ages[] = {2,5,9,28,33,34,38,1,60,67};
		System.out.println("Odd numbers in the given array are");
		int l=ages.length;
		for(int i=0; i<l; i++)
		{
			if(ages[i]%2!=0)
			{
				System.out.println(ages[i]);
			}
		}
		System.out.println("Even numbers in the given array are");
		for(int i=0; i<l; i++)
		{
			if(ages[i]%2==0)
			{
				System.out.println(ages[i]);
			}
		}
	}

}
