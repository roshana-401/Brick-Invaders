package org.example;

import processing.core.PApplet;
import processing.core.PShape;

public class Meteorite {

    private PApplet space;

    private int heart = 100;
    private int Score;
    private float speed;
    private int MeteoriteX;
    private int MeteoriteY=-10;
    private int MeteoriteZ;

    public Meteorite(PApplet main) {
        this.space = main;
    }

    public Meteorite(int x, int y, int z, int heart, int Score,float speed) {
        this.MeteoriteX = x;
        this.MeteoriteY = y;
        this.MeteoriteZ = z;
        this.speed=speed;
        this.heart = heart;
        this.Score = Score;
    }
    public Meteorite(int x, int y, int z, int heart,float speed) {
        this.MeteoriteX = x;
        this.MeteoriteY = y;
        this.MeteoriteZ = z;
        this.speed=speed;
        this.heart = heart;
    }

    public void makemeteorite()
    {
        for(int i=0;i<250;i++) {
            int randomX;
            do {
                randomX = (int) space.random(10, 830);

               } while (!isCheck(randomX, MeteoriteY));
            if(i!=50 && i!=100) {
                Main.meteorites.add(new Meteorite(randomX, MeteoriteY, 0, 100, 50, 5));
            }
            if(i==50)
                Heart(randomX,MeteoriteY);
            if(i==100)
                Heart(randomX,MeteoriteY);

                 MeteoriteY -= 80;
        }
    }
    public  void Heart(int x,int y)
    {
        Main.heart.add(new Heartt(x,y,3));
    }
    private boolean isCheck(int x, int y) {
        if (Main.meteorites.size() != 0) {
            for (Meteorite m : Main.meteorites) {
                if (space.dist(x, y, m.MeteoriteX, m.MeteoriteY) < 10 && space.dist(x, y-80, m.MeteoriteX, m.MeteoriteY) <10) {
                    return false;
                }
            }
        }
        return true;
    }


    public void setMeteoriteY(int meteoriteY) {
        MeteoriteY = meteoriteY;
    }

    public int getMeteoriteY() {
        return MeteoriteY;
    }

    public int getMeteoriteX() {
        return MeteoriteX;
    }

    public int getHeart() {
        return heart;
    }

    public int getScore() {
        return Score;
    }

    public float getSpeed() {
        return speed;
    }

    public int getMeteoriteZ() {
        return MeteoriteZ;
    }

    public void setHeart(int heart) {
        this.heart = heart;
    }

    public void setScore(int score) {
        Score = score;
    }
}
