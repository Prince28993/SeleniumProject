package tests;

public class ForLoopTest {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=101;i++) {
			System.out.println(i);
			if(i==50) {
				System.out.println("Got 50");
				break;
			}
		}
		
		System.out.println("After the loop");
	}

}
