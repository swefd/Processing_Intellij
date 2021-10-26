package lessons;

import com.robocode.Features;
import processing.core.PApplet;

public class Lesson7 extends PApplet {

    Features feature = new Features(this);

    //Метод для налаштувань програми
    public void settings(){
        size(500, 500);
    }


    //Метод для одноразового малювання при запуску програми
    public void setup(){


        background(255);
    }

    //Медод для малювання в циклі
    public void draw(){
        feature.drawGrid(10, 50);


    }


    //Метод який запускає програму
    public static void main(String[] args) {
        /*
        В параметрах потрібно вказати пакет і назву поточного класу який запускається
        Наприклад:
        PApplet.main("пакет.НазваКласу");
        */

        PApplet.main("lessons.Lesson7");

    }




}
