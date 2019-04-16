import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class QuizCardPlayer {
    
    private JTextArea display;
    private JTextArea answer;
    private ArrayList<QuizCard> cardlist;
    private int currentCardIndex;
    private JFrame frame;
    private JButton nextButton;
    private boolean isShowAnswer;

    public static void main(String[] args) {
        QuizCardPlayer reader = new QuizCardPlayer();
        reader.go()
    }

    public void go() {
        // build and display gui
        frame = new JFrame("Quiz Card Player");
        JPanel mainPanel = new JPanel();
        Font bigFont = new Font("sanserif", Font.BOLD, 24);

        display = new JTextArea(10,20);
        display.setFont(bigFont);
        display.setLineWrap(true);
        display.setEditable(false);

        JScrollPane qScroller = new JScrollPane(question);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        nextButton = new JButton("Show Question");
        mainPanel.add(nextButton);
        mainPanel.add(qScroller);
        nextButton.addActionListener(new NextCardListener());
        

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem loadMenuItem = new JMenuItem("Load Card Set");
        loadMenuItem.addActionListener(new OpenMenuListener());
        fileMenu.add(loadMenuItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(640, 500);
        frame.setVisible(true);
    } // close go

    class NextCardListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            // if this is a question, show the answer
            // otherwise show next question
            // set a flag for whether we're viewing a question or answer
        }
    }

    class OpenMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            // bring up a file dialog box
            // let the user navigate to and choose a card set to open
        }
    }

    private void loadFile(File file) {
        // must build an ArrayList of cards by reading them from a text file
        // called from the OpenMenuListener event handler
        // reads the file one line at a time
        // tells the makeCard() method to make a new card out of the new line
        // (one line in the file holds bothe the question and the answer, sep = "/")
    }

    private void makeCard(String lineToParse) {
        // called by the loadFile method, takes a line from the text file
        // and parses into two pieces: queston and answer
        // creates a new QuizCard
        // adds it to the ArrayList called CardList
    }
}