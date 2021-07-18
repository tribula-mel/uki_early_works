//package database;

import java.util.Scanner;

public class DatabasePrecise {
	
	private String[] database = new String[] {"lol","lul","lml","lmao","lal"};	
	private String[] storage = new String[] {"", "", "", "", "", "", ""};
	
	
	
	public void searchDatabase(String input, int length) {
		for (int y = 0; database.length - 1 >= y ; y++) {
			
			for (int z = 0; length - 1 >= z; z++) {
			
				if (((database[y].charAt(z) == input.charAt(z)) || ((input.charAt(z) == '_') && (input.charAt(z) != ' '))) && (input.length() == database[y].length())) {
				
					storage[y] = database[y];
				
				} else {
				
					storage[y] = "";
					break;
					
				}
				
			}
			
		}
      
	}
	
	public static void main(String[] args) {
		
		DatabasePrecise data = new DatabasePrecise();

		System.out.print("input the string: ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		String in = scan.nextLine();

      System.out.println("your input: " + in);
		data.searchDatabase(in, in.length());

		for (int x = 0; data.database.length > x; x++) {
			System.out.println(data.storage[x]);
		}

	}

}
