package practice;

public class Child  {
	
	Child(){
		super();
		
		//this(10,"bdhdg");
		System.out.println("Child Constructor");
	}
	
	Child(int a){
		System.out.println(a);
	}
	
	Child(int a,String m){
		System.out.println(a);
		System.out.println(m);
	}
	
	public void add () {
		System.out.println("child");
	}
}
