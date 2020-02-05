package geekbrains;

public class Main {

    public static void main(String[] args) {
//    Создать переменные всех пройденных типов данных, и инициализировать их значения;

        byte b = -7;
        short sh = 100;
        int i = 42;
        long l = 1000000L;
        float fl = 3.14f;
        double d = 123.4567;
        char ch = 'Q';
        boolean bool = true;
    }
//    Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;

    public static float calculate (int a, int b, int c, int d){
        return  a * (b + (c / d));
    }

//	Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;

    public static boolean inRange (int a, int b){
        int sum = a + b;
        if(sum >= 10 && sum <= 20){
            return true;
        } else {
            return false;
        }
    }
//	Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.

    public static void isPositive (int a){
        if (a < 0){
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

//	Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;

    public static boolean isNegative (int a){
        return a<0;
    }
//	Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;

    public static void helloName (String name){
        System.out.println("Привет, " + name);
    }
//	Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static void leapYear (int year){
        if ( year % 4 == 0 && (year % 100 != 0 || year % 400 == 0 )){
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}

