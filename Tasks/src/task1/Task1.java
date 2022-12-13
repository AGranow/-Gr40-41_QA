package task1;

import java.util.Arrays;

/**
 * Дан массив целых цифр и ещё одно целое число. Удалите все вхождения этого
 * числа из массива (пропусков быть не должно).
 */
public class Task1 {

    public static int[] deleteElementFromArray(int[] array, int number) {
        //   4 , 5 , 7,  -3 ,  7 ,  8           7
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++;
            }else {
                array[i - count] = array[i];
                //   4 , 5 , 7,  -3 ,  7 ,  8           7
            }
        }
        return Arrays.copyOf(array, array.length - count);
    }
}
