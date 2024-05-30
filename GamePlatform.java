import java.util.Scanner; 
import EightBall.EightBall; //imported Magic EightBall
import CoinFlip.CoinFlip;
import ShortAdventure.ShortAdventure;
import ModulusAnimation.ModulusAnimation;
public class GamePlatform {
    public static void main(String[] args) throws Exception {
        Scanner game = new Scanner(System.in);
 
        System.out.println("Welcome to the minigame choices!");
        System.out.println("Choose a game to play (1-4): ");
        int choice = game.nextInt(); /// Having 4 different game choices to choose from
        
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
    else if (choice ==4) {
        System.out.println("4. Game 4"); 
        ModulusAnimation.main(args);
    }
    else{
        System.out.println("Invalid choice! Please try again"); ///if you dont pick a choice 1-4 it would print out Inavlid choice
    }
    game.close();
    }
}