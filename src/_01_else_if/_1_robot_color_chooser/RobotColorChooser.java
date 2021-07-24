
// DONE

package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;
import java.awt.Color;


import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		//for(int m=0; m<1; m++);
	//	System.out.println("what color pen do you want");
		//i need help plz
		
		// hi miranda!! sorry i was helping mariene
		// i'll help you here just a moment and after
		// doing the loop, we'll save work ok?
		
		//1. Create a new Robot
		Robot miranda = new Robot();
		
		// we don't need this in the loop cause we
		// keep reusing the same robot
		
		//4. Ask the user what color pen they would like the robot to draw with
		// go ahead here - how do you ask user for info? 
		//JOptionPane ... sound familiar?type the period
		// showInputDialog ... let the computer help you type
		//now this method showInputDialog returns to us the user's answer as a
		// String. 

		// we want this in the loop
		
		// how many time will this loop repeat? not sure?3
		// yep.  if i do the following change, will
		// it still repeat 3 times?yes correct.
		// so now i want to take all the code below and
		// move it inside the loop.  i'm going to do it
		// an easy way!
		
		for (int m = 1; m <= 3; m++) {
			
//		}	// i'm going to move this waaayyy down...
			// DONE!
			// now test the code - it should ask
			// you for a color 3 times
			// see how that worked?  questions?no
			// great lets save work.  and next class
			// start on new program
		
		//4. Ask the user what color pen they would like the robot to draw with
		String user = JOptionPane.showInputDialog("What color pen would you like?");
		if (user.equals("blue")) {		// user = blue needs fixing
					// blue should be in double quotes, and the equals sign doesn't work
			// here.  if you're comparing 2 strings, its more complicated, like here
			// it needs to check each character "b", "l", "u", "e"
			// that is done using the String equals() method  so:
			// user.equals("blue")   .. can you fix that above?  good  one more thing!
			
			System.out.println("blue");		
			miranda.setPenColor(Color.BLUE);
		}
		else if (user.equals("orange")) {	
			System.out.println("orange");
			miranda.setPenColor(Color.ORANGE);
			
		}
		else {
			System.out.println("magenta");		
			miranda.setPenColor(Color.magenta);		
		}
		
	
				//5. Use an if/else statement to set the pen color that the user requested
		        //6. If the user doesn't enter anything, choose a random color
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
	
		// test run it goes faster?  use setSpeed()
		
		miranda.setSpeed(20);
		miranda.penDown();		
		miranda.move(150);
		miranda.turn(90);
		miranda.move(150);
		miranda.turn(90);
		miranda.move(150);
		miranda.turn(90);
		miranda.move(150);
		miranda.turn(90);
		
	} // here!  and now ill comment it out above...
	
		// 2 things here:
		// 1.  who are you telling to set speed? the robot
		// miranda
		// 2.  you want to send that instruction to the
		// reobot *before* it draws the square!
		// move line 96 to a better spot
		// what lines of code draws the square?
		//3. Set the pen width to 10
		
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
			
			
			// so let's try a loop that repeats 3 times
			
			// and a bunch of the code above needs to go
			// *inside* the loop.  ill show you. so
			// the question to the user - what color;
			// the if-else stuff
			// and miranda the robot drawing the square ok?
			
			///and
			// while you try this i'll help mariene ok?

	}
}
