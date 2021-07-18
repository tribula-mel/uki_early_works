package experimentaion;

import java.util.Scanner;

public class Mastermind {
	
	static Scanner in = new Scanner(System.in);
	static int matches = 0;

	static String colors[] = {"green", "yellow", "blue" , "red", "orange", "brown", "black", "white" ,"purple"};
	
	public static int searchArray(int x, String y) {
		
		int match = 0;
		
		for (int i = 0; i <= 8; i++) {
			
			if (colors[i].matches(y)) {
				match = 1;
			}
		}
		
		if (colors[x].matches(y)) {
			colors[x] = " ";
			matches++;
			match = 2;
		}
		
		return match;
		
	}
	
	public static void main(String[] args) {
		
		System.out.print("Number of Tries:");
		int tries = in.nextInt();
		
		for (int i = 0; i < tries; i++) {
			
			System.out.print("\nGuess a Color:");
			String color = in.next();
			System.out.print("Guess its Position:");
			int position = in.nextInt();
		
			int result = searchArray(position,color);
		
			if (matches == 9) {
				System.out.print("You Win!");
				break;
			}
			
			System.out.println(color + " at position " + position + " is a: " + result + "\n");
		}
	}
}