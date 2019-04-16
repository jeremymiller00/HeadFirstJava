import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizCardBuilder {

    public void go() {
        // build and display gui
        // make and register event listeners
    }

    private class NextClassListener implements ActionListener { // inner class
        public void actionPerformed(ActionEvent ev) {
            // add the current card to the list and clear the text areas
            // triggered when user hits 'Next Card' button
            // store the card in the list and start a new card
        }
    }

    private class SaveMenuListener implements ActionListener { // inner class
        public void actionPerformed(ActionEvent ev) {
            // bring up a file dialog box
            // let the user name and save the set
            // trigered when the user clicks 'save' from the file menu
            // means user wants to save all current cards in the list to a 'set'
        }
    }

    private class NewMenuListener implements ActionListener { // inner class
        public void actionPerformed(ActionEvent ev) {
            // clear out the card list, clear out the text areas
            // trigered when user clicks 'New' from the file menu
            // means start a brand new set
            // so we clear out the card list and text areas
        }
    }

    private void saveFile(File file) {
        // iterate thro0ugh the list of cards and write each one out to a text file
        // in a parseable way (in other words, with clear separation between parts)
        // called by the saeveMenu listener, does the actual file writing
    }

} // close class 