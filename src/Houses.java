import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import javafx.scene.paint.Color;

public class Houses {
	static Robot HH = new Robot();
	
	public static void main(String[] args) {
		HH.setX(10);
		HH.setAngle(0);
		HH.setSpeed(200);
		HH.penDown();
		HH.hide();
		for(int z = 0; z < 10; z++) {
			String x = JOptionPane.showInputDialog("small, medium, or large?");
			
			drawHouse(x);
		
		}
	}
		public static void drawHouse(String h) {
			String color = JOptionPane.showInputDialog("black, yellow, or red?");
			int height = 0;
if(h.equals("small")) {
		
		height = 60;
			}
else if(h.equals("medium")) {
		
	height = 120;

		}
else if(h.equals("large")) {
		
	height = 250;
	
		}
//color
if(color.equals("black")) {
	HH.setPenColor(0,0,0);
		}
else if(color.equals("yellow")) {
	HH.setPenColor(239,255,0);
	}
else if(color.equals("red")) {
	HH.setPenColor(255,0,0);
	}
			
		HH.move(height);
		if(h.equals("medium") || (h.equals("large"))) {
		HH.turn(90);
		HH.move(30);
		HH.turn(90);
		}
		else if(h.equals("small")) {
			HH.turn(45);
			HH.move(15);
			HH.turn(90);
			HH.move(15);
			HH.turn(45);
		}
		
		HH.move(height);
		HH.setPenColor(33, 88, 1);
		HH.turn(-90);
		HH.move(20);
		HH.setAngle(0);
	}
		
	}

