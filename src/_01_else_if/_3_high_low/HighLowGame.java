//(I can't save)
package _01_else_if._3_high_low;

import java.util.Random;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		
		int random = new Random().nextInt(5);//What is .nextInt(5)
	
		int random = m;
		// 2. Print out the random variable above
		Random.out.print();
		// 11. Repeat steps 1 to 10 ten times?(idk)
		//for(int m = 1; m <= 10; m++);
			// 1. Ask the user for a guess using a pop-up window, and save their response 

			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			
			// 5. if the guess is correct
		//if()
				// 6. Win
		System.out.println("Win");
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
		//else if ()
				// 8. Tell them it's too high
		System.out.println("It's too high");
			// 9. if the guess is low
		//else if
				// 10. Tell them it's too low
		System.out.println("It's too low");
		// 13. Tell them they lose
		System.out.print("You lose");//need help adding it to "too high" & "too low"
	}

}


