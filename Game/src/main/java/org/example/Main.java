package org.example;

import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

public class Main extends PApplet {

    private PShape rocket;

    private PImage texturerocket1;
    private PImage texturerocket2;
    private PImage texturerocket3;
    private PImage texturerocket4;

    //--------------------------------------------------
    private PShape rocket2;
    private PShape rocketicon2;
    private PImage texturerocket2_1;
    private PImage texturerocket2_2;
    private PImage texturerocket2_3;
    private PImage texturerocket2_4;
    private PImage texturerocket2_5;
    //---------------------------------------------------
    private PShape rocket3;
    private PShape rocketicon3;

    private PImage texturerocket3_1;
    private PImage texturerocket3_2;
    private PImage texturerocket3_3;
    private PImage texturerocket3_4;

    //-------------------------------------------------------
    private PShape Giant;

    private PImage texturerocketGaint_1;
    private PImage texturerocketGaint_2;
    private PImage texturerocketGaint_3;
    private PImage texturerocketGaint_4;
    //------------------------------------------------------
    private PImage backgroundd;
    private PImage backgroundstart;
    private PImage backgroundgameover;
    private PImage backgroundWin;
    private PImage backgroundHelp;

    private PImage backgroundstop;

    //-------------------------------------------------------
    private PImage meteorite;
    private PImage Buttlemeteorite;
    //-------------------------------------------------------
    private PImage Hearts;
    private PImage BlackHearts;
    //-------------------------------------------------------
    private Minim minim;
    private Minim minimtwo;
    private Minim minimthree;
    private Minim minFour;

    private AudioPlayer player;
    private AudioPlayer playerGaint;
    private AudioPlayer playerButtle;
    static AudioPlayer playerButtleGain;
    //-------------------------------------------------------
    private boolean checkLost = true;
    private boolean Music = false;
    private boolean checkstart = false;
    private boolean boolspaceship1 = false;
    private boolean boolspaceship2 = false;
    private boolean boolspaceship3 = false;
    private boolean checkheart = true;
    private boolean checkwin = true;
    private boolean checklastmateorite = false;
    private boolean startlastpart = false;
    private boolean checkismenu = true;
    private boolean checkOpenmenu = false;
    private boolean checkisPressed = false;
    private boolean checkwintoGaint = false;
    private boolean checkOpenHelpMenu = false;


    int score = 0;
    static int Heart = 1;
    private int BlackHeartt = 5000;
    static ArrayList<Meteorite> meteorites = new ArrayList<>();
    static ArrayList<Heartt> heart = new ArrayList<>(2);
    static ArrayList<Meteorite> crushed = new ArrayList<>();
    private ArrayList<Buttle> buttlespaceship1 = new ArrayList<>();
    private ArrayList<Buttle> buttlespaceship2 = new ArrayList<>();
    private ArrayList<Buttle> buttlespaceship3 = new ArrayList<>();
    private LastGaint Gaintt;
    private spaceship space;
    private spaceship2 space2;
    private spaceship3 space3;

    public static void main(String[] args) {
        PApplet.main(new String[]{"org.example.Main"});
    }

    public void setup() {
        PApplet game = this;
        if (checkOpenmenu == false) {
            //rocket with texture----------------------------------

            rocket = loadShape("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\DeathRow_lowpoly\\DeathRow_lowpoly.obj");

            texturerocket1 = loadImage("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\DeathRow_lowpoly\\texture\\DeathRow_Low_Cube001_[Normal].png");
            texturerocket2 = loadImage("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\DeathRow_lowpoly\\texture\\DeathRow_Low_Cube001_[Metalness].png");
            texturerocket3 = loadImage("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\DeathRow_lowpoly\\texture\\DeathRow_Low_Cube001_[Roughness].png");
            texturerocket4 = loadImage("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\DeathRow_lowpoly\\texture\\DeathRow_Low_Cube001_[AlbedoM].png");

            rocket.setTexture(texturerocket1);
            rocket.setTexture(texturerocket2);
            rocket.setTexture(texturerocket3);
            rocket.setTexture(texturerocket4);

            //rocket2 with texture-----------------------------------------
            rocket2 = loadShape("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\Spaceship_Final\\Spaceship_Final.obj");
            rocketicon2 = loadShape("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\Spaceship_Final\\icon\\Spaceship_Final.obj");

            texturerocket2_1 = loadImage("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\Spaceship_Final\\textures\\Vaisseau_Disp.png");
            texturerocket2_2 = loadImage("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\Spaceship_Final\\textures\\Vaisseau_metallic.tga.png");
            texturerocket2_3 = loadImage("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\Spaceship_Final\\textures\\Vaisseau_AO.png");
            texturerocket2_4 = loadImage("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\Spaceship_Final\\textures\\Vaisseau_Nor.png");
            texturerocket2_5 = loadImage("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\Spaceship_Final\\textures\\Vaisseau_basecolor.tga.png");

            rocket2.setTexture(texturerocket2_1);
            rocket2.setTexture(texturerocket2_2);
            rocket2.setTexture(texturerocket2_3);
            rocket2.setTexture(texturerocket2_4);
            rocket2.setTexture(texturerocket2_5);

            rocketicon2.setTexture(texturerocket2_1);
            rocketicon2.setTexture(texturerocket2_2);
            rocketicon2.setTexture(texturerocket2_3);
            rocketicon2.setTexture(texturerocket2_4);
            rocketicon2.setTexture(texturerocket2_5);

            //rocket3 with texture-------------------------------------------
            rocket3 = loadShape("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\spaceship\\SpaceShip.obj");
            rocketicon3 = loadShape("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\spaceship\\icon\\SpaceShip.obj");

            texturerocket3_1 = loadImage("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\spaceship\\textures\\W_SpaceShipTexture_DefaultMaterial_Specula.png");
            texturerocket3_2 = loadImage("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\spaceship\\textures\\W_SpaceShipTexture_Material_Normal.png");
            texturerocket3_3 = loadImage("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\spaceship\\textures\\W_SpaceShipTexture_DefaultMaterial_Normal.png");
            texturerocket3_4 = loadImage("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\spaceship\\textures\\W_SpaceShipTexture_DefaultMaterial_Specula.png");

            rocket3.setTexture(texturerocket3_1);
            rocket3.setTexture(texturerocket3_2);
            rocket3.setTexture(texturerocket3_3);
            rocket3.setTexture(texturerocket3_4);

            rocketicon3.setTexture(texturerocket3_1);
            rocketicon3.setTexture(texturerocket3_2);
            rocketicon3.setTexture(texturerocket3_3);
            rocketicon3.setTexture(texturerocket3_4);
            //---------------------------------------------------------------------------
            Giant = loadShape("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\Thelastgiant\\source\\attack craft.obj");

            texturerocketGaint_1 = loadImage("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\Thelastgiant\\textures\\wire_228153184_Normal_OpenGL.png");
            texturerocketGaint_2 = loadImage("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\Thelastgiant\\textures\\wire_228153184_Metallic.png");
            texturerocketGaint_3 = loadImage("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\Thelastgiant\\textures\\wire_228153184_Roughness.png");
            texturerocketGaint_4 = loadImage("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\Thelastgiant\\textures\\wire_228153184_Base_color.png");

            Giant.setTexture(texturerocketGaint_1);
            Giant.setTexture(texturerocketGaint_2);
            Giant.setTexture(texturerocketGaint_3);
            Giant.setTexture(texturerocketGaint_4);
            //background ----------------------------------------------------------------
            backgroundd = loadImage("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\background\\backgroundGame\\Game.jpg");
            backgroundd.resize(900, 1000);
            backgroundstart = loadImage("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\background\\backgroundstart\\81JJWE52GIS.jpg");
            backgroundstart.resize(900, 1000);
            backgroundstop = loadImage("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\background\\backgroundpuse\\Stop.jpg");
            backgroundstop.resize(900, 1000);
            backgroundgameover = loadImage("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\background\\backgroundGameOver\\Gameover.jpg");
            backgroundgameover.resize(900, 1000);
            backgroundWin = loadImage("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\background\\BackgroundWin\\you-win-neon-signs-style-text-vector.jpg");
            backgroundWin.resize(900, 1000);
            backgroundHelp = loadImage("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\background\\backgroundHelp\\Pa90hw.jpg");
            backgroundHelp.resize(900, 1000);
            //Meteorite ----------------------------------------------------------------
            meteorite = loadImage("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\Meteorite\\pngimg.com - asteroid_PNG28.png");
            Buttlemeteorite = loadImage("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\Meteorite\\pngimg.com - asteroid_PNG28.png");
            meteorite.resize(130, 130);
            Buttlemeteorite.resize(100, 100);
            //----------------------------------------------------------------
            Hearts = loadImage("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\Heart\\pngtree-smooth-glossy-heart-vector-file-ai-and-png-png-image_4557871.png");
            Hearts.resize(80, 80);
            BlackHearts = loadImage("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\Heart\\Black-Heart-PNG-Photos.png");
            BlackHearts.resize(150, 100);
            //----------------------------------------------------------------
        }
        minim = new Minim(this);
        player = minim.loadFile("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\Music\\import_1194_1.mp3");
        //-----------------------------------------------------------------
        minFour = new Minim(this);
        playerButtleGain = minFour.loadFile("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\Music\\۱.mp3");
        //-----------------------------------------------------------------
        minimthree = new Minim(this);
        playerGaint = minimthree.loadFile("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\Music\\import_1198_1.mp3");
        //-----------------------------------------------------------------
        minimtwo = new Minim(this);
        playerButtle = minimtwo.loadFile("E:\\Java Roshana\\DodgeUp\\Game\\src\\test\\Music\\20230624-023347757 (1).mp3");
        //-----------------------------------------------------------------
        Gaintt = new LastGaint(game, Giant);
        space = new spaceship(game, rocket);
        space2 = new spaceship2(game, rocket2);
        space3 = new spaceship3(game, rocket3);

        Meteorite spacerock = new Meteorite(game);
        spacerock.makemeteorite();
    }

    @Override
    public void settings() {
        size(900, 1000, P3D);
    }

    public void draw() {
        if (checkismenu == true) {
            startGame();
        }
        if (checkOpenmenu == true) {
            Openmenu();
        }
        if (checkwin == false && checkLost == true || startlastpart == true && checkwintoGaint == true) {
            checkstart = false;
            player.close();
            playerGaint.close();
            playerButtle.close();
            menuWin();
        }
        if (checkLost == false && checkwin == true) {
            checkstart = false;
            menuGameOver();
        }
        if (checkstart) {
            if (checkLost == true) {
                background(backgroundd);
                checkheart = true;
                if (Music == true && startlastpart == true) {
                    playerGaint.loop();
                    Music = false;
                }
                for (Meteorite m : meteorites) {
                    showmeteorite(m);
                    speedY(m);
                }
                for (Heartt h : heart) {
                    showHeart(h);
                    speedYHeart(h);
                }
                pushMatrix();
                showmenu();
                popMatrix();
                if (boolspaceship1 == true)
                    if (score == 2000) {
                        boolspaceship1 = false;
                        boolspaceship2 = true;
                    }
                if (boolspaceship2 == true)
                    if (score == 3500) {
                        boolspaceship2 = false;
                        boolspaceship3 = true;
                    }

                if (startlastpart == true) {
                    Gaintt.itcome(5);
                    if (Gaintt.getGaintY() >= -400 && Gaintt.getGaintY() <= -370 || Gaintt.getGaintY() >= -350 && Gaintt.getGaintY() <= -320 || Gaintt.getGaintY() >= -300 && Gaintt.getGaintY() <= -270) {
                        textSize(100);
                        fill(250, 16, 7);
                        text("Danger", 280, 500);
                    }
                    pushMatrix();
                    Gaintt.DrawGaint();
                    popMatrix();

                    image(BlackHearts, -30, 200);
                    noStroke();
                    fill(32);
                    textSize(40);
                    textAlign(LEFT);
                    text(":" + BlackHeartt, 83, 280);
                }
                //---------------------------------score
                noStroke();
                fill(0);
                textSize(40);
                textAlign(LEFT);
                text("Score : " + score, 15, 100);
                //----------------------------------heart
                noStroke();
                image(Hearts, 10, 110);
                textAlign(LEFT);
                fill(32);
                text(": " + Heart, 83, 174);
                //-------------------------------------

//-----------------------------------------------------------------------spaceship3
                if (boolspaceship2 == true) {
                    if (startlastpart != true) {
                        pushMatrix();
                        fill(4, 140, 34);
                        text("3500 :", 680, 150);
                        scale(0.99F);
                        translate(700, 40, 20);
                        shape(rocketicon3);
                        popMatrix();
                    }
                    // ******************************-- buttle
                    noStroke();
                    if (buttlespaceship2.size() != 0) {
                        ThrowingButtle(buttlespaceship2);
                        checkCrushedtoGaint(buttlespaceship2);
                    }
                    //******************************--spaceship show
                    space2.Drawrocket();
                    //******************************--buttle
                    if (mousePressed && checkisPressed == false) {
                        buttlespaceship2.add(new Buttle(23, 7, 240, space2.getSpaceshipX() + 102, 732, 20));
                        buttlespaceship2.add(new Buttle(23, 7, 240, space2.getSpaceshipX() + 153, 732, 20));
                        buttlespaceship2.add(new Buttle(23, 7, 240, space2.getSpaceshipX() + 102, 702, 20));
                        buttlespaceship2.add(new Buttle(23, 7, 240, space2.getSpaceshipX() + 153, 702, 20));
                        playerButtle.play(0);
                    }
                    checkisPressed = false;
                    //******************************--crushed
                    if (startlastpart == false) {
                        checkLost = space2.checkCrushed(space2.getSpaceshipX(), space2.getSpaceshipY());
                        checkheart = space2.checkcrushedHeart(space2.getSpaceshipX(), space2.getSpaceshipY());
                        if (checkheart == false) {
                            Heart += 1;
                        }
                        if (meteorites.size() == 0 && buttlespaceship2.size() == 0) {
                            startlastpart = true;
                            player.close();
                            Music = true;
                        }
                    } else
                        checkLost = space2.checkCrushedOFGaint(space2.getSpaceshipX(), space2.getSpaceshipY());


                }
                //------------------------------------------------------------------------spaceship1

                if (boolspaceship1 == true) {
                    if (startlastpart != true) {
                        pushMatrix();
                        fill(3, 41, 77);
                        text("2000 :", 660, 160);
                        translate(810, 170, 0);
                        shape(rocketicon2);
                        popMatrix();
                    }
                    //******************************--crushed buttle
                    noStroke();

                    if (buttlespaceship1.size() != 0) {
                        ThrowingButtle(buttlespaceship1);
                        checkCrushedtoGaint(buttlespaceship1);

                    }
                    //******************************--spaceship show
                    space.Drawrocket();

                    //******************************--buttle
                    if (mousePressed && checkisPressed == false) {
                        buttlespaceship1.add(new Buttle(105, 2, 64, space.getSpaceshipX() + 100, 730, 20));
                        buttlespaceship1.add(new Buttle(105, 2, 64, space.getSpaceshipX() + 153, 730, 20));
                        playerButtle.play(0);
                    }
                    checkisPressed = false;
                    //******************************--crushed
                    if (startlastpart == false) {
                        checkLost = space.checkCrushed(space.getSpaceshipX(), space.getSpaceshipY());
                        checkheart = space.checkcrushedHeart(space.getSpaceshipX(), space.getSpaceshipY());
                        if (checkheart == false) {
                            Heart += 1;
                        }
                        if (checklastmateorite == true) {
                            startlastpart = true;
                            return;
                        }
                        if (meteorites.size() == 0 && buttlespaceship1.size() == 0) {
                            startlastpart = true;
                            player.close();
                            Music = true;
                        }
                    } else
                        checkLost = space.checkCrushedOfGaint(space.getSpaceshipX(), space.getSpaceshipY());

                }
                //------------------------------------------------------------------------------spaceship3
                if (boolspaceship3 == true) {

                    //******************************--crushed buttle
                    noStroke();

                    if (buttlespaceship3.size() != 0) {
                        ThrowingButtle(buttlespaceship3);
                        checkCrushedtoGaint(buttlespaceship3);
                    }
                    //******************************--spaceship show
                    space3.Drawrocket();

                    //******************************--buttle
                    if (mousePressed && checkisPressed == false) {
                        buttlespaceship1.add(new Buttle(105, 2, 64, space.getSpaceshipX() + 100, 730, 20));
                        buttlespaceship3.add(new Buttle(250, 16, 7, space3.getSpaceshipX() + 151, 732, 20));
                        buttlespaceship3.add(new Buttle(250, 16, 7, space3.getSpaceshipX() + 105, 732, 20));
                        buttlespaceship3.add(new Buttle(250, 16, 7, space3.getSpaceshipX() + 164, 702, 20));
                        buttlespaceship3.add(new Buttle(250, 16, 7, space3.getSpaceshipX() + 93, 702, 20));
                        buttlespaceship3.add(new Buttle(250, 16, 7, space3.getSpaceshipX() + 175, 672, 20));
                        buttlespaceship3.add(new Buttle(250, 16, 7, space3.getSpaceshipX() + 83, 672, 20));
                        playerButtle.play(0);
                    }
                    checkisPressed = false;
                    //******************************--crushed
                    if (startlastpart == false) {
                        checkLost = space3.checkCrushed(space3.getSpaceshipX(), space3.getSpaceshipY());
                        checkheart = space3.checkcrushedHeart(space3.getSpaceshipX(), space3.getSpaceshipY());
                        if (checkheart == false) {
                            Heart += 1;
                        }
                        if (meteorites.size() == 0 && buttlespaceship3.size() == 0) {
                            startlastpart = true;
                            player.close();
                            Music = true;
                        }
                    } else
                        checkLost = space3.checkCrushedOfGaint(space3.getSpaceshipX(), space3.getSpaceshipY());


                }

//------------------------------------------------------------------------
            }
            if (checkLost == false) {
                if (Heart > 0) {
                    Heart--;
                    checkLost = true;
                }
            }

        }
    }

    public void showmenu() {
        fill(240, 232, 7);
        circle(870, 15, 185);
        textSize(40);
        fill(0);
        textAlign(RIGHT - 30);
        text("Menu ", 795, 50);
        if (mouseX >= 795 && mouseX <= 905) {
            if (mouseY >= 17 && mouseY <= 50) {
                fill(11, 8, 189);
                text("Menu ", 795, 50);
                if (mousePressed) {
                    noStroke();
                    checkisPressed = true;
                    checkOpenmenu = true;
                }
            }
        }

    }

    public void Openmenu() {
        player.pause();
        playerGaint.pause();
        playerButtle.pause();
        checkstart = false;
        background(backgroundstop);
        textSize(55);
        fill(240, 232, 7);
        text("Restart", 100, 600);
        if (mouseX >= 100 && mouseX <= 290) {
            if (mouseY >= 560 && mouseY <= 600) {
                fill(7, 240, 224);
                text("Restart", 100, 600);
                if (mousePressed) {
                    checkisPressed = true;
                    checkLost = true;
                    Music = false;
                    boolspaceship1 = true;
                    boolspaceship2 = false;
                    boolspaceship3 = false;
                    checkheart = true;
                    checkwin = true;
                    checklastmateorite = false;
                    startlastpart = false;
                    checkismenu = false;
                    checkOpenmenu = false;
                    score = 0;
                    Heart = 1;
                    BlackHeartt = 5000;
                    meteorites.clear();
                    heart.clear();
                    crushed.clear();
                    buttlespaceship1.clear();
                    buttlespaceship2.clear();
                    buttlespaceship3.clear();
                    setup();
                    player.play();
                    checkstart = true;
                }
            }
        }

        textSize(50);
        fill(240, 232, 7);
        stroke(240, 232, 7);
        text("Resume", 600, 600);
        if (mouseX >= 600 && mouseX <= 785) {
            if (mouseY >= 560 && mouseY <= 600) {
                fill(7, 240, 224);
                text("Resume", 600, 600);
                if (mousePressed) {
                    checkisPressed = true;
                    checkOpenmenu = false;
                    checkstart = true;
                    if (startlastpart == true) {
                        playerGaint.play();
                    } else
                        player.play();
                }
            }
        }

        textSize(50);
        fill(240, 232, 7);
        stroke(240, 232, 7);
        text("Exist ", 400, 800);
        if (mouseX >= 400 && mouseX <= 520) {
            if (mouseY >= 760 && mouseY <= 800) {
                fill(7, 240, 224);
                text("Exist ", 400, 800);
                if (mousePressed) {
                    exit();
                }
            }
        }
    }

    public void startGame() {
        background(backgroundstart);
        textSize(40);
        fill(240, 232, 7);
        text("Start Game ", 15, 457);
        if (mouseX >= 15 && mouseX <= 230) {
            if (mouseY >= 427 && mouseY <= 457) {
                fill(7, 240, 224);
                text("Start Game ", 15, 457);
                if (mousePressed) {
                    checkisPressed = true;
                    checkismenu = false;
                    checkstart = true;
                    boolspaceship1 = true;
                    player.play();
                }
            }
        }

        textSize(40);
        fill(240, 232, 7);
        stroke(7, 240, 224);
        text("Exist ", 700, 463);
        if (mouseX >= 700 && mouseX <= 800) {
            if (mouseY >= 433 && mouseY <= 463) {
                fill(7, 240, 224);
                text("Exist ", 700, 463);
                if (mousePressed) {
                    exit();
                }
            }
        }

        textSize(50);
        fill(240, 232, 7);
        text("Help ", 400, 960);
        if (mouseX >= 400 && mouseX <= 510) {
            if (mouseY >= 920 && mouseY <= 960) {
                fill(7, 240, 224);
                text("Help ", 400, 960);
                if (mousePressed) {
                    checkismenu = false;
                    helpmenu();
                }
            }
        }
    }

    public void menuGameOver() {
        player.close();
        playerGaint.close();
        playerButtle.close();
        background(backgroundgameover);

        textSize(40);
        fill(245, 147, 34);
        text("Your Score: " + score, 300, 800);
        noStroke();
        textSize(50);
        fill(240, 232, 7);
        stroke(240, 232, 7);
        text("Restart", 350, 870);
        if (mouseX >= 350 && mouseX <= 530) {
            if (mouseY >= 830 && mouseY <= 870) {
                fill(7, 240, 224);
                text("Restart", 350, 870);
                if (mousePressed) {
                    checkisPressed = true;
                    checkLost = true;
                    Music = false;
                    boolspaceship1 = true;
                    boolspaceship2 = false;
                    boolspaceship3 = false;
                    checkheart = true;
                    checkwin = true;
                    checklastmateorite = false;
                    startlastpart = false;
                    checkismenu = false;
                    checkOpenmenu = false;
                    score = 0;
                    Heart = 1;
                    BlackHeartt = 5000;
                    meteorites.clear();
                    heart.clear();
                    crushed.clear();
                    buttlespaceship1.clear();
                    buttlespaceship2.clear();
                    buttlespaceship3.clear();
                    setup();
                    player.play();
                    checkstart = true;
                }
            }
        }
        noStroke();
        textSize(50);
        fill(240, 232, 7);
        text("Exist ", 375, 930);
        if (mouseX >= 375 && mouseX <= 485) {
            if (mouseY >= 890 && mouseY <= 930) {
                fill(7, 240, 224);
                text("Exist ", 375, 930);
                if (mousePressed) {
                    exit();
                }
            }
        }
    }

    public void menuWin() {
        background(backgroundWin);
        push();
        textSize(40);
        fill(245, 147, 34);
        text("Your Score: " + score, 280, 800);

        textSize(50);
        fill(240, 232, 7);
        stroke(240, 232, 7);
        text("Restart", 350, 860);
        if (mouseX >= 350 && mouseX <= 520) {
            if (mouseY >= 820 && mouseY <= 860) {
                fill(7, 240, 224);
                text("Restart", 350, 860);
                if (mousePressed) {
                    checkisPressed = true;
                    checkLost = true;
                    Music = false;
                    boolspaceship1 = true;
                    boolspaceship2 = false;
                    boolspaceship3 = false;
                    checkheart = true;
                    checkwin = true;
                    checklastmateorite = false;
                    startlastpart = false;
                    checkismenu = false;
                    checkOpenmenu = false;
                    score = 0;
                    Heart = 1;
                    BlackHeartt = 5000;
                    meteorites.clear();
                    heart.clear();
                    crushed.clear();
                    buttlespaceship1.clear();
                    buttlespaceship2.clear();
                    buttlespaceship3.clear();
                    setup();
                    player.play();
                    checkstart = true;
                }
            }
        }

        textSize(50);
        fill(240, 232, 7);
        stroke(240, 232, 7);
        text("Exit", 380, 920);
        if (mouseX >= 380 && mouseX <= 470) {
            if (mouseY >= 880 && mouseY <= 920) {
                fill(7, 240, 224);
                text("Exit", 380, 920);
                if (mousePressed) {
                    exit();
                }
            }
        }
        pop();
    }

    public void helpmenu() {
        background(backgroundHelp);
        textSize(50);
        fill(172, 250, 5);
        text("Help Menu ", 310, 280);

        textSize(23);
        fill(240);
        text("Brick Invaders is\nan interesting and exciting game\nin which you have to defend your ship" +
                "\nagainst meteorites that come down from above.", 190, 380);
        textSize(25);
        fill(247, 5, 25);
        text("Mouse Move : ", 195, 570);
        textSize(23);
        fill(3, 156, 115);
        text("Move left or right", 370, 570);
        textSize(25);
        fill(247, 5, 25);
        text("Mouse Key    : ", 195, 630);
        textSize(23);
        fill(3, 156, 115);
        text("shoot a bullet", 370, 630);
        textSize(25);
        fill(247, 5, 25);
        text("m Or M         : ", 195, 690);
        textSize(23);
        fill(3, 156, 115);
        text("Open/Close Menu ", 370, 690);
        textSize(25);
        fill(172, 250, 5);
        text("Enter b/B to Back Start Menu", 300, 750);
    }

    @Override
    public void keyPressed() {
        if (keyCode == 'm' || keyCode == 'M') {
            if (checkOpenmenu == false && checkismenu == false) {
                checkisPressed = true;
                checkOpenmenu = true;
            } else if (checkOpenmenu == true && checkismenu == false) {
                checkisPressed = true;
                checkOpenmenu = false;
                checkstart = true;
                if (startlastpart == true) {
                    playerGaint.play();
                } else
                    player.play();
            }
        }
        if (keyCode == 'b' || keyCode == 'B') {
            if (checkismenu == false && boolspaceship2 == false && boolspaceship3 == false && boolspaceship1 == false) {
                checkismenu = true;
                startGame();
            }
        }
    }

    public void showHeart(Heartt h) {
        image(Hearts, h.getX(), h.getY());
    }

    public void speedYHeart(Heartt h) {
        h.speed(h.getSpeed());

    }

    public void ThrowingButtle(ArrayList<Buttle> buttle) {
        boolean checkcrushed = true;
        boolean check = false;
        ArrayList<Buttle> replace = buttle;
        Iterator<Buttle> iterator = replace.iterator();
        while (iterator.hasNext()) {
            Buttle b = iterator.next();
            fill(b.getColorR(), b.getColorG(), b.getColorB());
            circle(b.getButtleX(), b.getButtleY(), b.getRedius());
            b.setButtleY(b.getButtleY() - 5);
            if (startlastpart == false) {
                checkcrushed = checkCrushedButtle(b);
            } else
                checkcrushed = checkCrushedButtleOfGaint(b);

            if (!checkcrushed) {
                iterator.remove();
            } else if (b.getButtleY() < -5) {
                iterator.remove();
            }
        }
        buttle = replace;

    }

    public void checkCrushedtoGaint(ArrayList<Buttle> buttles) {
        Iterator<Buttle> iterator = buttles.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            Buttle b = iterator.next();
            if (b.getButtleY() <= Gaintt.getGaintY() + 150 && b.getButtleX() > Gaintt.getGaintX() - 90 && b.getButtleX() < Gaintt.getGaintX() + 330) {
                iterator.remove();
                i++;
                if (boolspaceship1 == true && i == 10) {
                    BlackHeartt -= 1;
                    if (BlackHeartt <= 0) {
                        checkwintoGaint = true;
                    }
                    i = 0;
                }
                if (boolspaceship2 == true) {
                    BlackHeartt -= 2;
                    if (BlackHeartt <= 0) {
                        checkwintoGaint = true;
                    }
                    i = 0;
                }
                if (boolspaceship3 == true) {
                    BlackHeartt -= 3;
                    if (BlackHeartt <= 0) {
                        checkwintoGaint = true;
                    }
                    i = 0;
                }

            } else if (b.getButtleY() < -20) {
                iterator.remove();
            }
        }
    }

    public boolean checkCrushedButtle(Buttle buttle) {
        boolean check = true;
        ArrayList<Meteorite> replace = new ArrayList<>(meteorites);
        Iterator<Meteorite> iterator = replace.iterator();
        while (iterator.hasNext()) {
            Meteorite meteo = iterator.next();
            if (meteo.getMeteoriteY() + 63 > -70) {
                int distance = (int) dist(buttle.getButtleX(), buttle.getButtleY(), meteo.getMeteoriteX() + 67, meteo.getMeteoriteY() + 63);
                if (distance <= 70) {
                    if (boolspaceship1 == true)
                        meteo.setHeart(meteo.getHeart() - 10);
                    if (boolspaceship2 == true)
                        meteo.setHeart(meteo.getHeart() - 20);
                    if (boolspaceship3 == true)
                        meteo.setHeart(meteo.getHeart() - 30);

                    check = false;
                }
            }
            if (meteo.getHeart() <= 0) {
                iterator.remove();
                score += 50;
            }
        }
        meteorites = replace;
        if (check == true)
            return true;
        else
            return false;
    }

    public boolean checkCrushedButtleOfGaint(Buttle buttle) {
        boolean check = true;
        ArrayList<Meteorite> replace = new ArrayList<>(meteorites);
        Iterator<Meteorite> iterator = replace.iterator();
        while (iterator.hasNext()) {
            Meteorite meteo = iterator.next();
            if (meteo.getMeteoriteY() + 50 > -70) {
                int distance = (int) dist(buttle.getButtleX(), buttle.getButtleY(), meteo.getMeteoriteX() + 53, meteo.getMeteoriteY() + 50);
                if (distance <= 40) {
                    if (boolspaceship1 == true)
                        meteo.setHeart(meteo.getHeart() - 1);
                    if (boolspaceship2 == true)
                        meteo.setHeart(meteo.getHeart() - 2);
                    if (boolspaceship3 == true)
                        meteo.setHeart(meteo.getHeart() - 5);

                    check = false;
                }
            }
            if (meteo.getHeart() <= 0) {
                iterator.remove();
            }
        }
        meteorites = replace;
        if (check == true)
            return true;
        else
            return false;
    }


    public void speedY(Meteorite m) {
        m.setMeteoriteY((int) (m.getMeteoriteY() + m.getSpeed()));
        if (startlastpart == false) {
            if (m.getMeteoriteY() + 63 >= 690)
                crushed.add(m);
        }
        if (startlastpart == true) {
            if (m.getMeteoriteY() + 50 >= 690)
                crushed.add(m);
        }
    }

    public void showmeteorite(Meteorite m) {
        if (startlastpart == false) {
            image(meteorite, m.getMeteoriteX(), m.getMeteoriteY());
            textSize(20);
            textAlign(CENTER);
            fill(0);
            text(m.getHeart() + "%", m.getMeteoriteX() + 145, m.getMeteoriteY() + 80);
            textSize(15);
            fill(0);
            text("Score:" + m.getScore(), m.getMeteoriteX() + 145, m.getMeteoriteY() + 95);
        } else {
            image(Buttlemeteorite, m.getMeteoriteX(), m.getMeteoriteY());
            textSize(20);
            textAlign(CENTER);
            fill(0);
            text(m.getHeart() + "%", m.getMeteoriteX() + 120, m.getMeteoriteY() + 80);

        }

    }

}