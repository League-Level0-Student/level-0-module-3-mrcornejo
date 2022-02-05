// CONTINUE NEXT CLASS

// 	// the last verse is different because you ran out of bottles.

// I have your github token password - shall i help you save work?yes pls
//finished
// can i run it?yes  great!  now if you want it to start
// counting down from 99 what is the only change you need
// to make?  great - done!
package _02_loop_variables._4_99_bottles.bottles;

public class BottleSong {

	public static void main(String[] args) {
	  // use System.out.print code to print out verses of the song
		// using a loop....
		for(int i=99; i>=1; i--) {
			// good.  now the code for one verse goes in here
		System.out.println(i + " bottles of beer on the wall");//here?
		// here yes
		System.out.println(i + " bottles of beer"); 
	

		System.out.println(" take one down, pass it around ");
		
		System.out.println((i-1) + " bottles of beer on the wall");
		System.out.println("");

	// do you understand the difference between print() and println()?
		// do you know how to add an empty line at the end of the verse
		// so each verse is separated?
		//
		// do you see there is a line of the verse that is missing?
		// look at my sample below
		// need help?yes  ok i'll add the missing line.  it needs to
		// print out the value of one less bottle
		// do you understand?yes
		// ok.  there's another thing the code needs to handle.
		// the last verse is different because you ran out of bottles.
		// maybe we'll try to fix this next time?  it's about time to save
		// work.  ok?yes
		}
		// you can put it after the for loop is done
		System.out.println("  No bottles of beer!" );		
		System.out.println("  Go to the store and buy some more!" ); 
		System.out.println("  99 bottles of beer on the wall! ");
	
//should i add the other verses .  you mean the other lines in a verse? yes
	
		//i dont remember if theres a code to make numbers smaller in a loop?
		// two comments:
		// - instead of using the actual number 99, use a variable  ok lets talk about this
		// - the for loop control variable is useful here ...
		// and it doesn't HAVE to count up - it can count down!
		// can you change the for loop so i goes from 4 down to 1?
				
				/*<number> bottles of beer on the wall
			    <number> bottles of beer!
			    Take one down, pass it around 
			    <number - 1> bottles of beer on the wall!;
			        
			        // this is the ENDING verse:
			        No bottles of beer on the wall!
    			No bottles of beer!
    			Go to the store and buy some more
    			99 bottles of beer on the wall! 
        	
			    */
		//i dont understand thins song...does this help?
	
		// here is a sample verse - it has 4 lines:
		
		//99 bottles of beer on the wall
		//99 bottles of beer
		//take one down, pass it around
		//98 bottles of beer on the wall

// when you 'take one down' then there is one less bottle on the wall, right?yes
		// see how there are 4 lines in this verse?  look at your output
		// below - how many lines in each of your verses?3 but am using four bc of the space
		// not counting the spaces there still needs to be 4 and you only
		// have 3.  you need to fix that.
		
		// next verse starts with 98 then goes to 97
		// neext verse, 97 down to 96, etc. ok. so 2 loops
		//one for the verses and one for the # going down
		// hmm, i only see the need for the loop with the # going down...
		
		// lets save work and contineu next time
		
		// i suggest starting to count down from a smaller
		// number like 4 when you test it out.  cause 99
		// verses printed out is a lot!!

	}

}
