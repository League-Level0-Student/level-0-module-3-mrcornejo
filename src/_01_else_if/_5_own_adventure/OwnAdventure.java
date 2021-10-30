// CONTINUE CODING OUTLINE


package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// i suggest you plan out your story in a comment section..
		//Christmas... do you like Christmas? ok.
		// how do you want to proceed if they say yes?
		//me too, I believe it can be a holiday that brings
		//families together.  that's nice.  so if the
		// user says yes, maybe you can ask if they
		// are going to visit family or if the family is
		// coming to them.
		// one last thing: what will you say if the user
		// says they are going to visit family?
		//hope you have a safe trip and most of all have fun
		// what will you say if the family is coming to them?
		//get ready!!
		
		// and what if they say no?
	// CAN YOU FINISH the pseudocode below to include this part?
		//which holiday do you prefer halloween or easter?
		//where in pseudocode is no i dont like xmas
		//should you ask this question? no
		// great choices.  so if they answer halloween,
		// what message should your code print out?
		//halloween is a fun and a time to be crazy with costumes 
		// for easter, what message?
		//easter reminds me of pastel colors
// I'll put Q when it should ask a question and M to output a 
		//message
//************ PSEUDOCODE SECTION start **********/
				// next class you can work on making sure
				// code down below matches this pseudocode
				// ok?yes
				// let me help you save work i saved a
				// temp token password from last time.
				// also fixing are you happy
		
		/*********
		STOP theres an easier way to comment out a wholee section :)
		ans1 = Q: like xmas?
		if yes {	// yes i like xmas
			M: me too, I believe it can be a holiday that ..
			ans2 = Q: going to visit family?
			if yes {
				M: safe trip/fun
			}
			else {	//no
				M: get ready
			}
		}
		else {  // no i don't like xmas
			ans3 = Q: hich holiday do you prefer halloween or easter?
			if (hallow) {
				M:halloween is a fun and a time to be crazy with costumes
			}
			else {	// easter
				M: easter reminds me of pastel colors
			}
		}
		*********/
		
		// i helped you write this pseudocode last week..now
		// i'd like to see if you understand it or have any questions.
		// and then see if you can match up the real code below such
		// that it follows your pseudocode (which is an outline).  ok?ok
//************ PSEUDOCODE SECTION end **********/
		
		
		// ok great plan Miranda!  This is often what a
		// programmer does *before* starting to code.
		// it's like writing an outline before writing
		// the essay :)    ... ready to code?yes
// good start ... we need to save work soon .. let me know
		// when you're ready for that ok
		//imready
// can i talk to you about joptionpane?yes
		// it has many methods.  the 2 we often use
		// are showMessageDialog which prints out a messsage
		// and showInputDialog, which returns a response
		// from the user.  what do we want to use here?message
		// so you don't want a response from the user??
		// then what is 'answer'?ooo..so inputDialog shows message and requests a responce 
		
	// let's make sure the curly braces match  .. hmm. braces on line 90 and 100 need to be a pair but
		// they're not
		// see how that fixed things?  curly braces are really important here
		
		// I am sorry but could I save and be done for today... my mom needs to go somewhere an yes
		
		String answer = JOptionPane.showInputDialog("Do you like Christmas?");
		if (answer.equals("yes")) {
			System.out.println("Me too, I believe it can be a holiday that brings families together.");
			String answer2 = JOptionPane.showInputDialog("Are you goint to visit family?");
			// in the code just below, test answer2, NOT answer
			if (answer2.equals("yes")) {  // this line is missing an open curly brace!
				System.out.println("Hope you have a safe trip and most of all have fun!");
			}
			else if (answer2.equals ("no")) {	// yeah!  this code is done.
				System.out.println("Well hope you have fun!!");		// all is good except this never happened why?
				// i see a slight problem...do you?no  when you asked 'going to visit family?' what is the
				// exact name of the variable that you saved the response in?the 2  it's on line 98  
				// what is the name of the variable on line 98?  answer2  good.  now when you did the if-else
				// starting on line 99,
				// is THAT the variable you tested?no  do you understand that the if-else starting on line 99
				// should be testing the response you stored in answer2?  but instead it's testing the response
				// you stored in answer (do you like xmas).  do you see the problem and how to fix it?
		}
	}// end "if you DO like christmas
		else {	// if DONT like cristmas:
			String answer3 = JOptionPane.showInputDialog("Which holiday do you prefer halloween or easter?");  // is this saving the response??idk
			// identify another line above that asks a question and saves the response...OF REAL CODE, not pseudocode idr
// look at line 95 or 98 above.  the code asks a question and saves the response in a variable.  good!
			// but line 107 just prints out a question and has no way to save a response
			// you still there?sorry i was kicked out...the internet was weak  no prob
			// are you here?
			// looks like I lost you in zoom...
			if (answer3.equals("halloween")) {	// now fix the stuff inside the parentheses...
				System.out.println("Halloween is a fun and a time to be crazy with costumes");
			}
			else {
				System.out.println("Easter reminds me of pastel colors");
			}
			
			//i dont know   which 'else' is this in the pseudocode? )
		}
		//else if (answer.equals("no"))
			//System.out.println("which holiday do you prefer halloween or easter?");
	
		//i need a bit of help on this.  can you
		// describe the problem? when i put which holiday do 
		//you prefer h or e? ooooo never mind it's bc it cant
		//respond.. bc theirs no one else..i understand now :)
		//well i think im done  really?  did you run the
		// program and test all possibilities in your script?yes
		// hmm...i think some stuff is missing...
		// lets go back to the script and i'll show you
		// how i'd turn it into something called 'pseudocode'
		
// is the user's response to line 54 being saved?idk
		// to save something, it needs to be stored in a
		// variable using the equals sign (which I like to
		// read as 'gets' rather than 'equals').  for example
		// lets say you have a variable 'num', then
		// num = 5 I read as 'num gets 5'.
		// look at line 50 above.  it says 
		// 'answer gets the value returned by the
		// showInputDialog() method'.  now look at the line
		// just below ... is the response being saved? good
		//String answer2 = JOptionPane.showInputDialog("Are you goint to visit family"); 

		//if (answer2.equals("yes"))
			//System.out.println("Hope you have a safe trip and most of all have fun!");
			//else if (answer.equals ("no"))
			//System.out.println("Well hope you have fun!!");

		
	} // close main()
}	// close class
