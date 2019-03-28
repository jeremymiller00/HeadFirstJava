import java.util.Random;
import java.util.Scanner;

class SimpleDotComGame {

    public static void main(String[] args) {
        int numOfGuesses;
        SimpleDotCom dotCom = new SimpleDotCom();

        Random rand = new Random();
        int start = rand.nextInt(5);
        int count = 0;
        int[] loc = new int[3];
        // populate location cells
        while (count < 3) {
            // add start to list
            loc[count] = start;
            // increment start
            start++;
            count++;
        }
        dotCom.setLocationCells(loc);

        Scanner in = new Scanner(System.in);
        while (dotCom.numOfHits < dotCom.locationCells.length) {
            System.out.println("enter a number: ");
            String currentGuess = in.nextLine();
            dotCom.checkYourself(currentGuess);

        }
    }
}