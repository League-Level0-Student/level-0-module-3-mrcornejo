//(I can't save)i already finished but my work didn't save
// i saved it for you.  i'll put back the code you did...
// but i don't think it's finished.  hold on a moment while i paste
// in your code....
// ok look over what you did...
// alright - ready to work on this some more? you there?yes
// ok, first, you generated a number in whwat range?  see
// line 21 99+1=100 or (100)=1 =100
// hi i'm back - I was helping Jay 
// the range is 1 to 100.  it could help to tell the user
// this ... i'll show you
//(STOPPED HERE)
// Generated random number between 1..100.  Continue working on program.
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 

		int random = new Random().nextInt(100)+1;// YEAH!!
		// can we review this?yes.  so nextInt(5) will generate one of these 5 numbers: 0 or 1 or 2 or 3 or 4.
		// see how starting to count from 0 means that it won't generate the number 5?  yes
		// ok, so if I change it to nextInt(3), what possible numbers will be generated?: 0, 1, 2.  good.
		// now let's say I want to generate numbers in a range starting from 1, NOT 0.  I will add 1 like this:
		// nextInt(3) + 1  ... what possible numbers will be generated in this case?: 0,1,2,3. good try but no.
		// first, nextInt(3) will generate a number and then 1 is added to it... so what possible numbers will be generated 
		// not sure?1,2,3  yes!!  so now, the program wants you to generate a random number between 1 - 100.
		// any guess as to how to write the code? ...  in other words, we need to modify line 13: 

		// you can run the program and see below what number is generated.  i'm going to check in with zach, then come
		// back to help you save your code
		System.out.println(random);
		// 2. Print out the random variable above  

		// 11. Repeat steps 1 to 10 ten times?
		
		// what i did was put all the code below inside
		// this for loop.  first it asks the user
		// for their guess and then it decides whether
		// the guess is coreect or too high or too low.
		// it needs a little fixing but let's see whawt it
		// does so far.  try it!
		
		// ok.  so it shouldn't say you lose until when?
		//3 times have passed and were wrong.  correct.
		// so lets fix 2 things.  first, make the loop run
		// 3 times. know how to fix that?  how many times
		// does the loop run currently? no because i lets
		//you go more than 3 times and said you losewin or low
		//im so sorry ill be back ok im back sorry no prob
		// so look at line 57 - how many times does the loop
		// repeat?10   roioogoht.  but we said we'll give
		// the user 3 chances, not 10
		
		// good.  now one more fix.  show we say 'you lose'
		// after *each* guess or only after 3 wrong guesses?
		//after 3 wrong guesses.  right. so that code
		// should be *after* the for loop is done.  make
		// sense?
		
		// 
		for(int m = 1; m <= 3; m++) {
	// line 69 doesn't make sense, it's saying if the
			// user gueesses the number 3...not if the
			// user made 3 wrong guesses.ok 
			// 1. Ask the user for a guess using a pop-up window, and save their response 
			String user = JOptionPane.showInputDialog("Guess a number between 1 and 100");	// make sense?

			// 4. Convert the users\u2019 answer to an int (Integer.parseInt(string))...what did you name the string?
			// on line 21 user.  good.  now i'd give the int a more descriptive name.  it's their guess.?
			// do you understand the HighLowGame that you are working on?no  guess a secret number between 1 and 100,etc
			//50  ok lets try playing the game, you and me, without the program.  i'm thinking of a secret number
			// between 1 and 10.  take a guess .. 2.  too low.  try again.  7.  yeah you got it!
			// do you understand the game now?  you keep guessing until you get the right number.  if it's not
			// the right number you give a hint - too hi or too low.  at the top of the code, you'll generate
			// the secret random number.  then your code will let the user guess the number.  make sense?yes
			int guess = Integer.parseInt(user);

			// ok here is the user's guess.  can we
			// change the name of the variable from 'string'
			// to 'guess'?  it makes more sense to me
			// can I do that?change the name yes mo bc its calling 
			//  that means I'm asking you if i can
			// change the name in all those places....
			//yes

			// ok next.  we want to compare 'guess' to
			// the randomly generated number, NOT to 50
			// do you understand why? no
			// right now the code compares the user's
			// guess to 50, meaning that the "correct answer"
			// is always 50 ... that's a boring game!!
			// we want the correct answer to be a random number
			// between 1 and 100.  make sense?yes.  ok
			// the random number is stored ina variable called 'random'
			// how can we use that variable in the code below?
			//
			// good!  now we'd like to change the code
			// so the 
			// user can try guessing a few times, maybe loop3 times?
			// so we have to put some of this code in a loop


			// can i help you a bit?  ok?
			//yes..
			// 5. if the guess is correct
			if(guess == random) {///FIX THIS
				// 6. Win
				System.out.println("Win");
			// great!  almost done.
			// if the user guess the correct answer,
			// should they be allowed to keep guessing
			// or should the game end?end
				System.exit(0);  // ok lets try the game
				
				// do you think it works ok?yes
				// good. i want to help you save work.
				// first i'm going to add back your
				// crazy cat lady code.  then hopefully
				// we can make a temp token in github
				
				// can you log into your github account?
			}
			// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
			else if (guess >random)
				// 8. Tell them it's too high
				System.out.println("It's too high");
			// 9. if the guess is low
			else if (guess <random)
				// 10. Tell them it's too low
				System.out.println("It's too low");
	// this line below should be moved to *after* the loop
			// 13. Tell them they lose
			// should this stay here or go away?:
			//System.out.print("You lose");
		} // here is the end of the for loop
		
		// put 'you lose' here:
		System.out.print("You lose");
	}

}
