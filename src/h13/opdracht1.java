package h13; /**
 * Created by Patrick on 6-12-2017.
 */

import java.applet.Applet;
import java.awt.*;

public class opdracht1 extends Applet {


    public void init() {}


    public void paint(Graphics g) {
        tekenDriehoek(g, 20, 80, 80, 80, 50, 30);
    }

    void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x1, y1, x3, y3);
    }
}