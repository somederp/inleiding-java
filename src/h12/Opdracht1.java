package h12; /**
 * Created by Patrick on 8-11-2017.
 */

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    int numbers[];
    double gemiddelde;


    public void init() {
        numbers = new int[10];

        for(int counter = 0; counter < 10; counter++) {
            numbers[counter] = counter + 1;
        }
        gemiddelde = 5.5;
    }


    public void paint(Graphics g) {
        g.drawString("het gemiddelde is " + gemiddelde, 20, 85);
        int x = 20;
        for(int counter2 = 0; counter2 <= 10; counter2++) {
            g.drawString("" + numbers[counter2], x, 60);
            x += 20;
        }
    }
}