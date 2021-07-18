//package clicker;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Container;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Clicker {
	
	private JFrame frame;
	private JPanel panel;
	private JSlider minCPS, maxCPS;
	private Random rand;
	private int minimumCPS = 1;
	private int maximumCPS = 1;
	
	public Clicker() {
		
		rand = new Random();
		frame = new JFrame("AutoClicker");
		panel = new JPanel();
		minCPS = new JSlider(1, 25, 13);
		maxCPS = new JSlider(1, 50, 25);
		
		minCPS.addChangeListener(new ChangeListener(){
		      @Override
		      public void stateChanged(ChangeEvent c) {
		    	  
		    	  minimumCPS = minCPS.getValue();
		    	  
		      }
		    });
	
		maxCPS.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent c) {
				
				maximumCPS = maxCPS.getValue();
				
				if (maxCPS.getValue() == 1) {
					
					minCPS.setMaximum(maxCPS.getValue());
				
				} else {
					
					minCPS.setMaximum(maxCPS.getValue() - 1);
					
				}
				
	      }
	    });
	
		panel.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
				System.out.println("test2");
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
					
				System.out.println("Test0");
				
			/*	int c; 
				int keycode = e.getKeyCode();
				
				while (keycode == KeyEvent.VK_X) {
					 
					c = rng();
					
					try {
						
						TimeUnit.MILLISECONDS.sleep(c);
						
						System.out.println(c);
						
					} catch (InterruptedException f) {
						
						System.out.println("error");
						
					}	
					
					maxCPS.setMaximum(5);
					
				} */
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
				System.out.println("test1");
				
			}
		});
		
	}
	
	public void createGUI() {
		
		minCPS.setMajorTickSpacing(5);
		minCPS.setMinorTickSpacing(1);
		minCPS.setPaintTicks(true);
		minCPS.setPaintLabels(true);
		minCPS.setBounds(50,150,250,50);
		
		maxCPS.setMajorTickSpacing(5);
		maxCPS.setMinorTickSpacing(1);
		maxCPS.setPaintTicks(true);
		maxCPS.setPaintLabels(true);
		maxCPS.setBounds(50,100,250,50);
		
		frame.add(minCPS);
		frame.add(maxCPS);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(400, 400);
		frame.setVisible(true);

      minCPS.setFocusable(false);
      maxCPS.setFocusable(false);
      panel.setFocusable(true);
      Container contentPane = frame.getContentPane();
      contentPane.add(panel);
	}
	
	public long setSeed() {
		
		LocalDateTime time = LocalDateTime.now();
		DateTimeFormatter date = DateTimeFormatter.ofPattern("n");
		String formattedDate = time.format(date);
		long seed = Long.parseLong(formattedDate);
		
		return seed;
		
	}
	
	public int rng() {
		
		int delay;
		
		delay = rand.nextInt((1000/minimumCPS - 1000/maximumCPS) + 1) + (1000/maximumCPS);
		
		return delay;
		
	}
	
	public static void main(String[] args) {
		
		Clicker click = new Clicker();
		
		click.rand.setSeed(click.setSeed());
		click.createGUI();
		
	/*	int c;
		
		while (true) {
			
			c = click.rng();
		
			try {
				
				TimeUnit.MILLISECONDS.sleep(c);
				
				System.out.println(c);
				
			} catch (InterruptedException e) {
				
				System.out.println("error");
				
			}
		
		} */
		
	}

}
