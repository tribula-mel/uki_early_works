//package database;

import java.util.Scanner;

public class Database {
	
	private String[] database = new String[] {"lol","loooool","lmao","lol xd","lal"};	
	private String[] storage = new String[] {"", "", "", "", "", "", ""};
	int length;
	int size;
	
	public void searchDatabase(String input, int length) {

      // strip all the '_' from the input string
      String stripped = new String(input.replaceAll("\\_", " "));

      for (int i = 0; i < database.length; i++) {
         // if input string is contained in the string from the database
         // add it to the storage array
         if (database[i].contains(stripped)) {
            storage[i] = database[i];
         }
      }

	}
	
	public static void main(String[] args) {
		
		Database data = new Database();

		System.out.print("input the string: ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		String in = scan.nextLine();

      System.out.println("your input: " + in);
		data.searchDatabase(in, in.length());

		for (int x = 0; x < 5; x++) {
			System.out.println(data.storage[x]);
		}

	}

}
