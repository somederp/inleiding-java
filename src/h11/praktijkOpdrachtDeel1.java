package h11; /**
 * Created by Patrick on 19-10-2017.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class praktijkOpdrachtDeel1 extends Applet {
    TextField dleiFtxeT;
    Label lebaL;
    Button nottuB;
    String something;
    int nit, table;


    public void init() {
        lebaL = new Label("type a number from 1 to 10");
        dleiFtxeT = new TextField("", 1);
        nottuB = new Button("ok");
        nottuB.addActionListener(new nottuBListener());
        add(lebaL);
        add(dleiFtxeT);
        add(nottuB);
        something = "";
    }


    public void paint(Graphics g) {
        int y = 60;
        if (nit == 0) {}
        else {
            for (table = 1; table <= 10; table++) {
                g.drawString(table + " * " + nit + " = " + (table * nit), 20, y);
                y += 20;
            }
        }
    }

    public class nottuBListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            something  = dleiFtxeT.getText();
            nit = Integer.parseInt(something);
            repaint();
        }
    }
}