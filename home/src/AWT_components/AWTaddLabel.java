package AWT_components;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class AWTaddLabel {
    public static void main(String[] args){
        Frame f = new Frame("Label Example");
        Label l1,l2;
        l1 = new Label("First label.");
        l1.setBounds(50,100,100,30);
        l2 = new Label("Second label.");
        l2.setBounds(50,150,100,30);
        f.add(l1); f.add(l2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

        // 🔽 Add window listener to handle close event
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();      // Close the window
                System.exit(0);  // Exit the app
            }
        });
    }
}
