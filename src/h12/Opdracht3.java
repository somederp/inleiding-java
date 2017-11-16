package h12; /**
 * Created by Patrick on 16-11-2017.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Opdracht3 extends Applet {
    TextField textfieldarray[];
    Button okButton;

    public void init() {
        okButton = new Button("ok");
        okButton.addActionListener(new OkListener());
        textfieldarray = new TextField[5];

        for (int counter = 0; counter < textfieldarray.length; counter++) {
            TextField textfield = new TextField();
            textfieldarray[counter] = textfield;
        }

        for (int counter2 = 0; counter2 < 5; counter2++) {
            add(textfieldarray[counter2]);
        }
        add(okButton);
    }


    public void paint(Graphics g) {}


     public class OkListener implements ActionListener {
         public void actionPerformed(ActionEvent e) {

             int[] invoer = new int[5];
             for (int i = 0; i < textfieldarray.length; i++) {
                 String inputString = textfieldarray[i].getText();
                 int parser = Integer.parseInt(inputString);
                 invoer[i] = parser;
             }
             Arrays.sort(invoer);
             for (int i = 0; i < invoer.length; i++) {
                 textfieldarray[i].setText(String.valueOf(invoer[i]));
             }
         }
     }
}