import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Runner extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	public void paint(Graphics g) {
		
		//make variable 
		int lines = 30;
		
	
//		//variable for random collor

//		
		
		
		Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        
		 
		//1) draw a concentric rectangle that's 10pixels from all sides of the "gray"
		//portion of the GUI
		g2.drawRect(10, 10, 765, 540);
		
		
		
		//2) Draw a horizontal line to bisect the Rectangle
		g2.drawLine(10, 270, 770, 270);
		
		
		//3) Draw a vertical line to bisect the shape again
		g2.drawLine(765/2, 10, 765/2,550 );
		
		
		//4) small rectangles on top-left
		g2.drawLine(765/4, 10, 765/4, 550/2-10);
		
		

		//drawing colorful lines
	while(lines<80) {
		
		int randColor = (int) (Math.random() * (255-1 + 1) ) + 1;
		int randCol2 = (int) (Math.random() * (255-1 + 1) ) + 1;
		int randCol3 = (int) (Math.random() * (255-1 + 1) ) + 1;
		g.setColor( new Color(randColor, randCol2, randCol3));
		
		int rand = (int) (Math.random() * ((765 - 10) + 1) ) + 10;
		int rand1 = (int) (Math.random() * ((765 - 10) + 1) ) + 10;
		int rand2 = (int) (Math.random() * ((765 - 10) + 1) ) + 10;
		int rand3 = (int) (Math.random() * ((765 - 10) + 1) ) + 10;
			
			g2.drawLine(rand, rand1, rand2, rand3);

			//repeating code
			lines++;
		}
		
		/* 
		 * int var = 0; 						<---- control variable
		 * while(var < 10){ 					<---- condition to run the loop
		 *   
		 *   //any repeating code
		 *   
		 *   var++;								<---- update control variable
		 *   
		 * }
		 */
		
		 

	
	
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] arg) {
		Runner m = new Runner();
	}
	
	public Runner() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
}
