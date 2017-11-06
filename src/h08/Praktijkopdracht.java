package h08; /**
 * Created by Patrick on 4-11-2017.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {
    TextField text, field;
    Button plus, minus, times, divide;
    String str, ing;
    double dou, ble;

    public void init() {
        text = new TextField("", 5);
        field = new TextField("", 5);
        plus = new Button("+");
        plus.addActionListener(new plusListener());
        minus = new Button("-");
        minus.addActionListener(new minusListener());
        times = new Button("*");
        times.addActionListener(new timesListener());
        divide = new Button("/");
        divide.addActionListener(new divideListener());
        add(text);
        add(field);
        add(plus);
        add(minus);
        add(times);
        add(divide);
    }


    public void paint(Graphics g) {}


    public class plusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            str = text.getText();
            dou = Double.parseDouble(str);
            ing = field.getText();
            ble = Double.parseDouble(ing);
            double uitkomst = dou + ble;
            text.setText("" + uitkomst);
            field.setText("");
        }
    }

    public class minusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            str = text.getText();
            dou = Double.parseDouble(str);
            ing = field.getText();
            ble = Double.parseDouble(ing);
            double uitkomst = dou - ble;
            text.setText("" + uitkomst);
            field.setText("");
        }
    }

    public class timesListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            str = text.getText();
            dou = Double.parseDouble(str);
            ing = field.getText();
            ble = Double.parseDouble(ing);
            double uitkomst = dou * ble;
            text.setText("" + uitkomst);
            field.setText("");
        }
    }

    public class divideListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            str = text.getText();
            dou = Double.parseDouble(str);
            ing = field.getText();
            ble = Double.parseDouble(ing);
            double uitkomst = dou / ble;
            text.setText("" + uitkomst);
            field.setText("");
        }
    }
}