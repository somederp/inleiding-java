package h11; /**
 * Created by Patrick on 29-9-2017.
 */

import java.applet.Applet;
import java.awt.*;


public class opdracht8 extends Applet {


    public void init() {}



    public void paint(Graphics g) {
        int counter;
        int size2 = 30;
        for (counter = 0; counter < 100; counter++) {
            g.drawOval(20, 20, size2, size2);
            size2 += 20;
        }
    }
}