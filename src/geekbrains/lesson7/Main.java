package geekbrains.lesson7;

public class Main {
    public static void main(String[] args) {

        Plate plate = new Plate(35);
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Barsik", 10);
        cats[1] = new Cat("Murzik", 10);
        cats[2] = new Cat("Belyash", 10);
        cats[3] = new Cat("Tom", 10);
        cats[4] = new Cat("Felix", 10);

        eat(cats,plate);
        satietyInfo(cats);

    }

    public static void eat (Cat[] cats, Plate plate){
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
    }
    public static void satietyInfo (Cat[] cats){
        for (int i = 0; i < cats.length ; i++) {
            if (cats[i].getSatiety()){
                System.out.println(cats[i].getName()+" сыт");
            } else {
                System.out.println(cats[i].getName() + " голоден");
            }


        }
    }






}
