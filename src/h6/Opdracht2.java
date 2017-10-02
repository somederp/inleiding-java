package h6;

/**
 * Created by Patrick on 2-10-2017.
 */
import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet{
    int uur, dag, jaar;

    public void init() {
        uur = 60 * 60;
        dag = uur * 24;
        jaar = dag * 365;
    }

    public void paint (Graphics g) {
        g.drawString("aantal seconden in een uur: " + uur,20,20);
        g.drawString("aantal seconden in een dag: " + dag,20,40);
        g.drawString("aantal seconden in een jaar: " + jaar,20,60);
    }
}