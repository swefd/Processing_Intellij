package com.robocode;

import processing.core.PApplet;

public class Features {
    private final PApplet c; //context

    public Features(PApplet context) {
        c = context;
    }

    public void update(){
        c.background(0);
    }

    //Метод який дозволяє малювати сітку
    public void drawGrid(int step, int absoluteStep){
        //int step = 10;
        //int absoluteStep = 50;

        for(int i = 0; i< c.height; i+=step){
            if(i%absoluteStep == 0){
                c.strokeWeight (0.4f);
                c.stroke(0);
                c.fill(0, 100, 250);
                c.text("Y", 0, i);
                c.text(i, 10, i);
            }else{
                c.strokeWeight (0.01f);
                c.stroke(220,200);
            }
            c.line(i,0,i, c.height);
        }

        for(int w = 0; w< c.width; w+=step){
            if(w%absoluteStep == 0){
                c.strokeWeight (.6f);
                c.stroke(0);
                c.fill(500, 0, 0);
                c.text("X", w, 10);
                c.text(w, w+10, 10);
            }else{
                c.strokeWeight (0.01f);
                c.stroke(220,255);
            }
            c.line(0,w, c.width,w);
        }
    }


}
