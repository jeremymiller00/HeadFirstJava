import java.util.Random;
import java.util.Scanner;

class SimpleDotComGame {

    public static void main(String[] args) {
        int numOfGuesses;
        SimpleDotCom dotCom = new SimpleDotCom();
        GameHelper helper = new GameHelper();

        // Random rand = new Random();
        // int start = rand.nextInt(5);
        int start = (int) (Math.random() * 5); // cast to int

        int[] locations = {start, start+1, start+2};
        dotCom.setLocationCells(loc);
        boolean isAlive = true;

        // Scanner in = new Scanner(System.in);
        while (isAlive == true) {
            // System.out.println("enter a number: ");
            // String currentGuess = in.nextLine();
            String currentGuess = helper.getUserInput("enter a number: ");
            String result = dotCom.checkYourself(currentGuess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            } // close if
        } // close while
    } // close main
}