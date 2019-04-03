import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class DotComGame {

    public static void setUpGame() { 
        // create three dotcom objects and name them
        DotCom pets = new DotCom();
        pets.name = "Pets.com";
        dotComsList.add(pets);
        DotCom plants = new DotCom();
        plants.name = "Plants.com";
        dotComsList.add(plants);
        DotCom puddles = new DotCom();
        puddles.name = "Puddles.com";
        dotComsList.add(puddles);
        
        // display instructions to the user
    }

    public static void startPlay() {
        // ask for guesses
        // call checkuserhuess until all dotcoms are gone    
    }

    public static void checkUserGuess() {
        // loop trough remaining dotcoms
        // call checkYourself() on each
    }

    public static void finishGame() {
        // prints out peformance stats and ending message
    }


    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();

        // below here is the old way
        DotCom dotCom = new DotCom();















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