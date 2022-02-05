
void setup() {
 
  // set the size of your sketch use the word 'size'  make it bigger ...maybre 500 x 500?
 size (500,500);
}

void draw() {
  fill(#FF0D00);   
  ellipse (250,250,250,250);
  for (int i=9; i>1; i--){  // now the loop will never go in the body -ie repeats zero times
    // want a review of for loop?yes
    
    // you have a choice to make i count up or count down.  whata do you want here?down
    
    // so you initially set i to 1 and you have it count down ... 0 -1 -2  -3
    
    // will it ever stop?  until -7  your test is i <=1 ... is 9 <= 1?  no.
    // so now the loop will never repeat...
    
    // ok show me the sequence of values you want for 'i'
    //9<1  .. so 9 8 7 6 5 4 3 2  ?yes?
    // ok.  so the initial value is 9.  the numbers go down by 1.  the
    // loop keeps repeating so long as the values are GREATER THAN 1.  yes? is that
    // what you want? so then 1<9?  if you did i < 9, it would NEVER go false,
    // which makes an infinite loop you get stuck in!
    // no: for (i = 9; i > 1; i--)
    
    // ok.  better.  want to practice another example?okay
    
    // make a for loop that has i do the following: 1 .. 2 .. 3
    // for(i=1; 1<4; i++)   ok this goes 1 .. 2  it doesn't go to 3 fix it good
    // or i <= 3
    
    // now make a for loop that does 3 .. 2 .. 1
    //for(i=3; i>0; i--)  ok this goes 3 .. 2 .. 1 good.  or i >= 1 is ok.
    
    // so both of these practice loops repeat 3 times.  sometimes all
    // that i does is control how many times to repeat.  but sometimes
    // it's also used for another purpose inside the loop.  like the
    // beer bottle song.  we *needed* i to count down, not up.  make sense?yes
    //my computers about to die.  we can save work now.  
    

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
