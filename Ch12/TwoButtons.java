import java.util.concurrent.ThreadLocalRandom;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class TwoButtons {

    JFrame frame;
    JLabel label;
    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();

        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("I'm a label");

        JButton colorButton = new JButton("Change color");
        colorButton.addActionListener(new ColorListener());

        JButton labelButton = new JButton("Change Label");
        labelButton.addActionListener(new LabelListener());

        MyDrawPanel panel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, panel);

        frame.setVisible(true);
        frame.setSize(400, 400);
    }

    class LabelListener implements ActionListener   {
        public void actionPerformed(ActionEvent e)  {
            label.setText("Oops!");
        }
    }

    class ColorListener implements ActionListener   {
        public void actionPerformed(ActionEvent e)  {
            frame.repaint();
        }
    }
}
