import java.awt.*;
import java.swing.*;

/**
 * A subclass of JPanel (a widget that you can add to a frame)
 */
class MyDrawPanel extends JPanel {
    // the big important Graphics method that I will never actually call myself
    // creates a surface of types Graphics for drawing on
    public void paintComponents(Graphics g) {

        // set the color to orange
        g.setColor(Color.orange);
        // define coordinates to fill
        g.fillRect(20,50,100,100);
    }
}