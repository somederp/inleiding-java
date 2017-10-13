package h11; /**
 * Created by Patrick on 9-10-2017.
 */

import java.applet.Applet;
import java.awt.*;


public class opdracht9 extends Applet {


    public void init() {
    }


    public void paint(Graphics g) {
        g.drawRect(49, 49, 401, 401);
        int y = 50;
        int x = 50;
        for (int checkers = 0; checkers < 4; checkers++) {
            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, 50, 50);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, 50, 50);
                }
                x += 50;
            }
            x = 50;
            y += 50;

            for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, 50, 50);
                } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, 50, 50);
                }
                x += 50;
            }
            x = 50;
            y += 50;
        }
    }
}