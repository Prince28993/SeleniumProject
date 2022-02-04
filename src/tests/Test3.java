package tests;

public class Test3 {
      
	 static Test3 test3 = new Test3();
	 static Test1 test1 = new Test1();
	public static void main(String[] args) {
		
		
		//call square
		square();
		//call circle
		//objectname.methodname();//way to call non-static method
		test3.circle();
		//call printMe
		//way to call static method of difeerent class 
		//className.methodName();
		Test1.printMe();
		//call testing1
		test1.testing1();

	}
	
	//create static method square
	//public static returntype methodName(){
	//syso 
	//}
	public static void square() {
		System.out.println("i am square");
	}
	
	//create not static method circle
    public void circle() {
	System.out.println("i am circle");
    }
    
}
