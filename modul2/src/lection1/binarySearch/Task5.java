package lection1.binarySearch;

import java.util.Random;

/**
 *  Написать метод реализующий бинарный поиск. Метод должен выводить в консоль ID
 *  найденного элемента и количество сделанных сравнений. Выяснить какое максимальное
 *  количество сравнений нам необходимо для поиска элемента в массиве состоящим из
 *  миллиона элементов.
 */
public class Task5 {
    //TODO написать код
    //TODO write code
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextDouble());
        System.out.println(random.nextBoolean());

        System.out.println(Math.max(24,245));
        System.out.println(Math.min(24,245));
        System.out.println(Math.random());
      //  System.out.println((int) (Math.random() * ((max - min) + 1)) + min;
        System.out.println((int) (Math.random() * 1_000_000));

    }
}
