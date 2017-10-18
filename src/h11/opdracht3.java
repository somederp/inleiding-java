package h11;

/**
 * Created by Patrick on 20-9-2017.
 */
import java.awt.*;
import java.applet.*;


public class opdracht3 extends Applet {


    public void init(){
    }


    public void paint(Graphics g) {
        int uno = 0;
        int dos = 1;
        int tres = uno + dos;
        int xy = 20;
        do {
            g.drawString("" + uno, xy, 60);
            uno = dos;
            dos = tres;
            tres = uno + dos;
            xy += 20;
        } while (tres < 70);
    }
}