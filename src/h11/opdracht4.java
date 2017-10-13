package h11; /**
 * Created by Patrick on 20-9-2017.
 */

import java.applet.Applet;
import java.awt.*;


public class opdracht4 extends Applet{


    public void init() {}

    public void paint(Graphics g) {
        int table;
        int ex = 20;
        for(table = 0; table <= 30; table += 3) {
            ex += 20;
            g.drawString("" + table, ex, 60);
        }
    }

}