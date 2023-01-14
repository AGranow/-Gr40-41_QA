package lection1;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[5];
        //
        //  4 6,5,2,8
        //  0 1 2 3 4
        array = new int[8];
        array[2] = 7;
        array = new int[]{3,6,8};

        int [][] array2 = new int[3][3];
        //
        // 1  0  0
        // 0  4  0
        // 0  0  0

        array2 [0][0] = 1;
        array2 [1][1] = 4;
        array2 [2][2] = 9;

        System.out.println(array2[2][2]);
        System.out.println(array2[1][1]);
        System.out.println(array2[0][0]);
        System.out.println(array2[2][1]);

        int [][] array3 = {{1,2,3,4},{5,6,7,8}};
        //
        // 1 2 3 4     1     234
        // 5 6 7 8     5     678
        //
        System.out.println(array3.length);

        int[][] array4 = new int[5][5];

        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                array4 [i][j]= i;
                System.out.println(array4[i][j]);
            }
        }



        for (int i = 0; i < array4.length; i++) {
            System.out.println();
            for (int j = 0; j < array4[i].length; j++) {
                System.out.print(array4[i][j]);
            }
        }

        int[][] array5 = new int[5][5];
        int number = 0;
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                array5[i][j] = number;
            }
        }
        System.out.println();
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < array5.length; i++) {
            System.out.println();
            for (int j = 0; j < array5[i].length; j++) {
                System.out.print(array5[i][j] + " ");
            }
        }



    }

    public void sortArray(int[] array){

    }
}