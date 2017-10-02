package h04;

/**
 * Created by Patri on 20-9-2017.
 */
import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet{

    public void paint(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(100,50,30,454);
        g.setColor(Color.red);
        g.fillRect(130,50,200,80);
        g.setColor(Color.white);
        g.fillRect(130,130,200,80);
        g.setColor(Color.blue);
        g.fillRect(130,210,200,80);
    }
}