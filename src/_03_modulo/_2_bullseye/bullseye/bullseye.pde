void setup() {
 
  // set the size of your sketch use the word 'size'  make it bigger ...maybre 500 x 500?
 size (500,500);
}
void draw() {
  fill(#FF0D00);   
  ellipse (250,250,250,250);  
  for (int i=9; i>1; i--){  
    
// can we look at 'remainder' tutorial? its one of the tabs above
// so here, if i % 2 == 0, then i is an even number or
// if i % 2 == 1, then i is an odd number...i dont get this bc this would be i=2 
//which is even does this make sense?

// ok lets discuss this more.  let's say we have the number 9.  how many times
// does 2 go into 9?  4.  yes.  and what is left over?  1.  that's the remainder
// (also called modulo).  9 is an odd number.  1 will be the leftover for *any* odd number.
// make any sense?yes  so to test for any odd number, you can test if number % 2 == 1
// does that make sense? so i is odd yes  if (i % 2 == 1) then i is odd, yes ok
// now, do you understand how we can use this idea to alternate red and black colors
// for the bullseye? yes sorry i was wrong in my head i though it was a / instead of %
// that's important.  / is the symbol to divide whereas % is the symbol to get
// the remainder yea sorry 

}
//(x,y,w,h)
 fill(#030303);
 ellipse (250,250,225,225);  
 int size = 250;
  for (int i=9; i>1; i--){  // for (int i = 0; i < 7; i++)
  if (i % 2 == 1)  {  // odd number
   fill(#FF0D00);
  }
 
  if (i % 2 == 0)
  
   fill (#030303); 
   
   ellipse (250,250,size,size);
   size = size - 31;
   // make the size a bit smaller for next time thru loop
   
   // draw an ellipse
  }
  
  // each time thru the loop, (1) the size of the ellipse gets smaller and
  // (2) we alternate fill colors between red and black
  // the for loop has a loop control variable 'i'.  when its an odd number,
  // you can do one color - lets say red, and then when its an even number do black
  
  // to test odd number: if (i % 2 == 1)
  // to test eveen number: if (i % 2 == 0)
  
  //is their a code in which i can -2 three times, like: (i--2);
  
  // i'm helpin Jay right now.  then i'll help save your work.ok 
  
  // now the loop will never go in the body -ie repeats zero times
/*
for (initial value; if this test is true do code inside loop once; update at end)

EX: for (i = 0; i <3; i++)
  so, i initially 0, then loop does body once if i < 3, then update to 1,
  then loop repeats again because 1 < 3, then update i to 2,
  then loop repeats because 2 < 3, then updates i to 3,
  then loop stops because 3 < 3 is false.
  
  so can you figure out what's wrong in line 11?

*/

  // good!  now we need a loop.
  // each time thru the loop, (1) the size of the ellipse gets smaller and
  // (2) we alternate fill colors between red and black
  // the for loop has a loop control variable 'i'.  when its an odd number,
  // you can do one color - lets say red, and then when its an even number do black
  
  // to test odd number: if (i % 2 == 1)
  // to test eveen number: if (i % 2 == 0)
  // the percent sign is called 'modulus'.  it gives the remainder.
  // for example 5 % 2 gives a remainder of 1.  do you understand?  or have questions?
  
  // now make it red #set the color BEFORE ddraw the ellipse - i think it's better
  // to use the method 'fill' instead of color
  // ok just a review - draw an ellipse in the middle of the canvas (,x y, width, height)tha
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  
  //Use an if statement and modulo to alternate the color of your rings.
  

  }
