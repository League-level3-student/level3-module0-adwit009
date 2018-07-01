package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		//2. create an array of 5 robots.
Robot[] array = new Robot[] {new Robot(), new Robot(), new Robot(), new Robot(), new Robot()};
		//3. use a for loop to initialize the robots.

			//4. make each robot start at the bottom of the screen, side by side, facing up
	for (int i = 0; i < array.length; i++) {
	
		array[i].setX(i*50);
		array[i].setY(650);
	}
		//5. use another for loop to iterate through the array and make each robot move 
	boolean xas = true;
	int winner = 0;
	//   a random amount less than 50.
    	while ( xas == true) {
			
			
	for (int i = 0; i < array.length; i++) {
		Random rng = new Random();
		int x = rng.nextInt(50);
    		
		array[i].setY(array[i].getY()-x);
	if (array[i].getY() <=0) {
		winner = i;
		xas = false;
	}	
	}
    	}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	JOptionPane.showMessageDialog(null, "Robot number "+ winner+ " wins");
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}
}
