// continue next time.  fix code to ask 2nd question if
// needed

// did you save your temp token from github?  if not
// i can give it to you...yes pls
// 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

// save this somewhere for next time!saved
// i'm back

// you finished this and I saved a copy of your code.  can
// i paste that ok?yes

// can i paste your code back in here

package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

// i want to test that this works now...ok good.  time
// to go to next assignment.  but first can you log
// onto github to create a new temp token?ok

public class AreYouHappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// let me know if you have questions
		
		// it's saying you need to define a variable
		// named 'answer'.  when you define a variable,
		// you say its data type and then its name.  
		// here are a few examples:
		// int num;   .. its data type is 'int'.  its name is 'num'
		// String name;	... its data type is 'String'.  its name is 'name'
		// what is the data type of 'answer'?  is "yes" or
		// "no" an integer?...no.  so what is a more
		// appropriate choice of data type for 'answer'?
		// not sure?yes.  its 'String'.  this data type
		// stores words (which have a bunch of characters)
		// like "yes" has the characters 'y', 'e', 's'.
		// look at the examples I gave you 
		// questions?

		// why did you change it to 'num'??was that not one of the examples
		// yes, but i just picked some arbitrary names to
		// show you examples.  when you ask 'are you happy',
		// would someone answer with a number??
		
		// you *could* name a variable anything you want
		// but it is better to name it descriptively.
		// for example i could call the variable 'miranda'
		// but more descriptively i think it should be
		// called 'answer' because you will be storing the
		// user's response in there.  make sense?
		
		// ok now we need to fix the code so that you
		// actually *store* the user's answer in the
		// variable.  to store something in a variable uses
		// one equals sign.  here are some examples:
		// num = 10
		// name = "Miranda"
		
		// lets look at your last program to identify
		// how to store the answer...
		
		// is showMessageDialog() the correct method
		// to get input from the user?  look at your
		// last program...good!
		//idk but i do know that i need to separate 
		
		String answer = JOptionPane.showInputDialog("Are You Happy?");
//here's where your code starts - it asks are you happy
		
		// now lets improve some things here.
		// the 'double equals' sign tests just one thing
		// like ... if (num == 5) for example.
		// but a string like answer has to test the sequence
		// of characters, like 'y', 'e', 's'.
		// you cant use 'double equals' for that.  you
		// need a method called 'equals'.  let me
		// shou you.  can you fix the one in else if?
		// good.  next think to fix... a semicolon
		// shouldn't be on an 'if' line or 'else' line.
		// it means 'do nothing'!  
		
		// questions?yes...the no part...all of it is given
		//for example if i put no it gives me line 74,76and
		
		//i understand.  on line 76, are you asking a
		// second question?  if so, did you allow the
		// user to give a second answer and then did
		// you save it and test whether its yes or no??
		
		// do you see what I mean?no?
		// you asked do you want to be happy but you
		// didn't let the user answer.  instead, you
		// tested the answer to the first question 
		// which was 'no'.  what does the code look
		// like to ask a question and save the answer?
		// look above.
		
		// time to save work
//look over this code and see if you can figure out the
		// problem ...  want help? yes please
		// first, do you want to look at the Recipe chart
		// again? sometimes, the code should ask a 2nd
		// question "do you want to be happy?".  your
		// code never allows the user to answer that question.
		// instead, it just uses the answer to the 1st
		// question...
		// you need another JOptionPane kind of code
		if (answer.equals("yes"))
			System.out.println("Keep doing whatever your doing");
		else if (answer.equals("no")) {
			answer = JOptionPane.showInputDialog("Do you want to be happy?");
//ok we need more code inside here to process the answer
			// to the 2nd question .. any ideas?
			if (answer.equals("yes"))	// what should you say?
				System.out.println("Change something");// good. what if answer no?
			else if (answer.equals("no"))
				System.out.println("Keep doing whatever your doing");
			// ok let me clean up the indentation and we'll try it
			// out and then save work
		
		}
		// does this make sense? so answer is going to be the
		//one asking questions?  well, I guess so.  the
		// way I'd describe it is that answer saves the
		// user's response to the question.  you can
		// reuse answer (like reusing the memory button
		// on a calculator) to save the answer to the
		// latest question being asked.  when the
		// 2nd question is asked, the code replaces what
		// was in answer from the 1st question and saves
		// the answer to the 2nd question.  understand?yes
		
//YAY it works!  ready to save2? yes
		
		
//but now here it asks that same question again!....
		// instead, you should ask a different question...
		// "do you want to be happy"
		// ggod.  does the chart ALWAYS say to ask that
		// question?  or only if you answer the first question
		// in a particular way?  yeah, if you say "no" to
		// "are you happy"
//		answer = JOptionPane.showInputDialog("Do you want to be happy?");
//want to run the code to see what it does?
		// how many times did it ask are you happy?
		//2  is that what the chart says?2 or 3 if we count the yes
		
		// " or 3 if we count the yes" ... hmm, I don't see
		// that.  the chart says just once.
		
		// let me explain.  you have a variable called 'answer'.
		// a variable needs to be "declared" ONCE and then
		// can be reused multiple times.  To "declare" means
		// to say what data type it is.  "answer" is data
		// type "String".  You've said that twice.  let
		// me show you.  to fix this, either:
		// (1) remove the word "String on line 109 or
		// (2) give a new variable name like "answer2"
		// what do you wwat to do?  1 or 2?
		
		// no longer need this:
		/*
		if (answer.equals("no"))
			System.out.println("Do you want to be happy?");
				else if(answer.equals("no"))
					System.out.println("Keep doing whatever you doing.");
						else if(answer.equals("yes"));
							System.out.println("Change something.");
							*/
		
		}
		
	}
