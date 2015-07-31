import com.sun.glass.ui.Size;
import javafx.scene.shape.Circle;

import javax.swing.*;
import java.awt.*;

public class Bubbles extends JFrame {
    private static final long serialVersionUID =1L;
    public static void main(String args[]) {
        new Bubbles().setVisible(true);
        Draw obeject = new Draw();
        frame.add(object);

        object.drawing();
    }
    private Bubbles() {
        super("BUBBLES!");
        setSize(600, 600); //1024x768 or 800x600
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JButton button = new JButton("Click Me");
        add(button);
    }
}
