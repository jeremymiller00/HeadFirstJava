import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class DotComGame {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() { 
        // create three dotcom objects and name them
        DotCom pets = new DotCom();
        pets.setName("Pets.com");
        dotComsList.add(pets);
        DotCom plants = new DotCom();
        plants.setName("Plants.com");
        dotComsList.add(plants);
        DotCom puddles = new DotCom();
        puddles.setName("Puddles.com");
        dotComsList.add(puddles);
        
        System.out.println("Your goal is to sink three dotcoms.");
        System.out.println("Pets.com, Plants.com, Puddles.com");
        System.out.println("Try to sink them all in the fewest number of guesses.");
        for (DotCom dc : dotComsList) {
            ArrayList<String> cells = helper.placeDotCom(3);
            dc.setLocationCells(cells);
        }
    }

    public void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String input = helper.getUserInput("Take a guess...");
            checkUserGuess(input);
        }
        finishGame();
    }

    public void checkUserGuess(String userInput) {
        numOfGuesses++;
        String result = "miss";
        for (DotCom dc : dotComsList) {
            result = dc.checkYourself(userInput);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComsList.remove(dc);
                break;
            }
            System.out.println(result);
        }
    }

    public void finishGame() {
        System.out.println("Game over...");
        if (numOfGuesses <=20) {
            System.out.println("Nice work! You completed the game in " +numOfGuesses+" guesses.");
        } else {
            System.out.println("You took " +numOfGuesses+" guesses! Try harder next time");
        }
    }

    public static void main(String[] args) {
        DotComGame game = new DotComGame();
        game.setUpGame();
        game.startPlaying();
    }
}