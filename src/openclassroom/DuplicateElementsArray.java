package openclassroom;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ages[] = {1,2,2,5,9,28,33,34,38,60,67,60,67,28};
		int l= ages.length;
		System.out.println("The length of the given array is " +l);
		System.out.println("The duplicate elements in the array are ");
		for(int i =0; i<l; i++)
		{
			for(int j=i+1; j<l; j++)
			{
				if(ages[i]== ages[j])
				{
					System.out.println(ages[i]);
				}
			}
		}

	}

}
