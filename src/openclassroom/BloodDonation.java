package openclassroom;

public class BloodDonation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 8;
		int weight = 56;
		if(age>18)
		{
			if(weight>55)
			{
				System.out.println("Possible to donate blood");
			}
			else
			{
				System.out.println("less weight");
			}
		}
		else
		{
			System.out.println("Age is leassthan 18");
		}

	}

}
