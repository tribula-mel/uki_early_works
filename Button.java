package experimentaion;

import java.awt.*;
import javax.swing.*;

public class Button {  
	
public static void main(String[] args) {  
	
	//variables
	final int MIN = 0;
	final int MAX = 30;
	final int INIT = 15; 
	
	//objects
    JFrame f=new JFrame("Buttons");  
    JButton b=new JButton("Button 1");  
    JCheckBox c= new JCheckBox("Checkbox"); 
    JSlider s= new JSlider();
    
    //checkbox
    c.setBounds(100,100,150,25);    
    
    //button
    b.setBounds(150,100,150,25);
    
    //slider
    s = new JSlider(MIN, MAX, INIT);
    s.setMajorTickSpacing(10);
    s.setMinorTickSpacing(1);
    s.setPaintTicks(true);
    s.setPaintLabels(true);
    
    //frame
    f.setLayout(new FlowLayout());
    f.add(c);  
    f.add(b);
    f.add(s);
    f.setSize(400,400);  
    f.setVisible(true);
    
	}  
}  
