package h6;

/**
 * Created by Patrick on 2-10-2017.
 */
import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet{
    int num1, num2, num3;

    public void init() {
        num1 = 2147483647;
        num2 = 1;
        num3 = num1 + num2;
    }

    public void paint (Graphics g) {
        g.drawString("" + num3,20,20);
    }
}