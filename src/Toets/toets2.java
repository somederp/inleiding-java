package Toets; /**
 * Created by Patrick on 16-10-2017.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class toets2 extends Applet {
    TextField textfield;
    Label label;
    Button button;
    String str;
    int time, London, NY, Sydney, Tokyo;

    public void init() {
        time = -1;
        label = new Label("Typ een uur");
        textfield = new TextField("",5);
        button = new Button("Laat tijden zien");
        button.addActionListener(new buttonListener());
        add(label);
        add(textfield);
        add(button);
        str = "";
    }



    public void paint(Graphics g) {
        if(str == "Verkeerd nummer") {
            g.drawString(str, 20, 80);
        }
        else {

            if (time == -1) {}

            else {
                g.drawString("De tijd in London is " + London + ":00 uur", 20, 80);
                g.drawString("De tijd in Tokyo is " + Tokyo + ":00 uur", 20, 100);
                g.drawString("De tijd in New York is " + NY + ":00 uur", 20, 120);
                g.drawString("De tijd in Sydney is " + Sydney + ":00 uur", 20, 140);
            }
        }
    }


    class buttonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            str = textfield.getText();
            time = Integer.parseInt(str);
            if (time <= 23) {
                London = time - 1;
                Tokyo = time + 7;
                NY = time - 6;
                Sydney = time + 9;
                if (Sydney > 23) {
                    Sydney -= 24;
                }
                if (Tokyo > 23) {
                    Tokyo -= 24;
                }
                if (NY < 0) {
                    NY += 24;
                }
                if (London < 0) {
                    London += 24;
                }
            }

            else {
                str = "Verkeerd nummer";
            }
            repaint();
        }
    }
}