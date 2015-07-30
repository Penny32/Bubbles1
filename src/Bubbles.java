import javax.swing.*;

public class Bubbles extends JFrame {
    private static final long serialVersionUID =1L;
    public static void main (String args[]) {
        new Bubbles().setVisible(true);
    }
    private Main (){
        super ("BUBBLES!");
        setSize(600, 600); //1024x768 or 800x600
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
