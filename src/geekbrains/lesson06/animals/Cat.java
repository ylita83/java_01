package geekbrains.lesson06.animals;

public class Cat extends Animal {
    public Cat(String name, String colour, int runLimit, int jumpLimit) {
        super(name, colour, runLimit, 0, jumpLimit);
    }

    @Override
    public void swim(int length) {
        System.out.println("Котик не хочет плавать :(");

    }
}
