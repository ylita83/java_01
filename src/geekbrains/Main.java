package geekbrains;

public class Main {


    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Фитюлькин Петр Игоревич", "Главный по тарелочкам", "fitya@mail.ru", "88005553535", 45000, 45);
        employees[1] = new Employee("Жопликов Илья Ильич", "Мамин симпатяга", "handsome@mail.ru", "4242", 30000, 30);
        employees[2] = new Employee("Морская Наталья Пехотовна", "Водитель", "startuem@mail.ru", "49995553434", 25000, 55);
        employees[3] = new Employee("Хренова Гадя Петрович", "Уже умеет", "gadya@mail.ru", "89991234567",  35000, 27);
        employees[4] = new Employee("Хлыщ Жора Вазгенович", "Продавец", "vazgen_is_my_dad@mail.ru", "84959263487", 50000, 32);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40){
                employees[i].printInfo();
                System.out.println();
            }
        }
    }
}


