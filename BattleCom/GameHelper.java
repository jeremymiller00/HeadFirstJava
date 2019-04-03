import java.io.*;
import java.util.*;

import com.sun.openpisces.AlphaConsumer;

public class GameHelper {

    public static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int[] grid = new int[gridSize];
    private int comCount = 0;


    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");

        try {
            BufferedReader is = new BufferedReader(
                new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alpaCells = new ArrayList<String>();
        String[] alphacoords = new String [comSize]; // holds coordinates (i.e. 'f6')
        String temp = null;                         // temporary string for concat
        int[] coords = new int[comSize];            // current candidate coords
        int attempts = 0;                           // current attempts counter
        boolean success = false;                    // flag = found a good location?
        int location = 0;                           // current starting location

        comCount++;                                 // nth dot com to place
        int incr = 1;                               // set horizontal increment
        if ((comCount % 2) == 1) {                  // if odd dot com (place horizontaly)
            incr = gridLength;                      // set vertical increment
        }
        
        while ( !success & attempts++ < 200 ) {     // main search loop
            location = (int) (Math.random() * gridSize); // get random starting point
            // System.out.println(" try " + location);
            int x =0;                               // nth position in dotcom to place
            success = true;                         // assume success
            while (success && x < comSize) {        // look for adjacent unsused spots
                if (grid[location] == 0) {          // if not already used
                    coords[x++] = location;         // save location
                    location += incr;               // try 'next' adjacent
                    if (location >= gridSize) {     // out of bounds -'bottom'
                        success = false;            // failure
                    }
                    if (x>0 && (location % gridLength == 0)) { // out of bounds - right edge
                        success = false;            // failure
                    }
                } else {
                    // System.out.println(" used " + location)
                    success = false;
                }
            }
        }

        int x = 0;                                  // turn location into alpha coord
        int row = 0;
        int column = 0;
        // System.out.println("\n")
        while (x < comSize) {
            grid[coords[x]] = 1;                    // mark master grid pts. as 'used'
            row = (int) (coords[x] / gridLength);   // get row value
            column = coords[x] % gridLength;        // get numeric column value
            temp = String.valueOf(alphabet.charAt(column)); // convert to alpha

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
            // System.out.print(" cord " + x + " = " + alphaCells.get(x-1));
        }

        // System.out.println("\n");

        return alphaCells;
    }
}