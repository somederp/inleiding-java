package h04;

/**
 * Created by Patri on 20-9-2017.
 */

import java.applet.Applet;
import java.awt.*;


public class Opdracht6 extends Applet {

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(100,50,150,350);
        g.setColor(Color.red);
        g.fillOval(151,100,50,50);
        g.setColor(Color.yellow);
        g.fillOval(151,200,50,50);
        g.setColor(Color.green);
        g.fillOval(151,300,50,50);
    }
}