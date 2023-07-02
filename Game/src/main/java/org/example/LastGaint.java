package org.example;

import processing.core.PApplet;
import processing.core.PShape;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class LastGaint {
    private PApplet space;
    private PShape Gaint;
    private int GaintX = 150;
    private int checkButtle=0;
    private int checkDanger=0;

    private boolean check;
    private boolean come=false;
    private boolean checkback = true;
    private int GantXnext = 100;
    private int GaintY = -400;

    public LastGaint(PApplet main, PShape Gaint) {
        this.space = main;
        this.Gaint = Gaint;

    }

    public void DrawGaint() {
        if(come==true) {
            getX();
            if (checkButtle == 15) {
                CreateButtleofGaint(GaintX, GaintY);
                Main.playerButtleGain.play(0);
                checkButtle = 0;
            }
        }
        space.translate(GaintX, GaintY, 0);
        space.shape(Gaint);
        checkButtle++;
    }

    public void getX() {
        check = checkX(GaintX, GantXnext, checkback);
        if (check) {
            if (!checkback)
                GaintX -= 5;
            else
                GaintX += 5;
        } else {
            GaintX = GantXnext;
            GantXnext = randomX();
            if (GantXnext <= GaintX) {
                checkback = false;
            } else
                checkback = true;
        }
    }

    public boolean checkX(int X, int nextX, boolean check) {
        if (check) {
            if (X < nextX) {
                return true;
            } else
                return false;
        } else {
            if (nextX <= X) {
                return true;
            } else
                return false;
        }
    }

    public int randomX() {
        int X = (int) space.random(90, 550);
        return X;
    }
    public void CreateButtleofGaint(int X,int Y)
    {
        Main.meteorites.add(new Meteorite(X-110,Y+150,0,100,5));
        Main.meteorites.add(new Meteorite(X+250,Y+150,0,100,5));
    }

    public void itcome(int speed){
        if(speed+GaintY<=90)
        {
            setGaintY(speed+GaintY);
        }
        come=true;
    }
    public void setGaintY(int gaintY) {
        GaintY = gaintY;
    }

    public int getGaintX() {
        return GaintX;
    }

    public int getGaintY() {
        return GaintY;
    }

}
