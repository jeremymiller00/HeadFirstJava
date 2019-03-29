import java.util.Random;
import java.util.Scanner;

class SimpleDotComGame {

    public static void main(String[] args) {
        int numOfGuesses = 0;
        SimpleDotCom dotCom = new SimpleDotCom();
        GameHelper helper = new GameHelper();

        int start = (int) (Math.random() * 5); // cast to int

        int[] locations = {start, start+1, start+2};
        dotCom.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive == true) {
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