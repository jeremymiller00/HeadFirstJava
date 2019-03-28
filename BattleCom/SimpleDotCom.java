class SimpleDotCom {
    int[] locationCells;
    int numOfHits;

    String checkYourself(String stringGuess) {
        
        String result = "miss";
        int guess = Integer.parseInt(stringGuess);
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            } // end if
        } // end for
        if (numOfHits == locationCells.length) {
            result = "kill";
        } // end if
        System.out.println(result);
        return result;
    }

    void setLocationCells(int[] loc) {
        locationCells = loc;
    }
}