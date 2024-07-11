package openclassroom;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dicecount=1;
		while (dicecount<=6)
		{
			if(dicecount<6)
			{
				System.out.println("not Yatzy");
			}
			else
			{
				System.out.println("Yatzy");
			}
			dicecount = dicecount + 1;
		}

	}

}
