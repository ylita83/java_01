package geekbrains;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Прверка 1 задания
//        int[] arrTaskOne = {0, 0, 1, 0, 0, 1, 0};
//        invertOneAndZero(arrTaskOne);
//        System.out.println(Arrays.toString(arrTaskOne));

//        Проверка 2 задания
//        int [] arr = new int [8];
//        fillArrayByStep(arr, 0, 3);
//        System.out.println(Arrays.toString(arr));

//        Проверка 3 задания
//        int [] arrThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        arrConditionMultiplication(arrThree, 6,2);
//        System.out.println(Arrays.toString(arrThree));

//        Проверка 4 задания
//        int[][] table = new int[5][5];
//        fillDiagonals(table);
//        printArr(table);

//       Проверка 5 задания
//        int[] taskFiveArr = {0, 1, 2, 3, 4, 5};
//        printArraysMinMax(taskFiveArr);
    }

    //   1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void invertOneAndZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    //    2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void fillArrayByStep(int[] arr, int a, int b) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
            a += b;
        }
    }

    //    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void arrConditionMultiplication(int[] arr, int condition, int multiplier) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < condition) {
                arr[i] = arr[i] * multiplier;
            }

        }

    }

    //    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
    // цикла(-ов) заполнить его диагональные элементы единицами;
    public static void fillDiagonals(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || i + j == arr.length - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }

        }

    }

    //    5. Задать одномерный массив и найти в нем минимальный и максимальный элементы
    public static void printArraysMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                continue;
            }
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Максимальный элемент массива: " + max);
    }

    //Распечатать массив
    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

}

