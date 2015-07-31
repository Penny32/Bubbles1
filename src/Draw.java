import javax.swing.*;
import java.awt.*;

public class Draw extends JPanel{
    public void drawing() {
        repaint();
    }
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(480,480,200,200);
    }
}
