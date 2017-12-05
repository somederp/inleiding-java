package h12; /**
 * Created by Patrick on 1-12-2017.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht6 extends Applet {
    TextField textext;
    String parser;
    int parser2;
    int array[] = {1,1,2,3,3,3,3,4,5,5,5,1,2};
    int array2[] = {0};


    public void init() {
        textext = new TextField();
        textext.addActionListener(new textListener());
        add(textext);
    }


    public void paint(Graphics g) {
        if (parser2 > 5 || parser2 < 1) {}
        else {
            g.drawString(parser2 + " appears " + array2[0] + " times.", 20, 60);
            array2[0] = 0;
        }
    }


    public class textListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            parser = textext.getText();
            parser2 = Integer.parseInt(parser);
            for (int counter = 0; counter < array.length; counter++) {
                if (parser2 == array[counter]) {
                    array2[0] += 1;
                }
            }
            repaint();
        }
    }
}