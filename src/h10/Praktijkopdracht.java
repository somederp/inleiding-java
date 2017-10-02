package h10; /**
 * Created by Patrick on 15-9-2017.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Praktijkopdracht extends Applet {
    TextField tt;
    Label lala;
    String sss, stst;
    int tni;



    public void init() {
        stst = "";
        lala = new Label("typ een cijfer");
        tt = new TextField("",1);
        tt.addActionListener(new ttListener());
        add(lala);
        add(tt);
    }


    public void paint(Graphics g) {
        g.drawString(stst,20,60);
    }


    public class ttListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            sss = tt.getText();
            tni = Integer.parseInt(sss);
            switch (tni) {
                case 1:
                case 2:
                case 3:
                    stst = "slecht";
                    break;
                case 4:
                    stst = "onvoldoende";
                    break;
                case 5:
                    stst = "matig";
                    break;
                case 6:
                case 7:
                    stst = "voldoende";
                    break;
                case 8:
                case 9:
                case 10:
                    stst = "goed";
                    break;
                default:
                    stst = "fout nummer";
            }
            repaint();
        }
    }
}