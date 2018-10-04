//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(101);

		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		for (int i = 0; i < 10; i++) {

			// 1. Ask the user for a guess using a pop-up window, and save their response
			String s = JOptionPane.showInputDialog("Guess a number.");

			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int answer = Integer.parseInt(s);
			// 5. if the guess is correct
			if (answer == random) {
				// 6. Win
				JOptionPane.showMessageDialog(null, "You Win!!");
				try {
					Thread.sleep(700);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.exit(0);
			}
			// 12. Use "System.exit(0);" to quit the game if the user guessed the right
			// answer.
			// 7. if the guess is high
			else if (answer > random) {
				// 8. Tell them it's too high
				JOptionPane.showMessageDialog(null, "Your guess was too high.");
				try {
					Thread.sleep(700);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				// 9. if the guess is low
				// 10. Tell them it's too low
				JOptionPane.showMessageDialog(null, "Your guess was too low.");
				try {
					Thread.sleep(700);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					// 13. Tell them they lose
				}
			}
		}
	}
}
