import javax.swing.*;

public class SimpleGui1 {
    public static void main(String[] args) {
        // make a frame
        JFrame frame = new Jrame();
        // make a button, pass text to constructor
        JButton button = new JButton("click me");

        // exit program when window is closed, or it will just run forever
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // add the button to the frame's content
        frame.getContentPane().add(button);
        // set frame size in pixels
        frame.setSize(300,300);
        // make frame visible (this is required)
        frame.setVisible(true);
    }
}