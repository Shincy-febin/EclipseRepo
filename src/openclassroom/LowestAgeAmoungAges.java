package openclassroom;

public class LowestAgeAmoungAges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ages[] = {2,5,9,28,33,34,38,1,60,67};
		int smallest = ages[0];
		for(int i=0; i<ages.length ;i++)
		{
			if(smallest> ages[i])
			{
				smallest = ages[i];
			}
			
		}
		System.out.println("The smallest of age is " +smallest );

	}

}
