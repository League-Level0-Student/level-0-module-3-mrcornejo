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
		where in pseudocode is no i dont like xmas
		should you ask this question? no
		// great choices.  so if they answer halloween,
		// what message should your code print out?
		//halloween is a fun and a time to be crazy with costumes 
		// for easter, what message?
		//easter reminds me of pastel colors
// I'll put Q when it should ask a question and M to output a 
		//message
//************ PSEUDOCODE SECTION **********/
				// next class you can work on making sure
				// code down below matches this pseudocode
				// ok?yes
				// let me help you save work i saved a
				// temp token password from last time.
				// also fixing are you happy
				
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
//************ PSEUDOCODE SECTION **********/
		
		
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
		// then what is 'answer'?ooo..so inoutDialog shows message and requests a responce 
		
		 	
		String answer = JOptionPane.showInputDialog("Do you like Christmas");
		if (answer.equals("yes"))
			System.out.println("Me too, I believe it can be a holiday that brings families together.");
		else if (answer.equals("no"))
			System.out.println("which holiday do you prefer halloween or easter?");
	
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
		String answer2 = JOptionPane.showInputDialog("Are you goint to visit family"); 

		if (answer2.equals("yes"))
			System.out.println("Hope you have a safe trip and most of all have fun!");
			else if (answer.equals ("no"))
			System.out.println("Well hope you have fun!!");

		
	} // close main()
}	// close class
