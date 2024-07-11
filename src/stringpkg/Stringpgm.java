package stringpkg;

public class Stringpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "SHINCY";
		String s2 ="Rose";
		String s3 =new String("Shincy");
		String s4 = "    Febin George";
		String s5 = " Welcome to Software Testing";
		
		//concat
		System.out.println(s1.concat(s2));
		System.out.println(1+2+s1+3+4);
		
		//.equals
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		//touppercase
		//tolowercase
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toUpperCase());
		
		//length
		System.out.println(s1.length());
		
		//Startswith endswith
		System.out.println(s4.startsWith("Febin"));
		System.out.println(s4.endsWith("George"));
		
		//trim
		System.out.println(s4);
		System.out.println(s4.trim());
		
		//replace
		System.out.println(s2.replace("Rose", "Febin"));
		
		//contains
		System.out.println(s5.contains("Welcome"));
		
		//split
		String[] ar = s5.split(" ");
		for (String a:ar)
		{
			System.out.println(a);
		}
		
		//substring
		System.out.println(s1.substring(1,4));
		
		//CharAt
		System.out.println(s1.charAt(4));
		
		//tocharArray
		char[] c = s2.toCharArray();
		for(char ch : c)
		{
			System.out.println(ch);
		}
		
	}

}
