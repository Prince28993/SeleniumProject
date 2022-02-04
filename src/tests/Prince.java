package tests;

public class Prince {
 
	  static Prince prince = new Prince();
	  static Test3 test3 = new Test3();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//call bye
		prince.bye();
		//call hello
		hello();
		//call printme
		Test1.printMe();
		//call circle
		test3.circle();
   
	}
	
	//create static method hello
	public static void hello() {
		System.out.println("i am hello");
	}
	//create non-static method bye
       public void bye() {
    	   System.out.println("good bye");
       }
}
