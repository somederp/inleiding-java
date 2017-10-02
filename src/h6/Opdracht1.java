package h6;

/**
 * Created by Patrick on 2-10-2017.
 */
import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet{
    int euro;


    public void init() {
        euro = 113/4;
    }

    public void paint(Graphics g) {
        g.drawString("Jan: " + euro,20,20);
        g.drawString("Ali: " + euro,20,40);
        g.drawString("Jeannette: " + euro,20,60);
        g.drawString("Patrick: " + euro,20,80);
    }
}