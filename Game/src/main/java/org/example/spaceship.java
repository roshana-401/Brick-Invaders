package org.example;

import processing.core.PApplet;
import processing.core.PShape;

import java.util.ArrayList;
import java.util.Iterator;

import static org.example.Main.*;

public class spaceship implements spaceships {
    private PApplet space;
    private PShape rocket;
    private int spaceshipX;
    private int spaceshipY = 730;

    public spaceship(PApplet main, PShape rocket) {
        this.space = main;
        this.rocket = rocket;

    }

    public void Drawrocket() {

        spaceshipX = mouseXcheck();
        space.translate(spaceshipX, spaceshipY, 0);
        space.shape(rocket);

    }

    public boolean checkCrushed(int SpaceshipX, int SpaceshipY) {
        ArrayList<Meteorite> replace = Main.crushed;
        Iterator<Meteorite> iterator = replace.iterator();
        int distance;
        boolean collided = false;
        while (iterator.hasNext()) {
            Meteorite meteo = iterator.next();
            if (meteo.getMeteoriteY() + 63 >= 690 && meteo.getMeteoriteY() + 63 <= 880) {
                distance = (int) space.dist(getSpaceshipX() + 130, 880, meteo.getMeteoriteX() + 67, meteo.getMeteoriteY() + 63);
                if (distance <= 80 + 100 && Heart > 0) {
                    iterator.remove();
                    meteorites.remove(meteo);
                    collided = true;
                } else if (distance <= 80 + 100 && Heart == 0)
                    collided = true;
            }
            if (meteo.getMeteoriteY() + 63 > 880) {
                distance = (int) space.dist(meteo.getMeteoriteX() + 67, meteo.getMeteoriteY() + 63, SpaceshipX + 130, 880);
                if (distance <= 70 + 100 && Heart > 0) {
                    iterator.remove();
                    meteorites.remove(meteo);
                    collided = true;
                } else if (distance <= 70 + 100 && Heart == 0)
                    collided = true;

            }
            if (meteo.getMeteoriteY()+63 > 1050) {
                meteorites.remove(meteo);
            }
        }

        if (collided)
            return false;

        if (Main.crushed.size() != 0)
            if (Main.crushed.get(Main.crushed.size() - 1).getMeteoriteY() + 63 > 1000)
                Main.crushed.remove(Main.crushed.get(Main.crushed.size() - 1));
        return true;
    }

    public boolean checkCrushedOfGaint(int SpaceshipX, int SpaceshipY) {
        ArrayList<Meteorite> replace = Main.crushed;
        Iterator<Meteorite> iterator = replace.iterator();
        int distance;
        boolean collided = false;
        while (iterator.hasNext()) {
            Meteorite meteo = iterator.next();
            if (meteo.getMeteoriteY() + 50 >= 690 && meteo.getMeteoriteY() + 50 <= 880) {
                distance = (int) space.dist(getSpaceshipX() + 130, 880, meteo.getMeteoriteX() + 53, meteo.getMeteoriteY() + 50);
                if (distance <= 80 + 100 && Heart > 0) {
                    iterator.remove();
                    meteorites.remove(meteo);
                    collided = true;
                } else if (distance <= 80 + 100 && Heart == 0)
                    collided = true;
            }
            if (meteo.getMeteoriteY() + 50 > 880) {
                distance = (int) space.dist(meteo.getMeteoriteX() + 53, meteo.getMeteoriteY() + 50, SpaceshipX + 130, 880);
                if (distance <= 70 + 100 && Heart > 0) {
                    iterator.remove();
                    meteorites.remove(meteo);
                    collided = true;
                } else if (distance <= 70 + 100 && Heart == 0)
                    collided = true;
            }
            if (meteo.getMeteoriteY()+63 > 1050) {
                meteorites.remove(meteo);
            }
        }

        if (collided)
            return false;

        if (Main.crushed.size() != 0)
            if (Main.crushed.get(Main.crushed.size() - 1).getMeteoriteY() + 50 > 1000)
                Main.crushed.remove(Main.crushed.get(Main.crushed.size() - 1));
        return true;
    }

    public boolean checkcrushedHeart(int SpaceshipX, int SpaceshipY) {
        ArrayList<Heartt> replace = Main.heart;
        Iterator<Heartt> iterator = replace.iterator();
        while (iterator.hasNext()) {
            Heartt h = iterator.next();
            if (h.getY() + 40 >= 700) {
                if (h.getY() + 40 >= 695 && h.getY() + 40 <= 880) {
                    int distance = (int) space.dist(getSpaceshipX() + 130, 880, h.getX() + 40, h.getY() + 40);
                    if (distance <= 80 + 80) {
                        iterator.remove();
                        Main.heart = replace;
                        return false;
                    }
                } else if (h.getY() + 40 > 880) {
                    int distance = (int) space.dist(h.getX() + 40, h.getY() + 40, SpaceshipX + 130, 880);
                    if (distance <= 80 + 80) {
                        iterator.remove();
                        Main.heart = replace;
                        return false;
                    }
                }
            }
        }
        if (Main.heart.size() != 0)
            if (Main.heart.get(Main.heart.size() - 1).getY() + 40 > 1000)
                Main.heart.remove(Main.heart.get(Main.heart.size() - 1));
        return true;
    }

    public int mouseXcheck() {
        int x;
        if (space.mouseX > 630) {
            x = 630;
            return x;
        } else if (space.mouseX < 20) {
            x = 20;
            return x;
        } else
            return space.mouseX;
    }

    public int getSpaceshipX() {
        return spaceshipX;
    }

    public int getSpaceshipY() {
        return spaceshipY;
    }
}
