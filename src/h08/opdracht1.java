package h08; /**
 * Created by Patrick on 1-8-2017.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//8.1

public class opdracht1 extends Applet {
    TextField UU;
    Label lalel;
    Button II, jk;
    String s;

    public void init() {
        lalel = new Label("hi");
        UU = new TextField("",20);
        II = new Button("print");
        II.addActionListener(new capnListener());
        jk = new Button("reset");
        jk.addActionListener(new jokeListener());
        add(lalel);
        add(UU);
        add(II);
        add(jk);
        s = "";
    }

    public void paint (Graphics g) {
        g.drawString(s,20,60);
    }

    class capnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = UU.getText();
            repaint();
        }
    }

    class jokeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            UU.setText("");
            repaint();
        }
    }



}