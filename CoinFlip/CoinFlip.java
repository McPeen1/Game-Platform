package CoinFlip;//for importing to main GamePlatform
import java.util.Scanner;

public class CoinFlip {// defines the CoinFlip class
    public static void main( String [] args ) {// main method
	     Scanner Keyboard = new Scanner(System.in);// Scanner  creates a  new object called Keyboard
		 String coin, again; // declares two strings, coin and again
		 int streak = 0; //initializes streak to 0 to track the number of consecutive heads or tails.package
		 boolean gotHeads; //true or false, Indicates whether the current flip resulted in heads or tails.
		 
		 do {/// a do while while loop which will execute code inside the loop at lkeast once and than continue while the condition is true
		    gotHeads = Math.random() < 0.5; //random selection generates random number between 0 and  1 using Math.random() if the number is less than 0.t its  considered heads, otherwise its considered tails
			
			if ( gotHeads )// Checks value if gotHeads if its ture, coin is assigned to "HEADS" else its assigned to "TAILS"
			    coin = "HEADS";
			else
			   coin = "TAILS";
			   
			System.out.println("You flip a coin and it is... " + coin); //prints out the result of the coin flip
			
			if ( gotHeads ) {// executes if the coin resulted in "HEADS" prints the streak and promts the user to flip again
			    streak++;
				System.out.println("\tThat's " + streak + " in a row....");
				
				
				System.out.print("\tWould you like to flip again (Y/n)? ");////prompts the user to flip again
				again = Keyboard.next();///  next() method reads the next token from the keyboard and returns it as a String.
			}
			else {// executes if the coin resulted in "TAILS" prints the streak and promts the user
			   System.out.println("\tYou loose everything!");
			   System.out.println("\tShould've quit while you were aHEAD....");
			   streak = 0; //counter to 0 and sets again to "n" to exit the loop.
			   again = "n";
			  
			  }
			} while ( again.equals("Y") ); /// Ends the do while loop and checks if the user wants to flip again. by comparing the value of again to "Y" if the User enters "Y" the loop will continue. other wise the loop will end.
			
			System.out.println( "Final Score: " + streak );// prints the final streak score to the console after the loop ends.
		}
    }
				