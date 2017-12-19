package h14; /**
 * Created by Patrick on 15-12-2017.
 */

import java.applet.Applet;
import java.awt.*;

public class opdracht1 extends Applet {
    String[] colors ={"","Harten ","Ruiten ","Schoppen ","Klaver "};
    String[] cards = {"aas","twee","drie","vier","vijf","zes","zeven","acht","negen","tien","boer","vrouw","heer"};
    double random;
    int randomColor, randomCard;


    public void init() {
        random = Math.random();
        randomColor = (int) (random * 4 + 1);
        randomCard = (int) (random * 13 + 1);
    }


    public void paint(Graphics g) {
        g.drawString(colors[randomColor] + cards[randomCard], 20, 60);
    }
}