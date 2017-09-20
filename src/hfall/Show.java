package hfall;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Patri on 16-9-2016.
 */
public class Show extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.orange);
        g.drawLine(50,200,200,200);
        g.drawLine(50,200,130,100);
        g.drawLine(200,200,130,100);
        g.drawRect(50,200,150,150);
        g.drawRect(70,250,50,100);
        g.drawRect(135,220,50,50);
    }
}

