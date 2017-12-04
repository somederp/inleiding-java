package h12; /**
 * Created by Patrick on 20-11-2017.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet {
    int numbers[];
    int parser;
    String parser2;
    Button bttn;
    TextField txtfld;
    boolean find;


    public void init() {
        find = false;
        numbers = new int[10];

        for (int counter = 0; counter < numbers.length; counter++) {
            numbers[counter] = counter;
        }

        txtfld = new TextField();
        bttn = new Button("ok");
        bttn.addActionListener(new bttnListener());
        add(txtfld);
        add(bttn);
    }



    public void paint(Graphics g) {
            if (find == true) {
                g.drawString("the value has been found: " + parser, 20, 60);
            } else {
                g.drawString("the value was not found", 20, 60);
            }

    }


    public class bttnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            parser2 = txtfld.getText();
            parser = Integer.parseInt(parser2);
            for (int counter2 = 0; counter2 < numbers.length; counter2++) {
                if (numbers[counter2] == parser) {
                    find = true;
                }
            }
            repaint();
        }
    }
}