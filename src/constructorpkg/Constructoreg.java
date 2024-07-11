package constructorpkg;

public class Constructoreg {
	
	int x;
	String refname; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	
		Constructoreg mycust =new Constructoreg();
		System.out.println(mycust.x);
		System.out.println(mycust.refname);

	}
	public Constructoreg() 
	{
		x = 2021;
		refname= "Shincy";
	}
	

}
