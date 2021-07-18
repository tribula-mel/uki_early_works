//package experimentaion;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;

public class RubiksCube {
	
	private char sides[][] = new char[][] {{'r','r','r','r'},{'o','o','o','o'},{'y','y','y','y'},{'w','w','w','w'},{'g','g','g','g'},{'b','b','b','b'}};
	private char cache[] = new char[] {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
	private int arrange[] = new int[] {0, 1, 2, 3, 4, 5};
	
	private JFrame frame;
	private JButton slot0, slot1, slot2, slot3, upRight, upLeft, downRight, downLeft, rightUp, rightDown, leftUp, leftDown;
	
	final int height;
	final int width;
	
/*	Sides Of The Cube
 *	private char sideForward[] = new char[] {'r','r','r','r'};
 *  private char sideBackward[] = new char[] {'o','o','o','o'};
 *	private char sideLeft[] = new char[] {'y','y','y','y'};
 *	private char sideRight[] = new char[] {'w','w','w','w'};
 *	private char sideUp[] = new char[] {'g','g','g','g'};
 *	private char sideDown[] = new char[] {'b','b','b','b'};	*/
	
	@SuppressWarnings("serial")
	public RubiksCube() {
		
		frame = new JFrame("2x2 Rubiks Cube Modeler");
		
		slot0 = new JButton();
		slot1 = new JButton();
		slot2 = new JButton();
		slot3 = new JButton();
		
		height = 50;
		width = 50;
		
		upRight  = new JButton(new AbstractAction("\u02C4") {
			 @Override
		        public void actionPerformed( ActionEvent e ) {
				 
				 rotateUp(1);
				 changeColorSlots();
							
		        }
		    });
	
		upLeft  = new JButton(new AbstractAction("\u02C4") {
			 @Override
		        public void actionPerformed( ActionEvent e ) {
				 
				 rotateUp(0);
				 changeColorSlots();
	
		        }
		    });
		
		downRight  = new JButton(new AbstractAction("\u02C5") {
			 @Override
		        public void actionPerformed( ActionEvent e ) {
				 
				 rotateDown(0);
				 changeColorSlots();
	
		        }
		    });
		
		downLeft  = new JButton(new AbstractAction("\u02C5") {
			 @Override
		        public void actionPerformed( ActionEvent e ) {
				 
				 rotateDown(1);
				 changeColorSlots();
	
		        }
		    });
		
		
		rightUp  = new JButton(new AbstractAction("\u02C3") {
			 @Override
		        public void actionPerformed( ActionEvent e ) {
				 
				 rotateRight(0);
				 changeColorSlots();
							
		        }
		    });
	
		rightDown  = new JButton(new AbstractAction("\u02C3") {
			 @Override
		        public void actionPerformed( ActionEvent e ) {
				 
				 rotateRight(1);
				 changeColorSlots();
	
		        }
		    });
		
		leftUp  = new JButton(new AbstractAction("\u02C2") {
			 @Override
		        public void actionPerformed( ActionEvent e ) {
				 
				 rotateLeft(0);
				 changeColorSlots();
							
		        }
		    });
	
		leftDown  = new JButton(new AbstractAction("\u02C2") {
			 @Override
		        public void actionPerformed( ActionEvent e ) {
				 
				 rotateLeft(1);
				 changeColorSlots();
	
		        }
		    });
		
	}
	
	public void rotateUp(int column) {
		
		if (column == 0) {
			
			for (int i = 0; i <= 3; i++) {
				
				cache[i] = sides[arrange[2]][i];	
				
			}
			
			sides[arrange[2]][0] = cache[3];
			sides[arrange[2]][1] = cache[0];
			sides[arrange[2]][2] = cache[1];
			sides[arrange[2]][3] = cache[2];
			
			cache[0] = sides[arrange[0]][0];
			cache[1] = sides[arrange[0]][3];
			cache[2] = sides[arrange[4]][0];
			cache[3] = sides[arrange[4]][3];
			cache[4] = sides[arrange[1]][0];
			cache[5] = sides[arrange[1]][3];
			cache[6] = sides[arrange[5]][0];
			cache[7] = sides[arrange[5]][3];
			
			sides[arrange[0]][0] = cache[6];
			sides[arrange[0]][3] = cache[7];
			sides[arrange[4]][0] = cache[0];
			sides[arrange[4]][3] = cache[1];
			sides[arrange[1]][0] = cache[2];
			sides[arrange[1]][3] = cache[3];
			sides[arrange[5]][0] = cache[4];
			sides[arrange[5]][3] = cache[5];
			
		} else if (column == 1) {
			
			for (int i = 0; i <= 3; i++) {
				
				cache[i] = sides[arrange[3]][i];	
				
			}
			
			sides[arrange[3]][0] = cache[1];
			sides[arrange[3]][1] = cache[2];
			sides[arrange[3]][2] = cache[3];
			sides[arrange[3]][3] = cache[0];
			
			cache[0] = sides[arrange[0]][1];
			cache[1] = sides[arrange[0]][2];
			cache[2] = sides[arrange[4]][1];
			cache[3] = sides[arrange[4]][2];
			cache[4] = sides[arrange[1]][1];
			cache[5] = sides[arrange[1]][2];
			cache[6] = sides[arrange[5]][1];
			cache[7] = sides[arrange[5]][2];
			
			sides[arrange[0]][1] = cache[6];
			sides[arrange[0]][2] = cache[7];
			sides[arrange[4]][1] = cache[0];
			sides[arrange[4]][2] = cache[1];
			sides[arrange[1]][1] = cache[2];
			sides[arrange[1]][2] = cache[3];
			sides[arrange[5]][1] = cache[4];
			sides[arrange[5]][2] = cache[5];
			
		}
		
	}
	
	public void rotateDown(int column) {
		
		for (int i = 0; i <= 2; i++) {
			
			rotateUp(column);
			
		}
		
	}
	
	public void rotateRight(int row) {
		
		if (row == 0) {
			
			for (int i = 0; i <= 3; i++) {
				
				cache[i] = sides[arrange[4]][i];
				
			}
			
			sides[arrange[4]][0] = cache[3];
			sides[arrange[4]][1] = cache[0];
			sides[arrange[4]][2] = cache[1];
			sides[arrange[4]][3] = cache[2];
			
			cache[0] = sides[arrange[0]][0];
			cache[1] = sides[arrange[0]][1];
			cache[2] = sides[arrange[3]][0];
			cache[3] = sides[arrange[3]][1];
			cache[4] = sides[arrange[1]][0];
			cache[5] = sides[arrange[1]][1];
			cache[6] = sides[arrange[2]][0];
			cache[7] = sides[arrange[2]][1];
			
			sides[arrange[0]][0] = cache[6];
			sides[arrange[0]][1] = cache[7];
			sides[arrange[3]][0] = cache[0];
			sides[arrange[3]][1] = cache[1];
			sides[arrange[1]][0] = cache[2];
			sides[arrange[1]][1] = cache[3];
			sides[arrange[2]][0] = cache[4];
			sides[arrange[2]][1] = cache[5];
			
		} else if (row == 1) {
			
			for (int i = 0; i <= 3; i++) {
				
				cache[i] = sides[arrange[5]][i];
				
			}
			
			sides[arrange[5]][0] = cache[1];
			sides[arrange[5]][1] = cache[2];
			sides[arrange[5]][2] = cache[3];
			sides[arrange[5]][3] = cache[0];
			
			cache[0] = sides[arrange[0]][2];
			cache[1] = sides[arrange[0]][3];
			cache[2] = sides[arrange[3]][2];
			cache[3] = sides[arrange[3]][3];
			cache[4] = sides[arrange[1]][2];
			cache[5] = sides[arrange[1]][3];
			cache[6] = sides[arrange[2]][2];
			cache[7] = sides[arrange[2]][3];
			
			sides[arrange[0]][2] = cache[6];
			sides[arrange[0]][3] = cache[7];
			sides[arrange[3]][2] = cache[0];
			sides[arrange[3]][3] = cache[1];
			sides[arrange[1]][2] = cache[2];
			sides[arrange[1]][3] = cache[3];
			sides[arrange[2]][2] = cache[4];
			sides[arrange[2]][3] = cache[5];
			
		}
		
	}
	
	public void rotateLeft(int row) {
		
		for (int i = 0; i <= 2; i++) {
			
			rotateRight(row);
			
		}
		
	}
	
	public void changeColorSlots() {
	
		changeColor(slot0, 0);
		changeColor(slot1, 1);
		changeColor(slot2, 2);
		changeColor(slot3, 3);
		
	}
	
	
	public void changeColor(JButton change, int turn) {
		
		if (sides[arrange[0]][turn] == 'r') {
		
			change.setBackground(Color.RED);
			
		} else if (sides[arrange[0]][turn] == 'o') {
			
			change.setBackground(Color.ORANGE);
			
		} else if (sides[arrange[0]][turn] == 'y') {
			
			change.setBackground(Color.YELLOW);
			
		} else if (sides[arrange[0]][turn] == 'w') {
			
			change.setBackground(Color.WHITE);
			
		} else if (sides[arrange[0]][turn] == 'g') {
			
			change.setBackground(Color.GREEN);
			
		} else if (sides[arrange[0]][turn] == 'b') {
			
			change.setBackground(Color.BLUE);
			
		}
		
	}
	
	public void createGUI() {
		
		slot0.setBounds(150, 150, width, height);
		slot1.setBounds(200, 150, width, height);
		slot2.setBounds(200, 200, width, height);
		slot3.setBounds(150, 200, width, height);
		upRight.setBounds(200, 100, width, height);
		upLeft.setBounds(150, 100, width, height);
		downRight.setBounds(150, 250, width, height);
		downLeft.setBounds(200, 250, width, height);
		rightUp.setBounds(250, 150, width, height);
		rightDown.setBounds(250, 200, width, height);
		leftUp.setBounds(100, 150, width, height);
		leftDown.setBounds(100, 200, width, height);
		
		slot0.setBackground(Color.RED);
		slot1.setBackground(Color.RED);
		slot2.setBackground(Color.RED);
		slot3.setBackground(Color.RED);
		
		frame.add(slot0);
		frame.add(slot1);
		frame.add(slot2);
		frame.add(slot3);
		frame.add(upRight);
		frame.add(upLeft);
		frame.add(downRight);
		frame.add(downLeft);
		frame.add(rightUp);
		frame.add(rightDown);
		frame.add(leftUp);
		frame.add(leftDown);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(400, 400);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		RubiksCube cube = new RubiksCube();
		
		cube.createGUI();
		
	}
	
}
