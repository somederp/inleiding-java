package h10; /**
 * Created by Patrick on 8-9-2017.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//10.1 en 2

public class H10Again extends Applet {
    TextField tft;
    Label lacel;
    String s3, sk, s3k;
    int intt, high, low;



    public void init() {
        lacel = new Label("type a number.");
        tft = new TextField("",4);
        tft.addActionListener(new tftListener());
        add(lacel);
        add(tft);
    }



    public void paint(Graphics g) {
        g.drawString(s3,20,60);
        g.drawString(s3k,20,80);
    }


    class tftListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            sk = tft.getText();
            intt = Integer.parseInt(sk);
            if (intt > high) {
                s3 = "" + intt;
                high = intt;
                low = high;
            }
            else if (intt < low) {
                s3k = "" + intt;
                low = intt;
            }
           repaint();
        }
    }
}