package week12.gui.layout.examples;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutExample {
	JFrame f;
	public BorderLayoutExample() {
		 f = new JFrame();    
	        
	     // creating buttons  
	    JButton b1 = new JButton("AA");  
	    JButton b2 = new JButton("BB");  
	    JButton b3 = new JButton("CC");
	    JButton b4 = new JButton("DD");  
	    JButton b5 = new JButton("EE");  
	    // creating an object of the BorderLayout class using   
	     // the parameterized constructor where the horizontal gap is 20   
	     // and vertical gap is 15. The gap will be evident when buttons are placed   
	     // in the frame  
	    f.setLayout(new BorderLayout(20, 15));  
	    f.add(b1, BorderLayout.NORTH); 
	    f.add(b2, BorderLayout.SOUTH);     
	    f.add(b3, BorderLayout.EAST);  
	    f.add(b4, BorderLayout.WEST);      
	    f.add(b5, BorderLayout.CENTER);     
	        
	    f.setSize(300, 300);    
	    f.setVisible(true);  
	}

	public static void main(String[] args) {
		new BorderLayoutExample();

	}

}
