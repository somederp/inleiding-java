package hfall;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Patri on 15-9-2016.
 */
public class U extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        setBackground (Color.pink);
        g. setColor(Color.CYAN);
        g.drawOval(100,100,100,100);
    }
}
