package h12; /**
 * Created by Patrick on 10-11-2017.
 */

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    Button buttons[];

    public void init() {
        buttons = new Button[25];

        for (int counter = 0; counter < buttons.length; counter++) {
            Button button = new Button("" + counter);
            buttons[counter] = button;
        }

        for (int counter2 = 0; counter2 < 25; counter2++) {
            add(buttons[counter2]);
        }
    }


    public void paint(Graphics g) {}
}