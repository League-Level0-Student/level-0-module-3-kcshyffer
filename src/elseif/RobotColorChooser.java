//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot r = new Robot();
		
		for (int y = 0; y < 54; y++) {
			
		
		//3. Ask the user what color they would like the robot to draw
		String s = JOptionPane.showInputDialog("What primary color do you want to draw with?");
		//5. Use an if/else statement to set the pen color that the user requested
		if(s.equals ("red")){
			r.setPenColor(255,0,0);
			
		}
			else if(s.equals ("green")){
				r.setPenColor(0,255,0);
				
			}		
			else if(s.equals ("blue")) {
				
				r.setPenColor(0,0,255);
				
			}
			else{
				Random randy = new Random();
				int random1 = randy.nextInt(256);
				int random2 = randy.nextInt(256);
				int random3 = randy.nextInt(256);

				r.setPenColor(random1,random2,random3);
				
				
				
		}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		r.setPenWidth(10);
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
		r.penDown();
		r.setSpeed(99);
		for (int i = 0; i < 3; i++) {
		r.move(100);
		r.turn(90);
}
		r.move(100);
		}

	}
}
