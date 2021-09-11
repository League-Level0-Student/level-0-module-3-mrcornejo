
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		// the code starts off asking the user for a number
		// representing how many cats.  a whole number is
		// stored in a variable of type 'int'.
		// Unfortunately JOptionPane returns the user's
		// answer as a String which is a very different
		// data type.  it's hard to explain.  i wish I had
		// a whiteboard to draw on!  let's say for example
		// the user has 935 cats :) ... storing the number
		// as an 'int' is different than as a String.  as
		// a String it gets stored as a list of digits: 9, 3, 5
		// see how different that is?yes
		
		// ok.  so manipulating the number 935 as an int
		// is different code than manipulating it as a String.
		// as a String, all you can do is check the list of
		// digits matches, e.g.:
		//String user = "935";
		//if (user.equals("935"))	// this would test if
			// the String user has the list 9, 3, 5
			
		// down below in your code, we converted the String
			// to an 'int'
		//	int catsInt = Integer.parseInt(user);
			// so now we can do number comparisons with it
			// like is it equal to a number or greater than
			// or less than
		//if (catsInt == 935)..
		//if (catsInt > 0)
			

		// 1. Ask the user how many cats they have
		String user = JOptionPane.showInputDialog("how many cats do you have?");
		
		// yes.  let me explain.  showInputDialog() is a method that returns a value, in
		// this case the number of cats.  the equals sign I read as "gets".  So here
		// String variable 'user' *gets* the number the user entered.
		
		// user is not descriptive of the answer tho.  i would call it something like numCats.
		
		// mariene is here i'll get her a vnc.  be back.k
		
		// ok i'm here.  i'll go back and forth between you and mariene. sorry!
		// so... JOptionPane methods always return a String.  but sometimes you need info in
		// int form.  String and int are different!  String stores a list of characters.
		// so weirdly, if I want to store the number 123 as a String, it stores 1 ... 2...3
		// and we can't do math with the String! does this make some sense?not really
		// it's hard to explain but the computer has a code for each key on your keyboard.  Its
		// called ASCII.  The code for the key that has the digit 1 on your keybaord is I think 49!!
		// so we have to tell the computer to turn it into the number 1.  if you're interested,
		// i put a link in the zoom chat to an ascii table.  you there?yes ok.
		
		// in this program we need to convert the user's answer from a String to an int.  step 2.
		
		
//wait!  this method returns a value - the user's input.
		// and you want to save the answer in a variable -
		// how do you do that?
		
		//wouldn't that be done with setp 2? no its in step 
	// line 12 is incomplete...
		// want to look at a previous example?yes
		// 2. Convert their answer into an int  I'll show you
		int catsInt = Integer.parseInt(user);		// fix what goes in the ()  good.
		
		// now I want you to try writing an if - else if sequence that does steps 3 4 and 5.
		// i'm going to check on mariene

// CLASS IS ALMOST OVER>  LETS SAVE WORK AND CONTINUE FIXING THIS SECTION NEXT TIME OK?
		// hmm it looks like your latest code wasn't saved!!
		
		// maybe you can fix the code again - good practice!
		
		// there are 2 things:
		// 1.  the test conditions for the 2nd and 3rd if's
		// are wrong, and
		// 2.  it would be more efficient to do an 
		// "if -else if" series
		
		// want help saving work?yes
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		if (catsInt >= 3)	// can you fix the test?  good start but don't use 'user' here!
		// need help?yes pls.  notice NO double quotes here.  that's only for String stuff
				System.out.println("You are a crazy cat lady.");
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		//    Hint: You can use the && operator 
		else if (catsInt < 3 && catsInt > 0)
				System.out.print("https://www.youtube.com/watch?v=QtC3Bo9B0yI");
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		else if (catsInt==0) {
				System.out.println ("https://www.youtube.com/watch?v=oj_yLBltPE8");
				playVideo("https://www.youtube.com/watch?v=oj_yLBltPE8");

		}
				// another problem .. there should be no semicolon
				// on an 'if' line of code
				
// i'm back.  want help with line 96?yes .  to test
		// the value in catsInt using an AND, each
		// test needs to be separate. let me show you.
		// do you follow?  good.  now i'll just clean up
		// some indentation..done!  want to try it? try what
		// run the program
		
		// ok, the code works.  i'm not sure if we were
		// able to get a video to run.  i'll test this
		// now, but i don't think it works.
		
				
				// ok.  so a few things i'd like to address.  first when you do if (something)
				// the something is actually called a test condition.  in this program
				// we want to test something numeric like > 3, < 3, == 3.  etc.  but
				// your test coditions are testing String values eg user.equals("...")
				// that's not what we want here.  that's why we did line 43 to turn the user
				// input from a String to an int.  so test catsInt
		
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
