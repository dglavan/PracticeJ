package SwingPrograms;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckBoxExample {
    CheckBoxExample(){
        JFrame f = new JFrame("Example of CheckBox");
        JCheckBox checkBox1 = new JCheckBox("C++");
        checkBox1.setBounds(100,100,50,50);
        JCheckBox checkBox2 = new JCheckBox("Java");
        checkBox2.setBounds(100,150,100,50);
        f.add(checkBox1);
        f.add(checkBox2);
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
        new CheckBoxExample();
    }
}
