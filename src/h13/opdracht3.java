package h13; /**
 * Created by Patrick on 14-12-2017.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class opdracht3 extends Applet {
    Button brick, concrete;
    boolean br, con;


    public void init() {
        brick = new Button("Make a brick wall");
        brick.addActionListener(new brickListener());
        concrete = new Button("Make a concrete wall");
        concrete.addActionListener(new concreteListener());
        add(brick);
        add(concrete);
    }


    public void paint(Graphics g) {
        if (br == true) {
            makeBrickWall(g);
        }

        if (con == true) {
            makeConcreteWall(g);
        }
    }


    void makeBrickWall(Graphics g) {
        int x = 20, x2 = 19, y = 40, y2 = 39, stop = 0;
        for (int counter = 0; counter <= 11; counter++) {
            g.setColor(Color.black);
            g.drawRect(x2, y2, 51, 31);
            g.setColor(Color.red);
            g.fillRect(x, y, 50, 30);
            x += 50;
            x2 += 50;
            if (counter == 11) {
                if (stop <= 4) {
                    stop += 1;
                    counter = 0;
                    x = 20;
                    x2 = 19;
                    y += 30;
                    y2 += 30;
                }
            }
        }
    }


    void makeConcreteWall(Graphics g) {
        int x = 20, x2 = 19, y = 40, y2 = 39, stop = 0;
        for (int counter = 0; counter <= 11; counter++) {
            g.setColor(Color.black);
            g.drawRect(x2, y2, 81, 46);
            g.setColor(Color.lightGray);
            g.fillRect(x, y, 80, 45);
            x += 80;
            x2 += 80;
            if (counter == 11) {
                if (stop <= 4) {
                    stop += 1;
                    counter = 0;
                    x = 20;
                    x2 = 19;
                    y += 45;
                    y2 += 45;
                }
            }
        }
    }


    public class brickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            con = false;
            br = true;
            repaint();
        }
    }


    public class concreteListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            br = false;
            con = true;
            repaint();
        }
    }
}