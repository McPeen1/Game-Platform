import java.util.Scanner; 
import EightBall.EightBall; //imported Magic EightBall
import CoinFlip.CoinFlip;
import DiceGame.DiceGame;
import ShortAdventure.ShortAdventure;
import ModulusAnimation.ModulusAnimation;

public class GamePlatform {
    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);
        boolean playAgain = true;/////For the while loop

        while (playAgain) {
            System.out.println("Welcome to the minigame choices!");
            System.out.println("Choose a game to play (1-5), or enter 0 to exit: ");
            
            int choice = getUserChoice(game); // Getting the choice from user
            
            if (choice == 0) {
                System.out.println("Exiting the GamePlatform. Thank you!!");
                playAgain = false; // Exit the loop
            } else {
                playGame(args, choice);
            }
            
            System.out.println(); // Add a new line for better formatting
        }
        
        game.close();
    }
    
    private static int getUserChoice(Scanner game) {
        System.out.print("Enter your choice: ");
        while (!game.hasNextInt()) {
            System.out.println("Invalid input! Please enter a number.");
            game.next();
        }
        return game.nextInt();
    }
          
    private static void playGame(String[] args, int choice) {
        
        if (choice == 1) {
            System.out.println("1. Game 1: Magic Eightball Random Responses");
            EightBall.main(args);
        } else if (choice == 2) {
            System.out.println("2. Game 2: Flip a coin and get as many as you can in a row.");
            CoinFlip.main(args);
        } else if (choice == 3) {
            System.out.println("3. Game 3: Short Adventure");
            ShortAdventure.main(args);
        } else if (choice == 4) {
            System.out.println("4. Game 4: DiceGame");
            DiceGame game = new DiceGame();
            game.play();
            ///DiceGame.main(args);
        } else if (choice == 5) {
            System.out.println("5. Game 5: Modulus Animation");
            try {
                ModulusAnimation.main(args);
            } catch (Exception e) {////// Github AI Catch statement
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            System.out.println("Invalid choice! Please try again");
        }
    }
}