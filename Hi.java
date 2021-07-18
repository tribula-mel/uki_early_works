package experimentaion;

import java.io.IOException;

public class Hi {

	private int a;
	private int b;
	
	public int sum(int a, int b) {
		return(a + b);
	}
	
	public static void main(String[] args) throws IOException {
	 String message = "Hi" + "!!!";
	 int c = 25;
	 int d = 50;
	 Hi Uki = new Hi();
	 Uki.a = 20;
	 Uki.b = 30;
		System.out.println(message);
	//	this.a = 10;
	//	this.b = 5;
		System.out.println("sum a + b = " + (Uki.a - Uki.b) );
		System.out.println("sum c + d = " + (Uki.sum(c, d)) );
		
		
		Uki.a = System.in.read();
		System.out.println(Uki.a);
	}
}