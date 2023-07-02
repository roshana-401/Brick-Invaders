package org.example;

public class Buttle {
    private int ButtleX;
    private int ButtleY;
    private int colorR;
    private int colorG;
    private int colorB;
    private int Redius;

    public Buttle(int r, int g, int b, int x, int y, int Radius) {
        this.ButtleX = x;
        this.ButtleY = y;
        this.colorR = r;
        this.colorG = g;
        this.colorB = b;
        this.Redius = Radius;
    }

    public int getButtleX() {
        return ButtleX;
    }

    public int getButtleY() {
        return ButtleY;
    }

    public int getColorR() {
        return colorR;
    }

    public int getColorG() {
        return colorG;
    }

    public int getColorB() {
        return colorB;
    }

    public int getRedius() {
        return Redius;
    }

    public void setButtleX(int buttleX) {
        ButtleX = buttleX;
    }

    public void setButtleY(int buttleY) {
        ButtleY = buttleY;
    }

}
