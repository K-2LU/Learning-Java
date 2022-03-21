import javax.swing.*;
import java.awt.event.*;

public class randomStuff implements ActionListener {
    JButton button;

    public static void main(String[] args) {
        randomStuff random = new randomStuff();

        random.go();

        JButton myButton = new JButton("Metallica!");
        JFrame myFrame = new JFrame();

        myFrame.getContentPane().add(myButton);
        myFrame.setSize(69, 420);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("Hello, there!");

        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setSize(340, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        button.setText("General Kenobi!");
    }
}