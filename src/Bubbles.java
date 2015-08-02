import javax.swing.*;
import java.awt.*;
import java.util.*;



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
    }
}

