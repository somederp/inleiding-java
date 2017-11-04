package h11; /**
 * Created by Patrick on 4-11-2017.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class praktijkOpdrachtDeel2 extends Applet {
    Button okay;
    int iny, table;

    public void init() {
        table = 1;
        okay = new Button("ok");
        okay.addActionListener(new newListener());
        add(okay);
    }



    public void paint(Graphics g) {
        int y = 60;
        for (iny = 1; iny <= 10; iny++) {
            g.drawString(iny +  " * " + table + " = " + (iny * table), 20, y);
            y += 20;
        }
        if (table >= 10) {table = 0;}
    }

    public class newListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            table += 1;
            repaint();
        }
    }
}