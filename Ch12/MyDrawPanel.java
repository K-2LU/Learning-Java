import java.awt.*;
import javax.swing.*;

public class MyDrawPanel extends JPanel {
    // make a subclass of JPanel, a widget that you can add to
    // a frame just like anything else. Except this one is your
    // // own customized widget
    public void paintComponent(Graphics g) {
        // // this is the big important graphics method. We will
        // // never call this ourselves. The system call it and
        // // says, "Here's a nice fresh drawing surface, of type
        // // Graphics, that you may paint on me"
        // g.setColor(Color.orange);
        // // Imagine that 'g' is a painting machine. You're telling it
        // // what shape to paint (with the coordinates for where
        // // it goes and how big it is)
        // g.fillRect(20, 50, 100, 100);

        Graphics2D g2D = (Graphics2D) g;

        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);

        Color startColor = new Color(red, green, blue);

        red = (int) (Math.random() * 256);
        green = (int) (Math.random() * 256);
        blue = (int) (Math.random() * 256);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
        g2D.setPaint(gradient);
        g2D.fillOval(70, 70, 100, 100);
    }
}