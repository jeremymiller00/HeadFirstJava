import java.awt.*;
import javax.swing.*;

import javax.swing.ImageIcon;

/**
 * A subclass of JPanel (a widget that you can add to a frame)
 */
class MyDrawPanel extends JPanel {
    // the big important Graphics method that I will never actually call myself
    // creates a surface of types Graphics for drawing on
    // public void paintComponent(Graphics g) {

    //     // set the color to orange
    //     g.setColor(Color.orange);
    //     // define coordinates to fill
    //     g.fillRect(20,50,100,100);
    // }

    // public void paintComponent(Graphics g) {
    //     Image image = new ImageIcon("image.jpg")/getImage();
    //     // image, x nd y coords of top left corner
    //     g.drawImage(image, 3, 4, this);
    // }

    public void paintComponent(Graphics g) {
        // cast to Graphics2D object to make Graphics2D methods available
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(70, 70, Color.blue, 150,150, Color.orange);

        // set virtual paintbrush to gradient, rather than solid color
        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100);

    }

}