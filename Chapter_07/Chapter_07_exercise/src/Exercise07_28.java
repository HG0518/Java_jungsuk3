import java.awt.*;
import java.awt.event.*;

public class Exercise07_28 {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.addWindowFocusListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                e.getWindow().setVisible(false);
                e.getWindow().dispose();
                System.exit(0);
            }
        });
    }
}