package h10; /**
 * Created by Patrick on 4-9-2017.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//10.3 en 4

public class H10 extends Applet {
    TextField tf, ftf;
    Label lbl, blb;
    String s, scd, s2;
    int maand, jaar, feb;

    public void init() {
        tf = new TextField("",1);
        tf.addActionListener(new tfListener());
        ftf = new TextField("",2);
        ftf.addActionListener(new ftfListener());
        blb = new Label("     type a year.");
        lbl = new Label("type a month number.");
        scd = "";
        add(lbl);
        add(tf);
        add(blb);
        add(ftf);
    }



    public void paint(Graphics g) {
        g.drawString(scd,20,100);
    }


    class tfListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tf.getText();
            maand = Integer.parseInt(s);
            switch (maand){
                    case 1:
                        scd = "January, 31 days";
                        break;
                    case 2:
                        scd = "February, " + feb +  " days";
                        break;
                    case 3:
                        scd = "March, 31 days";
                        break;
                    case 4:
                        scd = "April, 30 days";
                        break;
                    case 5:
                        scd = "May, 31 days";
                        break;
                    case 6:
                        scd = "June, 30 days";
                        break;
                    case 7:
                        scd = "July, 31 days";
                        break;
                    case 8:
                        scd = "August, 31 days";
                        break;
                    case 9:
                        scd = "September, 30 days";
                        break;
                    case 10:
                        scd = "October, 31 days";
                        break;
                    case 11:
                        scd = "November, 30 days";
                        break;
                    case 12:
                        scd = "December, 31 days";
                        break;
                    default:
                        scd = "that's not a month...";
                        break;
                }

            repaint();
        }
    }

    class ftfListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s2 = ftf.getText();
            jaar = Integer.parseInt(s2);
            if ( (jaar % 4 == 0 && !(jaar % 100 == 0)) ||
                    jaar % 400 == 0 ) {
                feb = 29;
            }
            else {
                feb = 28;
            }
        }
    }
}