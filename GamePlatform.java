import java.util.Scanner; 
import EightBall.EightBall; //imported Magic EightBall
import CoinFlip.CoinFlip;
public class GamePlatform {
    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);
 
        System.out.println("Welcome to the minigame choices!");
        System.out.println("Choose a game to play (1-3): ");
        int choice = game.nextInt(); /// Having 3 different game choices to choose from
        
        if (choice ==1) {
            System.out.println("1. Game 1"); ///game 1  Magic Eightball Random Responses
            EightBall.main(args);
        }
        else if (choice == 2) {
        System.out.println("2. Game 2"); ///game 2  Flip and a coin and get as many as you can in a row.
        CoinFlip.main(args);
        }
        
         else if (choice ==3) {
    System.out.println("3. Game 3"); 
      ShortAdventure.main(args);
    }
    else{
        System.out.println("Invalid choice! Please try again"); ///if you dont pick a choice 1-3 it would print out Inavlid choice
    }
    game.close();
    }
}