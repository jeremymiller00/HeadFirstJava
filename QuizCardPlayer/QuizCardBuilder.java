import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.util.*;


public class QuizCardBuilder {

    private JTextArea question;
    private JTextArea answer;
    private ArrayList<QuizCard> cardList;
    private JFrame frame;

    public static void main(String[] args) {
        QuizCardBuilder builder = new QuizCardBuilder();
        builder.go();
    }

    /**
     * Build and display the gui
     */
    public void go() {
        frame = new JFrame("Quiz Card Builder");
        JPanel mainPanel = new JPanel();
        Font bigFont = new Font("sanserif", Font.BOLD, 24);

        // set up area for question
        question = new JTextArea(6, 20);
        question.setLineWrap(true);
        question.setWrapStyleWord(true);
        question.setFont(bigFont);
        JScrollPane qScroller = new JScrollPane(question);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        //. set up area for answer
        answer = new JTextArea(6, 20);
        answer.setLineWrap(true);
        answer.setWrapStyleWord(true);
        answer.setFont(bigFont);
        JScrollPane aScroller = new JScrollPane(answer);
        aScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        aScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        // create 'Next Card' button
        JButton nextButton = new JButton("Next Card");

        cardList = new ArrayList<QuizCard>();

        JLabel qLabel = new JLabel("Question");
        JLabel aLabel = new JLabel("Answer");
        mainPanel.add(qLabel);
        mainPanel.add(qScroller);
        mainPanel.add(aLabel);
        mainPanel.add(aScroller);
        mainPanel.add(nextButton);
        nextButton.addActionListener(new NextCardListener());

        // create a menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        newMenuItem.addActionListener(new NewMenuListener());
        saveMenuItem.addActionListener(new SaveMenuListener());
        fileMenu.add(newMenuItem);
        fileMenu.add(saveMenuItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(500, 600);
        frame.setVisible(true);
    }

    /**
     * Inner class to add a new card to the set
     */
    private class NextCardListener implements ActionListener { // inner class
        public void actionPerformed(ActionEvent ev) {
            QuizCard card = new QuizCard(question.getText(), answer.getText());
            cardList.add(card);
            clearCard();
        }
    }

    /**
     * Inner class to save a card set
     */
    private class SaveMenuListener implements ActionListener { // inner class
        public void actionPerformed(ActionEvent ev) {
            QuizCard card = new QuizCard(question.getText(), answer.getText());
            cardList.add(card);

            // Brings up a dialog box and waits on this line until user chooses 'Save' from the dialog box
            // FileChooser makes this easier
            JFileChooser fileSave = new JFileChooser();
            fileSave.showSaveDialog(frame);
            saveFile(fileSave.getSelectedFile());
        }
    }

    /**
     * Inner class to create a new card set
     */
    private class NewMenuListener implements ActionListener { // inner class
        public void actionPerformed(ActionEvent ev) {
            cardList.clear();
            clearCard();
        }
    }

    private void clearCard() {
        question.setText("");
        answer.setText("");
        question.requestFocus();
    }

    /**
     * Write out the card set to text file so that it can be loaded and used
     * @param file
     */
    private void saveFile(File file) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            for (QuizCard card:cardList) {
                writer.write(card.getQuestion() + "/");
                writer.write(card.getAnswer() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("couldn't write out card list");
            e.printStackTrace();
        }
    }

} // close class 