// CONTINUE NEXT CLASS

package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		
		// 1. Set the X position of the robot so that it starts on the left. 
		// how's it going?  you there?
		// btw "pseudocode" is not real code
		// for example, when i say 'for (10 times)
		// real code might look like this: for(int i = 1; i <=1-; i++)
		
		// so what concepts are missing? idk moving places bc
		//it makes a star in the same place
		// yes.  and when it moves to a new place, 
		// should it draw that move?no so move, then pen down.
		//once done . wyietsh star pen up, move, so on....
		// yes, so since class is almost over, lets just
		// put a comment in the code for this and save work...
		// where does the comment go "move to next place"
		// not sure? i'll show you.  ok? 
		// can i help you save your work?ye
		
		rob.setSpeed(40);
		for (int e=1; e<=10; e++) {
			for (int p=1; p<=5; p++) { 
				rob.penDown();
				rob.move(100);	// my pseudocode
				// said move forward a line length 100
				// good ... somewhere you *should* put
				// the pen down so it draws
				rob.turn(144);
			}
			// pick pen up here and move to next place
		}
		/*
			
		rob.turn(270);
		rob.move(230);
		rob.turn(90);  
		
		
		
		
		// 2. Make the robot draw a star shape. Hint: angle=144.
		

		rob.setSpeed(40);
			rob.penDown();
// you created the name 'i' twice			
			for(int m=1; m<=5; m++) {
				
				rob.penDown();
				rob.move(100);
	
						rob.turn(144);	
		// 3. Set the length of each line in the star to 30.
			}
		
				rob.penUp();
				rob.turn(90);
				rob.move(120);	
				
/*
		// so apparently this section moves the robot
		// to a good spot and draws one star.
		// let's now cooment out this section and
		// uncooment the section above
		
		/*
				rob.turn(-90);
				rob.penDown();
				for(int r=1; r<=5; r++) {	
				rob.move(100);
				rob.turn(144);
				//it didn't work it made a line and for some
				//it went over another star
				// ok lets try to identify the original code that worked
				// and see what we can do with it
				// try commenting out the new code you
				// just added.  
				 * so that can be turn into a loop right
				 * because when the robot stops it's a starting
				 * point for another to begin.... am i wrong?
				 * 
				 * yeah, that's the gist.  now if i were
				 * doing this program i would start with
				 * pseudocode which is like an outline in
				 * programming.  my pseudocode would look like
				 this:
		move to left side of screen
		for (10 times) {//this is like the loop right
			// this for loop below creates ONE star
			 * ONE star has 5 lines in it oooo ok i g
			 * et it
			 * i want to work with another student for
			 * a bit.  try working on the code yourself ok
			for (5 times) { //? but what is this
				draw a line 100 long
				turn 144 degrees//this is to creat the star
				YES
			}
			move a bit to the right to get to next star
		}
		
		does this pseudocode make sense?im a bit confused
		ok about what?
		
		
		
		//to comment
				// out a section.  i'll show you an example
				}
			*/	

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of 10 stars (see recipe to see how it should look)
		 * 
		 * lets try this ... first let's see if we can draw one star that's on the left
		 * side of the picture, rather than in the middle.  any ideas?
		 * well i remember that in one of the first classes i took we moved the robot to were 
		 * we wanted to to start and then put the pen down to start drawing 
		 * good - want to try adding code above that does that idea?
		 * Hint: The distance between stars is 50.
		 */

	}	// this got erased by accident

}
