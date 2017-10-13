package h11; /**
 * Created by Patrick on 18-9-2017.
 */

import java.applet.Applet;
import java.awt.*;


public class opdracht1 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 20;
        for(teller = 0; teller < 10; teller++) {
            y += 20;
            g.drawLine(y, 50, y, 300);
        }
    }
}