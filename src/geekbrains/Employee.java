package geekbrains;

public class Employee {


    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Должность: " + position);
        System.out.println("Зарплата: " + salary);
        System.out.println("Телефон: " + phone);
        System.out.println("Почта: " + email);
    }
    public int getAge() {
        return age;
    }
}
