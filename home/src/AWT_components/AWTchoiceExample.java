package AWT_components;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTchoiceExample {
    AWTchoiceExample(){


        Frame f = new Frame();
        Choice c = new Choice();
        c.setBounds(150,150, 150,75);
        c.add("Item 1 First");
        c.add("Item 2 Second");
        c.add("Item 3 3d");
        c.add("Item 4");
        c.add("Item 5");
        f.add(c);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                f.dispose();
                System.exit(0);
            }
        });

    }
    public static void main(String args[])
    {
        new AWTchoiceExample();
    }

}
