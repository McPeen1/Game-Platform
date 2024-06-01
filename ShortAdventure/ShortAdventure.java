package ShortAdventure;///import tto GamePlatform
import java.util.Scanner;

//////Recycled from Java Class from softmore year


public class ShortAdventure {// ShortAdventure class 
    public static void main( String[] args ) {// main method
	Scanner keyboard = new Scanner(System.in);// Scanner object called keyboard, standard input ------> System
	
	
	System.out.print( " Welcome to stiven's ShortAdventure! " );/// prints to the conso;le for user to see
	System.out.print( "You are in a creapy park would you like to go \"swings\" or into the \"house\" ? ");// printed script for user to see and pick which choice to make
	String R1 = keyboard.next();// reads the users input stores in the variable R1
	
		if ( R1.compareToIgnoreCase("swings") == 0 ) {// checks if the  user picked the swings choice or house choice
	        System.out.print( "You see a tree on the left and one right which would you like to climb? " );// new choice to pick from
			String R2 = keyboard.next();/// checks if picked tree on  the left and one on the right "Climb choice"// stores in variable R2
			if ( R2.compareToIgnoreCase("left") == 0) {//  checked chose to climb the  left by comparing to string
			System.out.println( "You see a creapy guy would you like to climb or run? " );///shows as printed
			String R4 = keyboard.next();// variable R4 stores the users input ("climb or run")
			if ( R4.compareToIgnoreCase("climb") == 0) {// checks if picked climb by comparing to string
			System.out.println( "You trip and fall and hit your head, and die!" );///As printed shown
			}
		else { System.out.println( "You lose to the creapy guy and die!");/// another  printing choice------------> promt for console to see
		}//closing bracket
		}//end bracket
		else { System.out.println( "You find a underground buker near the tree full of webs would you like to go in?(Yes/No): " );// prints to console for user to see  if they   are allowed to   go in   (Yes/No): " ); 

		String R5 = keyboard.next();// variable R5 stores the users input ("yes or no")
		    if ( R5.compareToIgnoreCase("yes") == 0 ) {// checks if picked yes by comparing to string
			System.out.println( "You find a full room of weapons but get bit by a snake and die! ");///  As printed shown  
			}
			else { System.out.println( "You are stupid so leave the park." );// prints to console
			}// closing bracket
			}//closing bracket
		}
		
		else { System.out.println( "You see and cabinet or a drawer which one do you open? ");// prints to console
		String R3 = keyboard.next();// variable R3 stores the users input ("cabinet or drawer")
		if ( R3.compareToIgnoreCase("cabinet")== 0 ) {//compare choices by comparing to string
		    System.out.print( "You see a bat would you like to use it? " );// prints to console
			String R6 = keyboard.next();// variable R6 stores the users  choice
			if ( R6.compareToIgnoreCase("yes") == 0 ) {// checks if picked yes by comparing to string
			       System.out.println( "You pass out due to exhaustion!" );// prints to console
				   }//closing bracket
				else { System.out.println( "You get tired go around and run home!" );// prints to console
				}//closing bracket
				}//closing bracket
				else { System.out.println( "You wake up and find a gun in the drawer right next to you");// prints to console
				String R7 = keyboard.next();// variable R7 stores the users  choice
				if ( R7.compareToIgnoreCase("yes") == 0 ) {// checks if picked yes by comparing to string 
				System.out.println("You found a pistol to get to keep! ");// prints to console
				}//closing bracket
				else { System.out.println( "You don't get a gun to keep go home." );// prints to console
				}//closing bracket
				}//closing bracket
		}//closing bracket
		
    }//end
}//end class
		
	
		
	
