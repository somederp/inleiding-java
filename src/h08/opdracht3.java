package h08; /**
 * Created by Patrick on 10-8-2017.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//8.3

public class opdracht3 extends Applet {
    TextField fgr;
    Button vvvv;
    Label trh;
    double asdf;


    public void init() {
        trh = new Label("type an amount");
        fgr = new TextField("",20);
        vvvv = new Button("ok");
        vvvv.addActionListener(new vListener());
        add(trh);
        add(fgr);
        add(vvvv);
    }


    public void paint(Graphics g) {
        g.drawString("€" + asdf,20,60);
    }


    class vListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            asdf = Double.parseDouble(fgr.getText()) * 1.21;
            repaint();
        }
    }

}