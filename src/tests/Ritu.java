package tests;

public class Ritu {
	//ClassName objName = new ClassName();
	
	static Ritu prince  =new Ritu(); //object create of new class//
	public static void main(String[] args) {
		printme();
	//objectname.methodname();//way to call non-static method 
		prince.testing1();
		
		
	}
	static void printme()
	{
		System.out.println("printme"); 
		
	}
	
	void testing1() {
		System.out.println("testing");
	}
}
