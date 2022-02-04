package tests;

public class ReturnTypeTest {

	public static void main(String[] args) {
		int x = sum (4,5) ;
		System.out.println(x);
		
		System.out.println(sum(8,9));
		
		String y = hello("Hello Selenium");
		System.out.println(y);
		String z = hello("Hello Java");
		System.out.println(z);
		
		}
	
		public static int sum(int b, int c) {
		int a = b+c;
		return a;
		}
		public static String hello(String b) {
		String s = b;
		return s;
		}
		

	}


