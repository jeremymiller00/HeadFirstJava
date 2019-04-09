import java.awt.*;
import javax.swing.*;

import javax.swing.ImageIcon;

import javafx.scene.paint.Color;

/**
 * A subclass of JPanel (a widget that you can add to a frame)
 */
class MyDrawPanel extends JPanel {
    // the big important Graphics method that I will never actually call myself
    // creates a surface of types Graphics for drawing on
    // public void paintComponent(Graphics g) {


    public void paintComponent(Graphics g) {
        Graphics g2d = (Graphics2D) g;

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);

        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100);
    }
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

    // public void paintComponent(Graphics g) {
    //     // cast to Graphics2D object to make Graphics2D methods available
    //     Graphics2D g2d = (Graphics2D) g;
    //     GradientPaint gradient = new GradientPaint(70, 70, Color.blue, 150,150, Color.orange);

    //     // set virtual paintbrush to gradient, rather than solid color
    //     g2d.setPaint(gradient);
    //     g2d.fillOval(70,70,100,100);
    // }

}