package oop_basics.day10.task1;

public interface Drawable {
     void draw();
     default void fill(){
         System.out.println("Заполняю фигуру");
     }
     static void info () {
         System.out.println("Это интерфейс для рисования");
     }

}
