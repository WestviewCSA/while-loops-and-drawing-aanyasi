import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Runner extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
 
		
		
		/*
		 * Use the drawing methods below to draw a smiley face
		 */
		public void paint(Graphics pen) {
			
			System.out.println("paint");
			int x1 = 0;
			int y1 = 650;
			int i = 0;
			
			while(i <=650) {
				pen.drawLine(x1, 0, 0, y1);
				i+= 25;
				y1 -= 25;
				x1+= 25;
				
			}
			
			int x2 = 350;
			int y2 = 0;
			int a = 0;
			while(a <= 650) {
				pen.drawLine(x2, 0, 1000, y2);
				a+= 25;
				x2+= 25;
				y2+= 25;
				
			}
			
			for(int b = 0, x3 = 1000, y3 = 0; b<=650; b +=25) {
				pen.drawLine(x3, 650, 1000, y3);
				x3-= 25;
				y3+= 25;
				
			}
			
		
			for(int c = 0, x4= 650, y4 = 650 ; c <=650; c+= 25) {
				pen.drawLine(x4, 650, 0, y4);
				x4-= 25;
				y4-= 25;
			}
			
//			pen.drawLine(50, 100, 50,  100);
	//	
//			// DRAW CUBE
	//
//			pen.drawRect(10, 10, 100, 100);
//			pen.drawRect(30, 30, 100, 100);
//			pen.drawLine(10, 10, 30, 30);
//			pen.drawLine(110, 10, 130, 30);
//			pen.drawLine(10, 110, 30, 130);
//			pen.drawLine(110, 110, 130, 130);
	//
	//
	//
//			// DRAW SPHERE
	//
//			pen.drawOval(150, 150, 50, 50);
	//
	//
//			// DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
	//
//			pen.drawLine(300, 300, 220, 220);
//			pen.drawLine(300, 300, 300, 220);
//			pen.drawLine(220, 220, 300, 220);
	//
//			// DRAW APCS
	//
//			pen.setColor(Color.PINK);
//			pen.fillOval(300, 500, 100, 10);
	//
//			// DRAW PACMEN FLOWER
//		pen.setColor(Color.yellow);
//		pen.fillArc(0, 300, 100, 100, 35, 280);

			
		}

		
//		int lines = 30;
//		
//	
////		//variable for random collor
//
////		
//	    
//	
//
//
//for(int var1 = 0, var2 = 0; (var2 != 0) && ((var1 / var2) >= 0); var1++, var2--){
//	System.out.println(var1+" : "+var2);
//
//}



		
//		Graphics2D g2 = (Graphics2D) g;
//        g2.setStroke(new BasicStroke(5));
//        
//		 
//		//1) draw a concentric rectangle that's 10pixels from all sides of the "gray"
//		//portion of the GUI
//		g2.drawRect(10, 10, 765, 540);
//		
//		
//		
//		//2) Draw a horizontal line to bisect the Rectangle
//		g2.drawLine(10, 270, 770, 270);
//		
//		
//		//3) Draw a vertical line to bisect the shape again
//		g2.drawLine(765/2, 10, 765/2,550 );
//		
//		
//		//4) small rectangles on top-left
//		g2.drawLine(765/4, 10, 765/4, 550/2-10);
//		
		

		//drawing colorful lines
//	while(lines<80) {
//		
//		int randColor = (int) (Math.random() * (255-1 + 1) ) + 1;
//		int randCol2 = (int) (Math.random() * (255-1 + 1) ) + 1;
//		int randCol3 = (int) (Math.random() * (255-1 + 1) ) + 1;
//		g.setColor( new Color(randColor, randCol2, randCol3));
//		
//		int rand = (int) (Math.random() * ((765 - 10) + 1) ) + 10;
//		int rand1 = (int) (Math.random() * ((765 - 10) + 1) ) + 10;
//		int rand2 = (int) (Math.random() * ((765 - 10) + 1) ) + 10;
//		int rand3 = (int) (Math.random() * ((765 - 10) + 1) ) + 10;
//			
//			g2.drawLine(rand, rand1, rand2, rand3);

			//repeating code
		
		
		
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
		
		 

	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] arg) {
		Runner m = new Runner();
	}
	
	public Runner() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1000,700);
		f.add(this);
		f.setVisible(true);
		
	}
}
