package h11; /**
 * Created by Patrick on 20-9-2017.
 */

import java.applet.Applet;
import java.awt.*;


public class opdracht2 extends Applet{


    public void init() {}


    public void paint(Graphics g) {
        int numberos;
        int x = 20;
        for(numberos = 20; numberos >= 10; numberos--) {
            g.drawString("" + numberos, x, 60);
            x += 20;
        }
    }



}