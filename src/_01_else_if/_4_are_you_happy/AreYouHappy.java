// continue next time.  fix code to ask 2nd question if
// needed

// did you save your temp token from github?  if not
// i can give it to you...yes pls
// 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

// save this somewhere for next time!saved
// i'm back


package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

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
//		String answer;
		
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
		
		if (answer.equals("yes"))
			System.out.println("Keep doing whatever your doing");

		else if (answer.equals("no"))
			System.out.println("Do you want to be happy?");
				if(answer.equals("no"))
					System.out.println("Keep doing whatever you doing.");
						else if(answer.equals("yes"));
							System.out.println("Change something.");
		
		}
		
	}
