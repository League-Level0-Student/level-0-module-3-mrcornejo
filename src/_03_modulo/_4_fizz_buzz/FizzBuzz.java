
package _03_modulo._4_fizz_buzz;


/**
* Fizz Buzz
* 
* In this project, we're going to build FizzBuzz. It's a children's game where
* you count from 1 to 20. Easy, right? Here's the catch: 
* 
* Instead of saying a number that is divisible by 3, say "Fizz".//6
* And instead of saying a number that is divisible by 5, say "Buzz".//10
* For numbers divisible by both 3 and 5, say "FizzBuzz".//15
* 
* Print your results to the console.
* 
* If your code is correct, the output will be:
*  
* 1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz
* 
**/


// you are done with Lvl 0 Module 3.  want to save it and go onto the next module?yes
public class FizzBuzz {
	public static void main(String[] args) {
		for (int i=1; i<21; i++) {
			//one final fix ...
			// if # is divis by BOTH 3 and 5, print 'fizzbuzz'
			// how should you add this to your 'if-else' decision code?
			// try adding it... almost!  can i fix it?yes
			// it is important to test the && first
			if  (i % 3 == 0 && i % 5 == 0) 
				System.out.println("fizzbuzz");
			else if(i % 3 == 0) {
				System.out.println("fizz");
			}
			else if (i % 5 == 0)
				System.out.println("buzz");
			else 
				System.out.println(i);
		}
		
	}
}
