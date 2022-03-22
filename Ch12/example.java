package JFrame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class MyFrame extends JFrame{
   MyFrame() {
      JFrame frame = new JFrame(); // creates a frame
      this.setTitle("JFrame title goes here"); // sets title of frame
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of appication.
      this.setResizable(false); // prevent frame from begin resized
      this.setSize(420, 420); // sets the x-dimension, and y-dimension of frame
      this.setVisible(true); // make frame visible

      // change title image
      ImageIcon image = new ImageIcon("D:\\Atom\\Assignment - java&algo\\Java Swing\\src\\logo.png"); // create a image icon.
      this.setIconImage(image.getImage()); // change icon of frame

      //frame.getContentPane().setBackground(Color.blue);
      this.getContentPane().setBackground(new Color(123, 50, 250)); // r, g, b values to create any color you want. you can change it to hexadecimal value

   }
}
