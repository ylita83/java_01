package geekbrains;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это
//        число. При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное,
//                или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз?
//        1 – да / 0 – нет»(1 – повторить, 0 – нет).
        do {
            guessGame(10, 3);
            System.out.println("Повторить игру еще раз?\n 1 – да / 0 – нет");

        } while (sc.nextInt() ==1);


    }
    public static void guessGame(int bound, int count) {
        Random rand = new Random();
        int number = rand.nextInt(bound);
        System.out.println("Угадайте число от 0 до " + (bound - 1) + ". Попыток: " + count);
        int userNumber;
        do {
            userNumber = sc.nextInt();
            if (userNumber == number) {
                System.out.println("Вы выиграли! Правильный ответ: " + number);
                break;
            } else if (userNumber < number){
                count--;
                System.out.println("Cишком мало. Осталось попыток: " + count);

            } else {
                count--;
                System.out.println("Cишком много. Осталось попыток: " + count);

            }
        } while ( count != 0);

    }
}


