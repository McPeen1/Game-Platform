import java.util.Scanner;
public class GamePlatform {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the minigame choices!");
        System.out.println("Choose a game to play (1-3): ");
        int choice = scanner.nextInt(); /// Having 3 different game choices to choose from
        
        if (choice ==1) {
            System.out.println("1. Game 1");
            EightBall.main(args);
        }
        else if (choice == 2) {
        System.out.println("2. Game 2");
    }
        else if (choice ==3) {
    System.out.println("3. Game 3"); 
    }
    else{
        System.out.println("Invalid choice! Please try again");
    }
    scanner.close();
    }
}