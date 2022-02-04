package practice;

public class OverLoading {

	public static void main(String[] args) {
     OverLoading t1 = new OverLoading();
     t1.add();
    t1.add(10);
	}

	public void add() {
		
		System.out.println("Add1");
		
		
	}
	
	public void add(int a) {
	 System.out.println("add 20"+a);
	}
	
	
	
	
}
