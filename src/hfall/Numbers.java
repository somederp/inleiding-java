package hfall;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Patri on 27-9-2016.
 */
public class Numbers extends Applet {
    int a, b, uitkomst;

    public void init() {
        a = 2147483647;
        b = 1;
        uitkomst = a+b;
    }

    public void paint(Graphics g) {
        g.drawString("antwoord is: " + uitkomst, 20, 20);
    }
}
