import java.util.Random;
import java.util.Scanner;

/**
 * Where the gameplay happens
 */

public class GuessGame {
    // create players
    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();
    
    public void startGame() {
        // guesses
        Scanner in = new Scanner(System.in);
        int p1Guess;
        int p2Guess;
        int p3Guess;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        
        // "think" of a number
        Random rand = new Random();
        final int number = rand.nextInt(10) +1;

        while(true) {
            System.out.printf("Number to guess is %d\n\n", number);

            p1.guess();
            p2.guess();
            p3.guess();
            
            p1Guess = p1.number;
            System.out.printf("Player one guessed: %d\n\n", p1Guess);

            p2Guess = p2.number;
            System.out.printf("Player two guessed: %d\n\n", p2Guess);

            p3Guess = p3.number;
            System.out.printf("Player three guessed: %d\n\n", p3Guess);

            if (p1Guess == number) {
                p1isRight = true;
            }
            if (p2Guess == number) {
                p2isRight = true;
            }
            if (p3Guess == number) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winnner!\n");
                System.out.println("\nPlayer one? " + p1isRight);
                System.out.println("\nPlayer two? " + p2isRight);
                System.out.println("\nPlayer three ?" + p3isRight);
                System.out.println("\nGame over :(");
                break; // game over so break out of loop
            } else {
                System.out.println("Let's try again...");
            } // end if/else loop
        } // end while loop
    } // end method defintion
 } // end class defintion