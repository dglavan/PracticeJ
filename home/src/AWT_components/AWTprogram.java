package AWT_components;

import java.awt.*;
import java.awt.event.*;

class First extends Frame {
    First() {
        Button b = new Button("Click me!");
        b.setBounds(30, 100, 80, 30); // setting button position

        add(b); // adding button into frame
        setSize(200, 200); // frame size 300 width and 300 height
        setLayout(null); // no layout manager
        setVisible(true); // now frame will be visible, by default not visible

        // 🔽 Add window listener to handle close event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();  // Close the window
                System.exit(0); // Terminate the program
            }
        });
    }

    public static void main(String[] args) {
        new First();
    }
}