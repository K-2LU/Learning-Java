import javax.swing.*;
import java.awt.*;

public class pracAnimation {
    JFrame frame;
    int x = 70;
    int y = 70;

    public static void main(String[] args)  {
        pracAnimation gui = new pracAnimation();

        gui.go();
    }

    public void go()    {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel panel = new MyDrawPanel();

        frame.getContentPane().add(panel);

        frame.setSize(900, 900);
        frame.setVisible(true);

        for (int i = 0; i < 130; i++) {
            x++; y++;
            panel.repaint();

            try {
                Thread.sleep(30);  
            }   catch(Exception e)  {}
        }
    }

    class MyDrawPanel extends JPanel    {
        public void paintComponent(Graphics g)  {
            g.setColor(Color.white);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());

            g.setColor(Color.red);
            g.fillOval(x, y, 40, 40);
        }
    }
}
