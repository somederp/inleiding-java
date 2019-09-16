package Challenges;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;


public class DICE extends Applet {
    Button roll;
    String score;
    URL toDICE;
    Image die1[], die2[], die3[], die4[], die5[];
    double rA, rB, rC, rD, rE;
    int rDieA, rDieB, rDieC, rDieD, rDieE, points;

    public void init() {
        toDICE = DICE.class.getResource("/dobbels/");
        roll = new Button("Roll");
        roll.addActionListener(new RollListener());
        add(roll);
        initRandoms();
        initDICE();
        points = rDieA + rDieB + rDieC + rDieD + rDieE;
        score = "Highest score: " + points;
    }

    public void initDICE() {
        die1[0] = null;
        die1[1] = getImage(toDICE, "dobbel1.jpg");
        die1[2] = getImage(toDICE, "dobbel2.jpg");
        die1[3] = getImage(toDICE, "dobbel3.jpg");
        die1[4] = getImage(toDICE, "dobbel4.jpg");
        die1[5] = getImage(toDICE, "dobbel5.jpg");
        die1[6] = getImage(toDICE, "dobbel6.jpg");
        die2[0] = null;
        die2[1] = getImage(toDICE, "dobbel1.jpg");
        die2[2] = getImage(toDICE, "dobbel2.jpg");
        die2[3] = getImage(toDICE, "dobbel3.jpg");
        die2[4] = getImage(toDICE, "dobbel4.jpg");
        die2[5] = getImage(toDICE, "dobbel5.jpg");
        die2[6] = getImage(toDICE, "dobbel6.jpg");
        die3[0] = null;
        die3[1] = getImage(toDICE, "dobbel1.jpg");
        die3[2] = getImage(toDICE, "dobbel2.jpg");
        die3[3] = getImage(toDICE, "dobbel3.jpg");
        die3[4] = getImage(toDICE, "dobbel4.jpg");
        die3[5] = getImage(toDICE, "dobbel5.jpg");
        die3[6] = getImage(toDICE, "dobbel6.jpg");
        die4[0] = null;
        die4[1] = getImage(toDICE, "dobbel1.jpg");
        die4[2] = getImage(toDICE, "dobbel2.jpg");
        die4[3] = getImage(toDICE, "dobbel3.jpg");
        die4[4] = getImage(toDICE, "dobbel4.jpg");
        die4[5] = getImage(toDICE, "dobbel5.jpg");
        die4[6] = getImage(toDICE, "dobbel6.jpg");
        die5[0] = null;
        die5[1] = getImage(toDICE, "dobbel1.jpg");
        die5[2] = getImage(toDICE, "dobbel2.jpg");
        die5[3] = getImage(toDICE, "dobbel3.jpg");
        die5[4] = getImage(toDICE, "dobbel4.jpg");
        die5[5] = getImage(toDICE, "dobbel5.jpg");
        die5[6] = getImage(toDICE, "dobbel6.jpg");
    }
    public void initRandoms() {
        rA = Math.random();
        rB = Math.random();
        rC = Math.random();
        rD = Math.random();
        rE = Math.random();
        rDieA = (int) (rA * 6 + 1);
        rDieB = (int) (rB * 6 + 1);
        rDieC = (int) (rC * 6 + 1);
        rDieD = (int) (rD * 6 + 1);
        rDieE = (int) (rE * 6 + 1);
        points = rDieA + rDieB + rDieC + rDieD + rDieE;
        score = "Highest score: " + points;
        die1 = new Image[7];
        die2 = new Image[7];
        die3 = new Image[7];
        die4 = new Image[7];
        die5 = new Image[7];
    }

    public void paint(Graphics g) {
        g.drawImage(die1[rDieA], 20, 60, 50, 50, this);
        g.drawImage(die2[rDieB], 70, 60, 50, 50, this);
        g.drawImage(die3[rDieC], 120, 60, 50, 50, this);
        g.drawImage(die4[rDieD], 170, 60, 50, 50, this);
        g.drawImage(die5[rDieE], 220, 60, 50, 50, this);
        g.drawString(score, 70, 140);
    }

    class RollListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            initRandoms();
            initDICE();
            repaint();
            if (die1[rDieA] == die2[rDieB] && die1[rDieA] == die3[rDieC] && die1[rDieA] == die4[rDieD] && die1[rDieA] == die5[rDieE]) {
                score = "YAHTZEE!!";
            }
        }
    }
}