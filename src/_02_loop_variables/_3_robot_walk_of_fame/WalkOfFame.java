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
		// let's move speed control up here to go a bit faster..
		rob.setSpeed(40);
		// before line 17, turn how much.. .i think it messed it up
		// no.  this worked:
		rob.turn(270);
		rob.move(230);
		rob.turn(90);  // not here
		//here  .. did the star get drawn already by here?
		//no
		// when this is done it would be helpful to turn the robot to face up instead of left
		// can you add a turn here  good! look ok to you so far?yes
		// ok. now after each star is drawn, we want to move the robot to a spot where
		// it will eventually draw the next star. that nneds to happen where in the code?
		
		// can you identify the code that actually draws the star?
		
		// then this messed it up:
//		rob.turn(270);
//		rob.move(300);
// can i talk?
		// the robot starts off facing up the page so when you are doing line 15,
		// it is moving *up*.  
		
		// you need it to face *left* before it starts moving.  make sense?
		//but you need it to move *left*.  what can you do to
		// fix that?
		
		// 2. Make the robot draw a star shape. Hint: angle=144.
		// I think it's a 5-point star...but how am i suppost to do a cone like figure

		rob.setSpeed(40);
			rob.penDown();
			
			// just to be clear, can you identify a line number in the code where
			// the star is completely finished?
			for(int i=1; i<=5; i++) {
				// no semicolon at end of 'For' line 
			// here i think you should have a loop that repeats
			// 5 times.  inside the loop it moves forward 30,
				//what is the 30 for? the length of each line
			// then turns 144
				// try this and see what it looks like...
				
					// this is inside the loop that goes 5 times.... do you want that?
				rob.penDown();
				rob.move(100);
	// i think the pic is hiding under the robot!!...can i make 30 bigger to solve that?
				// good idea try it
						rob.turn(144);	// getting closer!idk
		// 3. Set the length of each line in the star to 30.
			}
			// it's done HERE ... after the for loop has completed
			// do you understand why? because its closed by }
			// yes.  but also because of what the for loop does here:
			// for 5 times it: draws a line and turns 144 degrees
			// only after this for loop completes is one full star done.  make sense?yes
			
			// ok.  so down here, let's move the robot to the right a bit to the next
			// location to draw a star:
			// it drew a line while moving.  if you want to get rid of it, do penUp() 
			//yea but were would it go
				rob.penUp();
				rob.turn(90);
				rob.move(120);	// maybe move a bit further aw
				// let me add code to make the bot face up again
				
				// better!  now how can we separate the stars a bit more
				
				// yay!!  so class is almost over.  maybe next time we work on having
				// 10 stars on the walk of fame, ok?ok
				
				rob.turn(-90);
				rob.penDown();
				for(int i=1; i<=5; i++) {	// you need to add a } i
				rob.move(100);
				rob.turn(144);
				
				}
				

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
