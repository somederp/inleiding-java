package Challenges;/*
 * Created by Patrick on 28-9-2018.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class ChallengeSlot extends Applet {
    URL toImages;
    Image slot1[], slot2[], slot3[];
    double rA, rB, rC;
    int rImageA, rImageB, rImageC, coins;
    Button reroll, restock;



    public void init() {
        coins = 10;
        toImages = ChallengeSlot.class.getResource("/images/");
        reroll = new Button("Reroll");
        reroll.addActionListener(new rollListener());
        add(reroll);
        restock = new Button("Get 10 coins");
        restock.addActionListener(new stockListener());
        add(restock);
        restock.setEnabled(false);
        initRepeats();
        initSlots();
    }

    public void initSlots() {
        slot1[0] = getImage(toImages, "fruit_1.jpg");
        slot1[1] = getImage(toImages, "fruit_2.jpg");
        slot1[2] = getImage(toImages, "fruit_3.jpg");
        slot1[3] = getImage(toImages, "fruit_4.jpg");
        slot1[4] = getImage(toImages, "fruit_5.jpg");
        slot1[5] = getImage(toImages, "fruit_6.jpg");
        slot1[6] = getImage(toImages, "fruit_7.jpg");
        slot1[7] = getImage(toImages, "fruit_8.jpg");
        slot1[8] = getImage(toImages, "fruit_9.jpg");
        slot1[9] = getImage(toImages, "fruit_10.jpg");
        slot1[10] = getImage(toImages, "fruit_11.jpg");
        slot1[11] = getImage(toImages, "fruit_12.jpg");
        slot1[12] = getImage(toImages, "fruit_13.jpg");
        slot1[13] = getImage(toImages, "fruit_14.jpg");
        slot1[14] = getImage(toImages, "fruit_15.jpg");
        slot1[15] = getImage(toImages, "fruit_16.jpg");
        slot1[16] = getImage(toImages, "fruit_17.jpg");
        slot1[17] = getImage(toImages, "fruit_18.jpg");
        slot1[18] = getImage(toImages, "fruit_19.jpg");
        slot1[19] = getImage(toImages, "fruit_20.jpg");
        slot2[0] = getImage(toImages, "fruit_1.jpg");
        slot2[1] = getImage(toImages, "fruit_2.jpg");
        slot2[2] = getImage(toImages, "fruit_3.jpg");
        slot2[3] = getImage(toImages, "fruit_4.jpg");
        slot2[4] = getImage(toImages, "fruit_5.jpg");
        slot2[5] = getImage(toImages, "fruit_6.jpg");
        slot2[6] = getImage(toImages, "fruit_7.jpg");
        slot2[7] = getImage(toImages, "fruit_8.jpg");
        slot2[8] = getImage(toImages, "fruit_9.jpg");
        slot2[9] = getImage(toImages, "fruit_10.jpg");
        slot2[10] = getImage(toImages, "fruit_11.jpg");
        slot2[11] = getImage(toImages, "fruit_12.jpg");
        slot2[12] = getImage(toImages, "fruit_13.jpg");
        slot2[13] = getImage(toImages, "fruit_14.jpg");
        slot2[14] = getImage(toImages, "fruit_15.jpg");
        slot2[15] = getImage(toImages, "fruit_16.jpg");
        slot2[16] = getImage(toImages, "fruit_17.jpg");
        slot2[17] = getImage(toImages, "fruit_18.jpg");
        slot2[18] = getImage(toImages, "fruit_19.jpg");
        slot2[19] = getImage(toImages, "fruit_20.jpg");
        slot3[0] = getImage(toImages, "fruit_1.jpg");
        slot3[1] = getImage(toImages, "fruit_2.jpg");
        slot3[2] = getImage(toImages, "fruit_3.jpg");
        slot3[3] = getImage(toImages, "fruit_4.jpg");
        slot3[4] = getImage(toImages, "fruit_5.jpg");
        slot3[5] = getImage(toImages, "fruit_6.jpg");
        slot3[6] = getImage(toImages, "fruit_7.jpg");
        slot3[7] = getImage(toImages, "fruit_8.jpg");
        slot3[8] = getImage(toImages, "fruit_9.jpg");
        slot3[9] = getImage(toImages, "fruit_10.jpg");
        slot3[10] = getImage(toImages, "fruit_11.jpg");
        slot3[11] = getImage(toImages, "fruit_12.jpg");
        slot3[12] = getImage(toImages, "fruit_13.jpg");
        slot3[13] = getImage(toImages, "fruit_14.jpg");
        slot3[14] = getImage(toImages, "fruit_15.jpg");
        slot3[15] = getImage(toImages, "fruit_16.jpg");
        slot3[16] = getImage(toImages, "fruit_17.jpg");
        slot3[17] = getImage(toImages, "fruit_18.jpg");
        slot3[18] = getImage(toImages, "fruit_19.jpg");
        slot3[19] = getImage(toImages, "fruit_20.jpg");
    }
    public void initRepeats() {
        rA = Math.random();
        rB = Math.random();
        rC = Math.random();
        rImageA = (int) (rA * 19 + 0);
        rImageB = (int) (rB * 19 + 0);
        rImageC = (int) (rC * 19 + 0);
        slot1 = new Image[20];
        slot2 = new Image[20];
        slot3 = new Image[20];
    }


    public void paint(Graphics g) {
        g.drawImage(slot1[rImageA], 20, 60, 200, 400, this);
        g.drawImage(slot2[rImageB], 220, 60, 200, 400, this);
        g.drawImage(slot3[rImageC], 420, 60, 200, 400, this);
        g.drawString("Coins: " + coins, 200, 480);
    }

    class rollListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            coins -= 1;
            initRepeats();
            initSlots();
            repaint();
            if (slot1[rImageA] == slot2[rImageB] && slot2[rImageB] == slot3[rImageC]) {
                coins += 20;
            }
            else {
                if (slot1[rImageA] == slot2[rImageB] || slot2[rImageB] == slot3[rImageC]) {
                    coins += 4;
                }
            }
            if (coins == 0) {
                reroll.setEnabled(false);
                restock.setEnabled(true);
            }
        }
    }

    class stockListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            coins = 10;
            reroll.setEnabled(true);
            restock.setEnabled(false);
            repaint();
        }
    }
}