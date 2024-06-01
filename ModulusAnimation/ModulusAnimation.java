package ModulusAnimation;/// for importing ModulusAnimation
///import java.util.Scanner;

public class ModulusAnimation {/// main class
public static void main( String[] args ) throws Exception {// mainn methods that starts the program, and then runs the program itself 
int repeats = 75;///int repeats = 75 times
int steps_per_second = 80; ///int steps_per_second = 80 times per second ------> Speed of the animation
for ( int i=0; i<repeats*11 ; i++ ) {  /// for loop that will run 75 times for the animation to run, 75 * 11 = 825 times
if ( i%11 == 0 )// if i is divisible by 11 it will run the code with no remainder  and repeat
System.out.print(" +1 \r"); /// print +1
else if ( i%11 == 1 )///else  The conditions handle different cases of the animation of i divisible by 11 specific patterns
System.out.print(" |_____0...____|\r");// prints out the pattern
else if ( i%11 == 2 )//the conditions handle different cases of the animation of i divisible by 11 specific patterns
System.out.print(" |__0...._______| \r");// prints out the pattern
else if ( i%11 == 3 )//the conditions handle different cases of the animation of i divisible by 11
System.out.print(" +1|0..._______| \r");// prints out the pattern
else if ( i%11 == 4 )//the conditions handle different cases of the animation of i divisible by 11 specific patterns
System.out.print(" +1|0..._______| \r");//prints out the pattern
else if ( i%11 == 5 )//the conditions handle different cases of the animation of i divisible by 11 specific patterns and prints out the pattern
System.out.print(" |...0________| \r");/// prints out the pattern
else if ( i%11 == 6 )// the conditions handle different cases of the animation of i divisible by 11 specific patterns and prints out the pattern 
System.out.print(" |_....0______| \r");/// prints out the pattern 
else if ( i%11 == 7 )/// the conditions handle different cases of the animation of i divisible by 11 specific patterns and prints
System.out.print(" |_......0___| \r");// prints out the pattern 
else if ( i%11 == 8 )// the conditions handle different cases of the animation of i divisible by 11 specific patterns and prints
System.out.print(" |______...0__|\r");// prints out the pattern 
else if ( i%11 == 9 )/// the conditions handle different cases of the animation of i divisible by 11 specific patterns and prints
System.out.print(" |________...0| \r");// prints out the pattern 
else if ( i%11 == 10 )/// the conditions handle different cases of the animation of i divisible by 11 specific patterns and prints
System.out.print(" |______0....|");// prints out the pattern 
//// Patterns are all in order 1 through 10
Thread.sleep(1000/steps_per_second);// pauses execution for specefied duration for creating the animation effect, sleeps 1000/ steps_per_second controlling speed of the animation
        }//closing bracket
    }//closing bracket
}//closing bracket
