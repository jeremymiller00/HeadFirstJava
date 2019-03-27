import java.util.Random;

/**
 * Player class for the guessing game
 */

public class Player {

    int number;

    public void guess() {
        Random rand = new Random();
        number = rand.nextInt(10) + 1;
        System.out.printf("I guess %d: \n", number);
    
}
}