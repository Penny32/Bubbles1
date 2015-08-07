import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class draw extends JPanel implements ActionListener {
    public void drawing(){
        repaint();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawOval(200, 200, 50, 50);
        while (true) {
            Random rand = new Random();
            int X = rand.nextInt(500 - 25) + 1;
            int Y = rand.nextInt(500 - 25) + 1;
            int R = rand.nextInt(200 - 25) + 1;
            g.setColor(Color.BLACK);
            g.drawOval(X, Y, R, R);
            g.drawOval(x, y, R, R);
            t.start();
            try {
                Thread.sleep(2 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    Timer t = new Timer(7, this);
    int x = 10, y = 10, velX = 7, velY = 7;
    public void actionPerformed(ActionEvent e) {
        if(x<0 || x > getWidth()) {
            velX = -velX;
        }
        if(y < 0 || y > getHeight()) {
            velY = -velY;
        }
        x += velX;
        y += velY;
        repaint();
    }
}


