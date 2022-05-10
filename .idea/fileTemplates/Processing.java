#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")

import com.robocode.Features;
import processing.core.PApplet;

public class ${NAME} extends PApplet{

    Features feature = new Features(this);

    // Метод для налаштувань програми
    public void settings(){
        size(500, 500); // Розмір вікна
    }


    // Метод для одноразового малювання при запуску програми
    public void setup(){
        background(255);

        // Пиши свій код тут :)


    }

    // Медод для малювання в циклі
    public void draw(){
        feature.drawGrid(10, 50); //Малювання сітки

        // Пиши свій код тут :)



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
        PApplet.main("${PACKAGE_NAME}.${NAME}");
    }

}
