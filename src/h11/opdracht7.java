package h11; /**
 * Created by Patrick on 29-9-2017.
 */

import java.applet.Applet;
import java.awt.*;


public class opdracht7 extends Applet{


    public void init() {}



    public void paint(Graphics g) {
        int z3;
        int xx3 = 900;
        int yy3 = 450;
        int size = 10;
        for (z3 = 0; z3 < 50; z3++) {
            g.drawOval(xx3, yy3, size, size);
            xx3 -= 10;
            yy3 -= 10;
            size += 20;
        }
    }
}