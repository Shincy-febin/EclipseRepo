package openclassroom;

public class AveragesOfDifferentAges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ages[] = {1,2,5,9,28,33,34,38,60,67};
		float avg;
		float sum=0;
		int i;
		System.out.println("The length of the array is " + ages.length);
		int length = ages.length;
		for(i=0; i<ages.length ;i++)
		{
			sum = sum + ages[i];
			
		}
		System.out.println("The sum of the array is " + sum);
		avg= sum/length;
		System.out.println("The average of the array is " +avg);

	}

}
