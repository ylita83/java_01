package geekbrains.lesson06.animals;

public class Animal {
    String name;
    String colour;
    int runLimit;
    int swimLimit;
    int jumpLimit;

    public Animal(String name, String colour, int runLimit, int swimLimit, int jumpLimit) {
        this.name = name;
        this.colour = colour;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
    }

    public  void run (int length){
        if (length<=runLimit){
            System.out.println(name + " великолепно пробежал дистанцию!");
        } else {
            System.out.println ("Увы, но "+ name + " не смог пробежать так много :(");
        }
    }  public  void swim (int length){
        if (length<=swimLimit){
            System.out.println(name + " великолепно проплыл дистанцию!");
        } else {
            System.out.println ("Увы, но "+ name + " не смог проплыть так много :(");
        }
    }  public  void jump (int height){
        if (height<=jumpLimit){
            System.out.println(name + " совершил умопомрачительный прыжок!");
        } else {
            System.out.println ("Увы, но "+ name + " не смог прыгнуть так высоко :(");
        }
    }


}

