//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot r = new Robot();
		//3. Ask the user what color they would like the robot to draw
		String s = JOptionPane.showInputDialog("What primary color do you want to draw with?");
		//5. Use an if/else statement to set the pen color that the user requested
		if(s == "red"){
			r.setPenColor();
			
		}
			else if(s == "green"){
			
				
			}		
			else if(s == "blue") {
				
				
				
			}
			else{
		
				
			}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
	for (int i = 0; i < 4; i++) {
		r.move(100);
		r.turn(90);
}

	}
}
