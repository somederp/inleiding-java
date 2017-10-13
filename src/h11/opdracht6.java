package h11; /**
 * Created by Patrick on 28-9-2017.
 */

import java.applet.Applet;
import java.awt.*;


public class opdracht6 extends Applet{


    public void init() {}






    public void paint(Graphics g) {
        int z2;
        int xx2 = 200;
        int yy2 = 100;
        int plus  = 30;
        for (z2 = 0; z2 < 5; z2++) {
            g.drawOval(xx2, yy2, plus, plus);
            xx2 -= 10;
            yy2 -= 10;
            plus += 20;
        }
    }
}