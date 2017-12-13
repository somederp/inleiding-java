package h13; /**
 * Created by Patrick on 12-12-2017.
 */

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {


    public void init() {}


    public void paint(Graphics g) {
        makeWall(g);
    }


    void makeWall(Graphics g) {
        int x = 20, x2 = 19, y = 40, y2 = 39, stop = 0;
        for (int counter = 0; counter <= 11; counter++) {
            g.setColor(Color.black);
            g.drawRect(x2, y2, 81, 46);
            g.setColor(Color.red);
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
}