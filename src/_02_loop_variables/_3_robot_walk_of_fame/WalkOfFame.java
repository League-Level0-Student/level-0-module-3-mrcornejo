// CONTINUE NEXT CLASS

// wnat to look at previous robot code to refresh your memory?
// robot_color_chooser
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.

		// 2. Make the robot draw a star shape. Hint: angle=144.
		// I think it's a 5-point star...but how am i suppost to do a cone like figure

		rob.setSpeed();
			rob.penDown();	
			for(int i=1; i<=5; i++) // no semicolon at end of 'For' line 
			// here i think you should have a loop that repeats
			// 5 times.  inside the loop it moves forward 30,
				//what is the 30 for? the length of each line
			// then turns 144
			rob.move()
		// 3. Set the length of each line in the star to 30.
			
			// class is over in about 5 minutes.  save your work.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of 10 stars (see recipe to see how it should look)
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
