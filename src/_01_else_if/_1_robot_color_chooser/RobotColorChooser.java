
// we can work on this more at next class

package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;
import java.awt.Color;


import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		// remember how to work with the Robot?  or need help getting started? I need help with
		//creating the robot  ok first we need to check if we imported the League's Robot
		// class...
		//1. Create a new Robot
		Robot miranda = new Robot();	// what do you want to name it?
		
		
		// do these FIRST
		//4. Ask the user what color pen they would like the robot to draw with
		// go ahead here - how do you ask user for info?  need help? i'm trying to remember
		//how to start it, i know that you put the question in (""); and then the colore in ()
		// ok a little refresher - we use a method in JOptionPane ... sound familiar?
		// shows try again we're looking for  type the period for good help
		// showInputDialog ... let the computer help you type
		// good!  now this method showInputDialog returns to us the user's answer as a
		// String.  how do we save the user's answer?i dont remember 
		// to save a value in a variable, we need to create the variable, which
		// means saying its data type and its name, and then we need to give it a value
		// using the equals sign  for example,
		// String whatever = 
		// tho we should give the variable a more descriptive name than whatever
		// want to try this now?k running or using the string...i don't understand. U said u
		//want to try i said yes but try running it or using the string 
	// i meant write the code  use double quotes
		
//		JOptionPane.showInputDialog("What color pen would you like?");
//		String user = "blue";	// dont need parentheses here
		// ok.  so you just created a variable named 'user'.  it has a data type 'String'.
		// you gave it a value using the equals sign and its value is now "blue".
		// make sense?y
		// lets improve on this. what we really want is to give the variable 'user'
		// the value that was entered using showInputDialog....
		
		// we need to replace "blue" with the showInputDialog.  let me show you
		// does line 48 make a little more sense now??yes

		//4. Ask the user what color pen they would like the robot to draw with
		// ok we did step 4!! go on to step 5 now  keep typing your ideas then we'll adjust
		String user = JOptionPane.showInputDialog("What color pen would you like?");
		if (user.equals("blue")) {		// user = blue needs fixing
					// blue should be in double quotes, and the equals sign doesn't work
			// here.  if you're comparing 2 strings, its more complicated, like here
			// it needs to check each character "b", "l", "u", "e"
			// that is done using the String equals() method  so:
			// user.equals("blue")   .. can you fix that above?  good  one more thing!
			
			System.out.println("blue");		// we don't need this line but its ok to keep it
			
			// what we really want to do here is instruct
			// the robot to color in "blue"  ... any guess how to do that?no
			// what is the name of your robot?  type it here what is the magic
			// character to type next so that a menu of methods shows up?
			// great!  now the method wants something inside the parentheses that
			// is of type 'Color' not 'String' ... I know this is confusing.  let me
			// show you
			miranda.setPenColor(Color.BLUE);
		}
		else {
			System.out.println("magenta");		// I'd like you to pick a color my fav!! put in quotes
// now tell robot miranda to color in purple:
			miranda.setPenColor(Color.magenta);		// geez purple isn't in the list!!
		}
		// can i help you adjust now?yes
				//5. Use an if/else statement to set the pen color that the user requested
		        //6. If the user doesn't enter anything, choose a random color
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
		// can you make it draw a square using the methods move() and turn()?
		// you are telling 'miranda' to move and turn... not moveTo
		
		// please let me type so we dont lose work, class is almost over
		miranda.penDown();		// this is why it didn't draw
		miranda.move(150);
		miranda.turn(90);
		miranda.move(150);
		miranda.turn(90);
		miranda.move(150);
		miranda.turn(90);
		miranda.move(150);
		miranda.turn(90);
		//it said u
		// good lets try what you have so far
		//3. Set the pen width to 10
		
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		





	}
}
