import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class Bubbles extends JFrame {
    private static final long serialVersionUID = 1L;

    public static void main(String args[]) {
        new Bubbles().setVisible(true);
        }
    private Bubbles() {
        super("BUBBLES!");
        setSize(600, 600); //1024x768 or 800x600
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawOval(200, 200, 50, 50);
        while (true) {
            Random rand = new Random();
            int X = rand.nextInt() + 1;
            int Y = rand.nextInt() + 1;
            int R = rand.nextInt() + 1;
            g.setColor(Color.BLACK);
            g.drawOval(X, Y, R, R);
            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

