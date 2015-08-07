import javax.swing.*;

public class Bubbles {
    public static void main(String args[]) {
        draw s= new draw();
        JFrame f = new JFrame();
        f.add(s);
        f.setSize(600, 600);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        draw object =new draw();
        object.drawing();
    }
}
