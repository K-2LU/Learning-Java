import javax.swing.*;
import java.awt.event.*;

public class SimpleGUI1b implements ActionListener{
    JButton button;
    JButton button2;

    public static void main(String[] args)  {
        SimpleGUI1b gui = new SimpleGUI1b();

        gui.go();
    }

    public void go()    {
        JFrame frame = new JFrame();
        button = new JButton("Click here!");
        
        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setSize(399, 399);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)  {
        button.setText("The button has been clicked!");
    }
}