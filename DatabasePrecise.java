package database;

import java.util.ArrayList;
import java.util.Scanner;

public class DatabasePrecise {
	
	ArrayList<String> threeLetter = new ArrayList<String>();
	ArrayList<String> storage = new ArrayList<String>();
	
	public void searchDatabase(String input) {
		
		int count;
		
		for (int y = 0; threeLetter.size() > y ; y++) {
			
			count = input.length();
			
			for (int z = 0; input.length() > z; z++) {
				
				if ((threeLetter.get(y).charAt(z) == input.charAt(z)) || (input.charAt(z) == '_' && threeLetter.get(y).charAt(z) != ' ') && input.length() == threeLetter.get(y).length()) {
					
					count--;
				
				} else {
					
					break;
					
				}
				
			}
			
			if (count == 0) {
				
				storage.add(threeLetter.get(y));
				
			}
			
		}
      
	}
	
	public void addItems() {
		
		threeLetter.add("car");
		threeLetter.add("bar");
		threeLetter.add("art");
		threeLetter.add("arc");
		threeLetter.add("bad");
		
	}
	
	public static void main(String[] args) {
		
		DatabasePrecise data = new DatabasePrecise();
		data.addItems();
		
		System.out.print("input the string: ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		String in = scan.nextLine();

      System.out.println("your input: " + in);
		data.searchDatabase(in);
		
		System.out.println(data.storage);
		
	}

}