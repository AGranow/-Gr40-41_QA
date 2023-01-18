package lection1.multidimensionalArrays;

/**
 *  Создать многомерный массив 4 x 6. Заполнить его символом #
 *  и вывести в консоль.
 *
 *  ######
 *  ######
 *  ######
 *  ######
 */

public class Task1 {
    public static void main(String[] args) {
        String[][] array6 = new String[4][6];
        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                array6[i][j] = "#";
            }
        }
        for (int i = 0; i < array6.length; i++) {
            System.out.println();
            for (int j = 0; j < array6[i].length; j++) {
                System.out.print(array6[i][j] + " ");
            }
        }
    }
}
