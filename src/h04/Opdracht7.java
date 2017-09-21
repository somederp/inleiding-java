package h04;

/**
 * Created by Patri on 21-9-2017.
 */
import java.applet.Applet;
import java.awt.*;

public class Opdracht7 extends Applet{

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRoundRect(100,20,150,150,10,10);
        g.setColor(Color.black);
        g.fillOval(120,40,30,30);
        g.fillOval(120,115,30,30);
        g.fillOval(197,40,30,30);
        g.fillOval(197,115,30,30);
    }
}