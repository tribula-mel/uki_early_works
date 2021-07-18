package experimentaion;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Random;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Mastermind implements ActionListener {
	
	private String colors[] = {"green", "yellow", "blue", "red", "orange", "black", "white","purple"};
	private String gameColors[] = new String[] {"", "", "", "", ""};
	private String inputColors[] = new String[] {"", "", "", "", ""};
	private int match[] = new int[] {0, 0, 0, 0, 0};
	private JFrame frame;
	private JButton green, yellow, blue, red, orange, black, white, purple;
	private JTextArea textArea;
	private JScrollPane scrollArea;
	private int arraySlot = 0;
	private String color;
		
	public Mastermind() {
		
		frame = new JFrame("Mastermind");
		textArea = new JTextArea(40, 5);
		scrollArea = new JScrollPane(textArea);
		
		
		green  = new JButton(new AbstractAction("green") {
			 @Override
		        public void actionPerformed( ActionEvent e ) {
				 
					color = "green";
					inputColors();
					searchArray();
					checkWin();
					
		        }
		    });
		
		red = new JButton(new AbstractAction("red") {
			@Override
	        public void actionPerformed( ActionEvent e ) {
				 
				color = "red";
				inputColors();
				searchArray();
				checkWin();
				
	        }
		});
		
		blue = new JButton(new AbstractAction("blue") {
			@Override
	        public void actionPerformed( ActionEvent e ) {
				 
				color = "blue";
				inputColors();
				searchArray();
				checkWin();
				
	        }
		});
		
		yellow = new JButton(new AbstractAction("yellow") {
			@Override
	        public void actionPerformed( ActionEvent e ) {
				 
				color = "yellow";
				inputColors();
				searchArray();
				checkWin();
				
	        }
		});
		
		orange = new JButton(new AbstractAction("orange") {
			@Override
	        public void actionPerformed( ActionEvent e ) {
				 
				color = "orange";
				inputColors();
				searchArray();
				checkWin();
				
	        }
		});
		
		black = new JButton(new AbstractAction("black") {
			@Override
	        public void actionPerformed( ActionEvent e ) {
				 
				color = "black";
				inputColors();
				searchArray();
				checkWin();
				
	        }
		});
		
		white = new JButton(new AbstractAction("white") {
			@Override
	        public void actionPerformed( ActionEvent e ) {
				 
				color = "white";
				inputColors();
				searchArray();
				checkWin();
				
	        }
		});
		
		
		purple = new JButton(new AbstractAction("purple") {
			@Override
	        public void actionPerformed( ActionEvent e ) {
			 
				color = "purple";
				inputColors();
				searchArray();
				checkWin();
				
	        }
		});
		
		
	}
	
	public void inputColors() {
		
			inputColors[arraySlot] = color;
			arraySlot = arraySlot + 1;
			
			textArea.setText(textArea.getText().concat(color + " "));
			
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
				
				int rng = rand.nextInt(7) + 0;
				gameColors[i] = colors[rng]; 
				colors[rng] = "";
			
			}
		}
	}
	
	public void checkWin() {

		if (arraySlot == 5) {
			
			arraySlot = 0;
			textArea.setText(textArea.getText().concat("\n"));
			
			for (int i = 0; i <= 4; i++) {
				
		//		String t = String.valueOf(match[i]);
				textArea.setText(textArea.getText().concat(String.valueOf(match[i])));
				
			}
			
			textArea.setText(textArea.getText().concat("\n"));
			
		}
		
	} 
	
	public void createGUI() {
		
		green.setBounds(40, 100, 80, 25);
		red.setBounds(40, 125, 80, 25);
		blue.setBounds(120, 100, 80, 25);
		yellow.setBounds(120, 125, 80, 25);
		orange.setBounds(200, 100, 80, 25);
		purple.setBounds(200, 125, 80, 25);
		white.setBounds(280, 100, 80, 25);
		black.setBounds(280, 125, 80, 25); 
		
		
		scrollArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollArea.setBounds(40, 200, 320, 150);
		textArea.setLineWrap(true);
		
		frame.add(green);
		frame.add(red);
		frame.add(blue);
		frame.add(yellow);
		frame.add(orange);
		frame.add(purple);
		frame.add(white);
		frame.add(black);
		frame.getContentPane().add(scrollArea);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(400, 400);
		frame.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		
		Mastermind mind = new Mastermind();
		
		mind.rng();
		mind.createGUI();
		
		for (int z = 0; z <= 4; z++) {
			
			System.out.print(mind.gameColors[z] + " ");
			
		}
	
		/*	if (Arrays.equals(mind.inputColors, mind.gameColors)) {
				
			} */
	}
		
}

//trouble shooting script
//for (int print = 0; print <= 4; print++) {
//	 System.out.print("\n" +mind.gameColors[print] + " ");
//	 }