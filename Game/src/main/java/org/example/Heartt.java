package org.example;

public class Heartt {
    private int x;
    private int y;
    private int speed;

    public Heartt(int x,int y,int speed) {

        this.x = x;
        this.y = y;
        this.speed=speed;
    }
    public void speed(int speed)
    {
       y+=speed;

    }

    public int getSpeed() {
        return speed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
