package methodpkg;

public class WaysToCreateMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaysToCreateMethods ob =new WaysToCreateMethods();
		ob.add();
		int value = ob.sub();
		System.out.println("Subraction=" +value);
		ob.mul(100,20);
		double v = ob.div(100,20);
		System.out.println("Division ="+v);

	}
	
// 1.Method without Parameter and without returntype
	public void add()
	{
		int a=100, b=20, c;
		c=a+b;
		System.out.println("Addition =" +c);
	}
// 2. Method with returntype and without parameter
	public int sub()
	{
		int a=100, b=20, c;
		c=a-b;
		return c;
	}
	
//3. Method without return type and with parameter
	public void mul(int a, int b)
	{
		int c= a*b;
		System.out.println("Multiplication=" +c);
	}
	
//4. Method with parameter and with return type
	public double div(int a, int b)
	{
		double c= a/b;
		return c;
		
	}

}
