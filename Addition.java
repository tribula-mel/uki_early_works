package experimentaion;

import java.io.IOException;
import java.util.Scanner;


public class Addition {
	
	private int function;
	
	Addition() {
		function = 1;
	}
	
	public void chooseFunction(int a) {
		if ((a>=1) && (a<=4))  { 
			function = a;
		}
	}
	
	private static int a;
	private static int b;
	
	static Scanner scanner = new Scanner(System.in);
	
	public void readValues() {
		System.out.println("a value");
		a = Integer.parseInt(scanner.nextLine());
	
		System.out.println("b value");
		b = Integer.parseInt(scanner.nextLine());
	}
	
	
	public static void main(String[] args) throws IOException {
		
		Addition Add = new Addition();
		int operation;
		
		System.out.println("Pick a Function");
		System.out.println("| 1 = + | 2 = - | 3 = * | 4 = / |");
		operation = Integer.parseInt(scanner.nextLine());
		Add.chooseFunction(operation);
		
	if  (Add.function == 1) {
		Add.readValues(); 
			System.out.println("a + b = " + (a + b));		
	}
	
	else if (Add.function == 2) {
		Add.readValues(); 
			System.out.println("a - b = " + (a - b));	
	}
	
	else if (Add.function == 3) {	
		Add.readValues(); 
			System.out.println("a * b = " + (a * b));
	}
	
	else if (Add.function == 4) {		
		Add.readValues(); 
			System.out.println("a / b = " + (a / b));
		} 
	}
}