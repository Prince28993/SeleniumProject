package tests;

public class WhileLoopTest {

	public static void main(String[] args) {
		
		int i=1;
		  while(i<101) {
			  System.out.println(i);
			  if(i==50) {
				  System.out.println("Got 50");
				  break;
			  }
			  i++;
		  }
	}

}
