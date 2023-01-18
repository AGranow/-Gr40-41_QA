package lection1.multidimensionalArrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];

        //  4 6,5,2,8
        //  0 1 2 3 4

        array = new int[8];
        array[2] = 7;
        array = new int[]{3, 6, 8};

        int[][] array2 = new int[3][3];

        // 0  0  0
        // 0  0  0
        // 0  0  0

        array2[0][0] = 1;
        array2[1][1] = 4;
        array2[2][2] = 9;
        // 1  0  0
        // 0  4  0
        // 0  0  9

        System.out.println(array2[2][2]);   // 9
        System.out.println(array2[1][1]);   // 4
        System.out.println(array2[0][0]);   // 1
        System.out.println(array2[2][1]);   // 0
        System.out.println("---------------------------------------------------");

        int[][] array3 = {{1, 2, 3, 4}, {5, 6, 7, 8}};

        // 1 2 3 4
        // 5 6 7 8

        System.out.println(array3.length);  // 2
        System.out.println("---------------------------------------------------");

        int[][] array4 = new int[5][5];

        // заполнение многомерного массива
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                array4[i][j] = i;
            }
        }

        // вывод многомерного массива в консоль
        for (int i = 0; i < array4.length; i++) {
            System.out.println();
            for (int j = 0; j < array4[i].length; j++) {
                System.out.print(array4[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("---------------------------------------------------");

        // Вывод массива при помощи вспомогательного класса
        System.out.println(Arrays.deepToString(array3));
        System.out.println("---------------------------------------------------");


// Вывод при помощи Strim
        Arrays.stream(array)
                .forEach(arr -> System.out.println(Arrays.deepToString(array3)));
    }
}