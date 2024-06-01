import java.util.Scanner; 
import EightBall.EightBall; //imported Magic EightBall
import DiceGame.DiceGame;// imported Dice Game
import ShortAdventure.ShortAdventure;// imported Short Adventure
import CoinFlip.CoinFlip;//import CoinFlip
import ModulusAnimation.ModulusAnimation;///import ModulusAnimation

public class GamePlatform { /// main class
    public static void main(String[] args) { ///main methods that starts the program
        Scanner game = new Scanner(System.in); /// Scanner object called Game, standard input ------> System
        boolean playAgain = true;/////For the while loop -------> true for the while loop to keep looping

        while (playAgain) { /// A loop that will  keep running as long as playtagain is true
            System.out.println("Welcome to the minigame choices!"); /// Welcome message
            System.out.println("Choose a game to play (1-5), or enter 0 to exit: "); /// Choose a game or exit
            
            int choice = getUserChoice(game); // Getting the choice from user, it calls UserChoice method for input choice
            
            if (choice == 0) { ///checks the choice is equal to zero to exit the game, represent a choice to exit the game
                System.out.println("Exiting the GamePlatform. Thank you!!"); ///message for exiting the game
                playAgain = false; // Exit the while loop, which ends the codes!!!
            } else { //will run code of choice is not equal to 0 calls playGame method
                playGame(args, choice); //if choice is not 0 it will call playGame method, and playGame is called with args ------>choice is int and args is the argument.
            } //closing bracket
            
            System.out.println(); // Add a new line for better formatting
        }///closing bracket
        
        game.close();// it closes the line "Scanner" object after loop ends
    }///closing bracket
    
    private static int getUserChoice(Scanner game) { /// takes the "Scanner" object called game as a parameter and returns an int
        System.out.print("Enter your choice: ");///prompt for the user to enter a choice
        while (!game.hasNextInt()) { ///A while loop that will keep running as long as  the input is not an integer
            System.out.println("Invalid input! Please enter a number."); ///prompt for the user to enter a number
            game.next(); /// line discards the invalid so the progran prompt the user again for valid input.
        }
        return game.nextInt();/// returns the input as an integer
    }
          
    private static void playGame(String[] args, int choice) { ///takes the "String" array called args and an int called choice as parameters
        
        if (choice == 1) { ///choices for the user to choose from
            System.out.println("1. Game 1: Magic Eightball Random Responses");/// prompt for the user to choose a game
            EightBall.main(args);///imported main method EightBall
        } else if (choice == 2) {/// choice for the user to choose from
            System.out.println("2. Game 2: Flip a coin and get as many as you can in a row.");/// prompt for the user to choose a game
            CoinFlip.main(args);///imported main method CoinFlip
        } else if (choice == 3) {///choice for the user to choose from
            System.out.println("3. Game 3: Short Adventure");/// prompt for the user to choose a game
            ShortAdventure.main(args);///imported main method ShortAdventure
        } else if (choice == 4) {///choice for the user
            System.out.println("4. Game 4: DiceGame");//// prompt for the user to choose a game
            DiceGame game = new DiceGame();/// creates a new Dice game
            game.play();///  starts the game by calling play method
            ///DiceGame.main(args);
        } else if (choice == 5) {////choice for the user
            System.out.println("5. Game 5: Modulus Animation");/// prompt for the user to choose a game
            try { /// is a try catch block that will catch any exception that may occur, inside the try block, the code will be executed( modulus animation)
                ModulusAnimation.main(args);///imported main method ModulusAnimation
            } catch (Exception e) {///catch block that will catch any exception that may occur, inside the catch block, the code will be
                e.printStackTrace();///throw exception -------------------> from GitHub Ai module it  helped me to fix the error.
            }
        } else {//will run code if choice is not 1-5
            System.out.println("Invalid choice! Please try again");///promt for  the user to try again!!!!
        }// Closing bracket
    }///closing bracket
}///closing bracket