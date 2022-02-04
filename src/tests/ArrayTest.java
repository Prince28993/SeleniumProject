package tests;

public class ArrayTest {

	public static void main(String[] args) {
		
		String tool ="Selenium";
		System.out.println(tool);
		String tools[]= {"Selenium","Java","Junit","TestNG","Maven","Prince"};
		
		System.out.println(tools.length);
		System.out.println(tools[0]);
		System.out.println(tools[1]);
		System.out.println(tools[2]);
		System.out.println(tools[3]);
		System.out.println(tools[4]);
		System.out.println(tools[5]);
		
		for(int i=0;i<tools.length;i++) {
			System.out.println(tools[i]);
		}
 
		int numbers[] = {1,2,3,4,5};
		System.out.println(numbers.length);
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
	}
		
     Object abc[] = {100, "Hello"};
     System.out.println(abc[0]);
     System.out.println(abc[1]);
}
}

