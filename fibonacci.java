package FOR;

public class fibonacci {

	public fibonacci() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		int b = 1;
		int c;
	
		System.out.print( a + " " + b + " ");
		
		for (int i = 2; i < 10; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
			
		}

	}

}
