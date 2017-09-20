package h04;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Patri on 20-9-2017.
 */
public class Opdracht1 extends Applet {


    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawLine(100,170,220,170);
        g.drawLine(100,170,160,80);
        g.drawLine(220,170,160,80);
        g.drawRect(100,170,119,119);
        g.drawRect(120,229,30,60);
        g.drawRect(170,190,30,30);
    }



}
