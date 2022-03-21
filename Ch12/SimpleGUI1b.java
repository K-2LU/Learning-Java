import javax.swing.*;
import java.awt.event.*; // import statement for the package that ActionListener
                         // and ActionEvent are in

// implement the interface. THis says to the button "an instance of SimpleGUI1b
// is-a ActionListener"
public class SimpleGUI1b implements ActionListener {
    JButton button;

    public static void main(String[] args) {
        SimpleGUI1b gui = new SimpleGUI1b();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("Click me!");

        // register your interest with button. This says to the button, "Add me
        // to your lists of listener". The argument you pass MUST be and objext
        // from a class that implements ActionListener!!
        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    // Implement the ActionListener interface's actionPerformed() method. This
    // is the actual event-handling method!
    public void actionPerformed(ActionEvent event) {
        button.setText("I have been clicked");
    }
    // The button calls this method to let you know that an event happened. It
    // sends you and ActionEvent object as the argument, but we don't need it.
    // Knowing the event happened is enough for us
}