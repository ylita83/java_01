package geekbrains.lesson06;

import geekbrains.lesson06.animals.Cat;
import geekbrains.lesson06.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat ("Kot", "black", 300, 2);
        Dog dog = new Dog("Pes", "white", 600, 100, 1);

        cat.swim(5);
        cat.jump(5);
        dog.jump(1);
    }
}
