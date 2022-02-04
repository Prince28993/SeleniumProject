package tests;

import selenium.Test4;

public class Test1 {
	
	//ClassName objName = new ClassName();
	static Test1 t1 = new Test1();
	static Test2 t2= new Test2();
	static Test3 test3= new Test3();
    static Test4 test4 =new Test4();
	public static void main(String[] args) {
		//Test t1 = new Test();
		System.out.println(" I m in main method");
		scanMe();
		printMe();
		
		System.out.println("After printme");
		t1.testing1();
		t1.testing2();
		Test2.blue();//static different class 
        t2.red(); // non static, different class
        //call square
        Test3.square();
        //call circle
		test3.circle();
		
		//call audi
		Test4.audi();
		//call bmw
		test4.bmw();
		ArgumentsTest.sum();//5+6
	}
  
	
public static void printMe()
   {
	   System.out.println("printme");
   }
   public static void scanMe( ) 
   {
	   System.out.println("scanMe");
   }
   
   public void testing1() { 
	  System.out.println("testing1");
   }
	  private void testing2() {
		  System.out.println("testing2");
   }
}
