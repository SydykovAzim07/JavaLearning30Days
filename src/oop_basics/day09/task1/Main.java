package oop_basics.day09.task1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog("Rex");
        Animal cat = new Cat("Whiskers");
        Animal [] animals  = new Animal[3];
        animals[0] = dog;
        animals[1] = cat;
        animals[2] = animal;
       for (int i = 0; i < animals.length; i++) {
        animals[i].makeSound();
        if (animals[i] instanceof Dog) {
            Dog d = (Dog) animals[i];
            d.fetch();
        }
        if (animals[i] instanceof Cat) {
            Cat c = (Cat) animals[i];
            c.scratch();
        }
       }

    }
}
