import javax.swing.*;
import java.awt.event.*;

public class SimpleGui1b implements ActionListener {
    // create a button
    JButton button;

    public static void main (String[] args) {
        SimpleGui1b gui = new SimpleGui1b();
        // gui.go();
        MyDrawPanel drawing = new MyDrawPanel();
        drawing.paintComponent(g);
    }

    /**
     * Create button and listen for click
     */
    public void go() {
        // create a frame and a button
        JFrame frame = new JFrame();
        button = new JButton("click me");

        // add this class to button listeners; passed arguement MUST be an object from a class that implements ActionListener
        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    /**
     * implement the actionListener interface's actionPerformed() method
     * The button calls this method to let you know an event has happened
     */
    public void actionPerformed(ActionEvent event) {
        button.setText("I've been clicked");
    }
}