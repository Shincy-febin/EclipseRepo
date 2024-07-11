package methodpkg; 

public class AreaOfShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AreaOfShapes ob = new AreaOfShapes();
		ob.rectangle();
		ob.circle();
		ob.triangle();
		ob.square();

	}
	
	public void rectangle()
	{
		int l=100,b=20, Area;
		Area=l*b;
		System.out.println("Area of Reactangle = " +Area);
	}
	public void circle()
	{
		double r=100, Area;
		Area=3.14*r*r;
		System.out.println("Area of Circle is = " +Area);
	}
	public void triangle()
	{
		double b=100,h=20, Area;
		Area=0.5*b*h;
		System.out.println("Area of triangle = " +Area);
	}
	public void square()
	{
		double a=20, Area;
		Area=a*a;
		System.out.println("Area of Square = " +Area);
	}

}
