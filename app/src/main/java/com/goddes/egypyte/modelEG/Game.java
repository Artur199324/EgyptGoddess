package com.goddes.egypyte.modelEG;

import android.widget.ImageView;

import com.goddes.egypyte.R;

import java.util.ArrayList;
import java.util.Random;

public class Game {

    private ImageView cscz, zcsa;
    private int cssc;
    private int cscxz;
    private ImageView fgre;
    private int sI;
    private int sI2;

    public int getsI() {
        return sI;
    }

    public void setsI(int sI) {
        this.sI = sI;
    }

    public int getsI2() {
        return sI2;
    }

    public void setsI2(int sI2) {
        this.sI2 = sI2;
    }

    public ImageView getZcsa() {
        return zcsa;
    }

    public void setZcsa(ImageView zcsa) {
        this.zcsa = zcsa;
    }

    public Game() {
    }

    public ImageView getCscz() {
        return cscz;
    }

    public void setCscz(ImageView cscz) {
        this.cscz = cscz;
    }

    public int getCssc() {
        return cssc;
    }

    public void setCssc(int cssc) {
        this.cssc = cssc;
    }

    public int getCscxz() {
        return cscxz;
    }

    public void setCscxz(int cscxz) {
        this.cscxz = cscxz;
    }

    public ImageView imageStart() {
        cscz.setImageResource(R.drawable.highpay);
        cscz.setY(0 - cscz.getWidth());
        cscz.setX(0);
        return cscz;
    }

    public ImageView imageMove(ImageView imageView) {
        imageView.setX(imageView.getX() + getsI());
        if (imageView.getX() > getCssc()) {
            imageView.setX(0);
        }
        return imageView;
    }

    public ImageView imageFallingStart(ImageView imageView) {
        Random ra = new Random();
        int r = ra.nextInt(6);
        if (r == 0) {
            zcsa.setImageResource(R.drawable.slot1);
        }
        if (r == 1) {
            zcsa.setImageResource(R.drawable.slot2);
        }
        if (r == 2) {
            zcsa.setImageResource(R.drawable.slot3);
        }
        if (r == 3) {
            zcsa.setImageResource(R.drawable.slot4);
        }
        if (r == 4) {
            zcsa.setImageResource(R.drawable.slot5);
        }
        if (r == 5) {
            zcsa.setImageResource(R.drawable.slot6);
        }

        zcsa.setX(imageView.getX() + 50);
        zcsa.setY(imageView.getY() + imageView.getHeight());

        return zcsa;
    }

    public ImageView imageFallingMove(ArrayList<ImageView> arrayListImages) {

        for (int i = 0; i < arrayListImages.size(); i++) {
            fgre = arrayListImages.get(i);
            fgre.setY(fgre.getY() + getsI2());

        }
        return fgre;
    }

}
