package AWT_components;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTaddArea {
    void TextAreaExample() {
        Frame f = new Frame();
        TextArea area = new TextArea("Welcome Area!");
        area.setBounds(10,30,300,300);
        f.add(area);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
                System.exit(0);
            }
        });
    }
    public static void main(String[] args){
        new AWTaddArea().TextAreaExample();
    }
}
