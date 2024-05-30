package ShortAdventure;
import java.util.Scanner;


public class ShortAdventure {
    public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);
	
	
	System.out.print( " Welcome to stiven's ShortAdventure! " );
	System.out.print( "You are in a creapy park would you like to go \"swings\" or into the \"house\" ? ");
	String R1 = keyboard.next();
	
		if ( R1.compareToIgnoreCase("swings") == 0 ) {
	        System.out.print( "You see a tree on the left and one right which would you like to climb? " );
			String R2 = keyboard.next();
			if ( R2.compareToIgnoreCase("left") == 0) {
			System.out.println( "You see a creapy guy would you like to climb or run? " );
			String R4 = keyboard.next();
			if ( R4.compareToIgnoreCase("climb") == 0) {
			System.out.println( "You trip and fall and hit your head, and die!" );
			}
		else { System.out.println( "You lose to the creapy guy and die!");
		}
		}
		else { System.out.println( "You find a underground buker near the tree full of webs would you like to go in?(Yes/No): " );
		String R5 = keyboard.next();
		    if ( R5.compareToIgnoreCase("yes") == 0 ) {
			System.out.println( "You find a full room of weapons but get bit by a snake and die! ");
			}
			else { System.out.println( "You are stupid so leave the park." );
			}
			}
		}
		
		else { System.out.println( "You see and cabinet or a drawer which one do you open? ");
		String R3 = keyboard.next();
		if ( R3.compareToIgnoreCase("cabinet")== 0 ) {
		    System.out.print( "You see a bat would you like to use it? " );
			String R6 = keyboard.next();
			if ( R6.compareToIgnoreCase("yes") == 0 ) {
			       System.out.println( "You pass out due to exhaustion!" );
				   }
				else { System.out.println( "You get tired go around and run home!" );
				}
				}
				else { System.out.println( "You wake up and find a gun in the drawer right next to you");
				String R7 = keyboard.next();
				if ( R7.compareToIgnoreCase("yes") == 0 ) {
				System.out.println("You found a pistol to get to keep! ");
				}
				else { System.out.println( "You don't get a gun to keep go home." );
				}
				}
		}
		
    }
}
		
	
		
	
