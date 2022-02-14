package lessons;

import com.robocode.Features;
import processing.core.PApplet;

public class lesson8 extends PApplet {

    Features feature = new Features(this);

    // Метод для налаштувань програми
    public void settings() {
        size(500, 500);
    }


    // Метод для одноразового малювання при запуску програми
    public void setup() {
        background(255);
    }

    // Медод для малювання в циклі
    public void draw() {
        feature.drawGrid(10, 50); //Малювання сітки
    }


    // Метод який запускає програму
    // Генерується автоматично
    public static void main(String[] args) {
        /*
        У випадку ручного налаштування:
        В параметрах потрібно вказати пакет і назву поточного класу який запускається
        Наприклад:
        PApplet.main("пакет.НазваКласу");
        */
        PApplet.main("lessons.lesson8");
    }

}
