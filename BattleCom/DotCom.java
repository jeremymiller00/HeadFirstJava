import java.util.ArrayList;

class DotCom {
    private ArrayList<String> locationCells;
    // int numOfHits;

    String name;
    
    public String checkYourself(String userInput) {
        
        String result = "miss";
        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    } // close method

    void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    } // close method
} // close class