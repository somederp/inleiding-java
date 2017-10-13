package h11; /**
 * Created by Patrick on 27-9-2017.
 */

import java.applet.Applet;
import java.awt.*;


public class opdracht5 extends Applet{



    public void init(){}



    public void paint(Graphics g) {
        int z;
        int xx = 40;
        int yy = 60;
        for (z = 0; z < 5; z++) {
            g.drawRect(xx, yy, 30, 30);
            xx += 30;
            yy += 30;
        }
    }

}