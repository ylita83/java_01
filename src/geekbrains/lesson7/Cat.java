package geekbrains.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;

    }

    public void eat(Plate p) {
        if ((p.getFood() - appetite)>0) {
            p.decreaseFood(appetite);
            satiety = true;
            System.out.println(name + " поел");
        } else {
            System.out.println(name + " не поел, еды слишком мало");
        }
    }

    public String getName() {
        return name;
    }

    public boolean getSatiety() {
        return satiety;

    }
}

