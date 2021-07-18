package experimentaion;

import java.io.IOException;
import java.util.Scanner;

public class Addition {
	
	public static void main(String[] args) throws IOException {
		Addition Add = new Addition();
		int a= 0;
		int b= 0;
		int c= 0;
		
		Scanner scanner = new Scanner(System.in);
	//	String message = scanner.nextLine();
	//	System.out.println(message);
	//	int i=Integer.parseInt("200");
		
		
		System.out.println("Add two numbers");
		
		
		System.out.println("a value");
		a = Integer.parseInt(scanner.nextLine());
		
		System.out.println("b value");
		b = Integer.parseInt(scanner.nextLine());
		
		System.out.println("c value");
		c = Integer.parseInt(scanner.nextLine());
		
		System.out.println("a + b + c = " + (a + b + c));
		
		
	}
}