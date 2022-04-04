

### Language:  [Ukrainian](#About_UA) / [English](#About_EN)



# About_UA

Потребує Java 8

За допомогою цього проекту можна працювати із програмою `Processing` в `Intellij IDEA`.
По своїй суті, це просто шаблон із певними фішками для більш зручної роботи та навчання із Processing.


## Особливості роботи в Intellij

###  1) ООП
Для роботи з класами потрібно робити агрегацію, тобто передавати в конструктор контекст (об'єкт) класу `Main`, який наслідується від `PApplet` та запускається як головний.

Приклад агрегації

> MainColor.java -- Клас, який запускається.
```java
public class MainColor extends PApplet {  
	  
	Gradient blue = new Gradient(this, color(255,255,255), color(0,255,0)); 
...
```

> Gradient.java -- Клас, який зноходиться в цьому самому пакеті.
```java
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
```

### 2) Змінна типу `color`
Як ви могли помітити із прикладу вище, там не використовується змінна типу `color`.
Все просто, її неможливо створити. використовуйте `int`. Наприклад `int red = color(255,0,0);` 

### 3) Поки невідомі особливості з якими ви можете зіштовхнутись
Якщо у процесі використання щось пішло не так, можете повідомити мене про це. 
Допоможу із вирішенням, та опишу рішення тут :)
## Features
В класі Features реалізований метод drawGrid(step, absoluteStep), який малює сітку на  весь розмір полотна.

```java
     /**
     * Метод який дозволяє малювати сітку
     * @param step звичайний крок розмітки, наприклад 10px
     * @param absoluteStep крок виділеної розмітки, наприклад 50px
     */

drawGrid(int step, int absoluteStep);
```
![Grid](https://github.com/swefd/Processing_Intellij/blob/9d302ffb81e6080cf4f6f73860b461546c4bbb25/img/Grid.png?raw=true)





## Installation

Завантажити, та відкрити як проект.
Також можна просто клонувати прямо з GitHub.

## FAQ

### 1) Як створити файл Processing?

![How to create](https://github.com/swefd/Processing_Intellij/blob/9d302ffb81e6080cf4f6f73860b461546c4bbb25/img/HowToCreate.png?raw=true)

### 2) Немає файлу в списку
Переконайтесь, що у теці `.idea/FileTemplates` присутній файл `Processing.java` та в налаштуваннях Intellij він відображається.

![Processing template file](https://github.com/swefd/Processing_Intellij/blob/9d302ffb81e6080cf4f6f73860b461546c4bbb25/img/FileTemplate.png?raw=true)

### ​Швидкі рішення
* Перезавантажити Intellij.
* Додати шаблон вручну скопіювавши код із файлу `.idea/FileTemplates/Processing.java`.


### 3) Як створити змінну типу `color`?
 Це неможливо, використовуйте `int`. Наприклад `int red = color(255,0,0);` 


### --------------------------------------------------------------------------------------------------


# About_EN
Java 8 is required!

With this project you can work with the program `Processing` in` Intellij IDEA`. In essence, it's just a template with certain features for more convenient work and learning with Processing.


## Specifics of work in Intellij

###  1) OOP
To work with classes, you need to do aggregation, ie pass the context (object) of the `Main` class to the constructor, which is inherited from `PApplet` and started as the main one.

Example of aggregation

> MainColor.java --   Class that starts.
```java
public class MainColor extends PApplet {  
	  
	Gradient blue = new Gradient(this, color(255,255,255), color(0,255,0)); 
...
```

> Gradient.java --   A class that is in the same package.
```java
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
```


### 2) Variable of type `color`
As you can see from the example above, it does not use a variable of type `color`.
It's simple, it is impossible to create. use `int`. For example `int red = color (255,0,0);`


### 3) The specifics you may encounter are still unknown
If something went wrong during the use process, you can let me know.
I will help with the solution, and I will describe the solution here :)

## Features
The Features class implements the `drawGrid(step, absoluteStep)` method, which draws a grid for the entire size of the canvas.

```java
     /**
     * Метод який дозволяє малювати сітку
     * @param step звичайний крок розмітки, наприклад 10px
     * @param absoluteStep крок виділеної розмітки, наприклад 50px
     */

drawGrid(int step, int absoluteStep);
```
![Grid](https://github.com/swefd/Processing_Intellij/blob/9d302ffb81e6080cf4f6f73860b461546c4bbb25/img/Grid.png?raw=true)





## Installation

Download and open as a project. You can also just clone directly from GitHub.

## FAQ

###   1) How to create a Processing file?

![How to create](https://github.com/swefd/Processing_Intellij/blob/9d302ffb81e6080cf4f6f73860b461546c4bbb25/img/HowToCreate.png?raw=true)


### 2) There is no file in the list 
Make sure that the `.idea / FileTemplates` folder contains the `Processing.java` file and that it is displayed in the Intellij settings.

![Processing template file](https://github.com/swefd/Processing_Intellij/blob/9d302ffb81e6080cf4f6f73860b461546c4bbb25/img/FileTemplate.png?raw=true)


  
### Quick solutions 
* Reboot Intellij. 
* Add a template manually by copying the code from the `.idea / FileTemplates / Processing.java` file. 

### 3) How to create a variable of type `color`? 
This is not possible, use `int`. For example `int red = color (255,0,0);`
