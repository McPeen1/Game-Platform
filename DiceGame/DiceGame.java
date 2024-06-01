package DiceGame; //importing to GamePlatform
import java.util.Scanner;

public class DiceGame {// Defice DiceGame class
    private Die die1;// Declare two Die objexts name die1 and  die2 represent the 2 dice used in the game
    private Die die2;//objects by creating new instances of the Die class.

    public DiceGame() {// 
        die1 = new Die();// constructor of DiceGame class, initializing the die1 and die2
        die2 = new Die();//objects by creating new instances of the Die class.
    }

    public void play() {// Defines "play" method whcih is responsible the dice game
        Scanner keyboard = new Scanner(System.in);// declare scanner object name keyboard
        int total;// int cariable to sire the  sum of the two dice values (rolls)

        do { // do while loop will  execute the code inside the loop at least once and keep executing while true
            System.out.println("Press Enter to roll the dice...");// lines prints a a line for the user to roll dice then wait for
            keyboard.nextLine(); // Wait for the user to press Enter
            die1.roll(); //simulating the rolling of the dice
            die2.roll();//simulating the rolling of the dice
            total = die1.getValue() + die2.getValue();// calculates the total of the values of the the two dice values
            System.out.println("Roll #1 : " + die1.getValue()); ///prints the values of each values and  rolled amout rolled to the console
            System.out.println("Roll #2 : " + die2.getValue());
            System.out.println("Total is : " + total + "!");

            if (die1.getValue() == die2.getValue()) { //checks if the two dice values are equal
                System.out.println("You rolled doubles! Roll again...");
            }

        } while (die1.getValue() == die2.getValue()); // Ends the while loop checks  if the values are the same if not the Loop ends.

        System.out.println("You rolled non-matching values. Game over!");///prints the rpomt to the user values dont match so the game is over.
        keyboard.close(); /// Scanner relases the code from the scanner
    }

    public static void main(String[] args) {/// the main method of the class DiceGame
        DiceGame game = new DiceGame();// creates DiceGame and a object named game also calls play method
        game.play();
    }
}

class Die {//  Defines die class that represents a single die
    private int value;// declares the int value for current value of the die

    public Die() {//constructor od Die class and calls the roll method to simulate the die rolling
        roll();// randomly generate a value between 1 and 6
    }

    public void roll() {// gemerates a eandom number between 1 and 6 and assigns it to the value of the die
        value = 1 + (int) (Math.random() * 6);
    }

    public int getValue() {// returns the value of the die
        return value;
    }//closing bracket
}///closing bracket