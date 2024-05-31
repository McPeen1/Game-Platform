package DiceGame;

import java.util.Scanner;

public class DiceGame {
    private Die die1;
    private Die die2;

    public DiceGame() {
        die1 = new Die();
        die2 = new Die();
    }

    public void play() {
        Scanner keyboard = new Scanner(System.in);
        int total;

        do {
            System.out.println("Press Enter to roll the dice...");
            keyboard.nextLine(); // Wait for the user to press Enter
            die1.roll();
            die2.roll();
            total = die1.getValue() + die2.getValue();
            System.out.println("Roll #1 : " + die1.getValue());
            System.out.println("Roll #2 : " + die2.getValue());
            System.out.println("Total is : " + total + "!");

            if (die1.getValue() == die2.getValue()) {
                System.out.println("You rolled doubles! Roll again...");
            }

        } while (die1.getValue() == die2.getValue());

        System.out.println("You rolled non-matching values. Game over!");
        keyboard.close();
    }

    public static void main(String[] args) {
        DiceGame game = new DiceGame();
        game.play();
    }
}

class Die {
    private int value;

    public Die() {
        roll();
    }

    public void roll() {
        value = 1 + (int) (Math.random() * 6);
    }

    public int getValue() {
        return value;
    }
}