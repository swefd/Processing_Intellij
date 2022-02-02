package lessonColor;

import processing.core.PApplet;

public class Gradient {
    private final PApplet context;
    private final int c1;
    private final int c2;

    public Gradient(PApplet context, int c1, int c2) {
        this.context = context;
        this.c1 = c1;
        this.c2 = c2;
    }

    public void display(){
        context.noFill();
        for (int i = 0; i < context.height; i++) {
            float inter =  PApplet.map(i, 0, context.height, 0, 1);
            int color = context.lerpColor(c1, c2, inter);
            context.stroke(color);
            context.line(0, i, context.width, i);
        }
    }

}
