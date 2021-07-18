package experimentaion;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mastermind {
	
	private String colors[] = {"green", "yellow", "blue", "red", "orange", "brown", "black", "white","purple"};
	private String gameColors[] = new String[] {"", "", "", "", ""};
	private String inputColors[] = new String[] {"", "", "", "", ""};
	private Scanner in = new Scanner(System.in);
	private int match[] = new int[] {0, 0, 0, 0, 0};
		
	public Mastermind() {
		
	}
	
	public void inputColors() {
		
		for(int i = 0; i <= 4; i++) {
			
			System.out.println("\nType in color " + (i + 1 ));
			String input = in.next();
			inputColors[i] = input;
			
		}

	}
	
	public void searchArray() {
		
		for (int l = 0; l <=4; l++) {
			match[l] = 0;
		}
		
		for (int x = 0; x <= 4; x++) {
			
			for (int y = 0; y <= 4; y++) {
				
				if (inputColors[y].matches(gameColors[x])) {
					
					match[y] = 1;
					
				}
				
			}
			
		}
		
		for (int i = 0; i <= 4; i++) {
			
			if (inputColors[i].matches(gameColors[i])) {
				match[i] = 2;
				
			}
			
		}
		
	}
	
	public void rng() {
		
		Random rand = new Random();
		LocalDateTime time = LocalDateTime.now();
		DateTimeFormatter date = DateTimeFormatter.ofPattern("ss");
		String formattedDate = time.format(date);
		long seed = Long.parseLong(formattedDate);
		rand.setSeed(seed);
		
		for (int i = 0; i <= 4; i++) {
			
			while (gameColors[i].equals("")) {
				
				int rng = rand.nextInt(8) + 1;
				gameColors[i] = colors[rng]; 
				colors[rng] = "";
			
			}
		}
	}
	
	public int win(int tries) {
		tries = 0;
		System.out.print("\nYou Win!! The correct sequence was: ");
		
		for (int z = 0; z <= 4; z++) {
			
			System.out.print(gameColors[z] + " ");
			
		}
		
		return tries;
	}
	
	public void inputAndSearch(int tries) {
		
		for (int i = 0; i < tries; i++) {
			inputColors();
			searchArray();
		
			System.out.print("\nYour score is : ");
			for (int u = 0; u <= 4; u++) {
			
			System.out.print(match[u]);
			}
			if (Arrays.equals(inputColors, gameColors)) {
				
				tries = win(tries);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Mastermind mind = new Mastermind();
		
		mind.rng();
		
		System.out.print("Number of Tries:");
		int tries = mind.in.nextInt();
		
		mind.inputAndSearch(tries);
		
	}
}
//trouble shooting script
//for (int print = 0; print <= 4; print++) {
//	 System.out.print("\n" +mind.gameColors[print] + " ");
//	 }