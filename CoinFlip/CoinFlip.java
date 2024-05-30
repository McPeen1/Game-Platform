package CoinFlip;
import java.util.Scanner;

public class CoinFlip {
    public static void main( String [] args ) {
	     Scanner Keyboard = new Scanner(System.in);
		 String coin, again;
		 int streak = 0;
		 boolean gotHeads; //true or false
		 
		 do {
		    gotHeads = Math.random() < 0.5; //random selection
			
			if ( gotHeads )
			    coin = "HEADS";
			else
			   coin = "TAILS";
			   
			System.out.println("You flip a coin and it is... " + coin);
			
			if ( gotHeads ) {
			    streak++;
				System.out.println("\tThat's " + streak + " in a row....");
				
				
				System.out.print("\tWould you like to flip again (Y/n)? ");
				again = Keyboard.next();
			}
			else {
			   System.out.println("\tYou loose everything!");
			   System.out.println("\tShould've quit while you were aHEAD....");
			   streak = 0;
			   again = "n";
			  
			  }
			} while ( again.equals("Y") );
			
			System.out.println( "Final Score: " + streak );
		}
    }
				