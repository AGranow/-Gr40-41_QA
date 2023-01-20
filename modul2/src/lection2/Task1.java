package lection2;

import java.util.ArrayList;
import java.util.List;

/**
 * Шаблон №1
 * Возьмите список, измените все элементы в нем на новое значение
 * Распространенный сценарий:
 * <p>
 * 1.вам дан список значений
 * 2.вы должны применить определенную операцию для изменения каждого значения
 * 3.вернуть список со всеми этими измененными значениями
 * <p>
 * Задачи:
 * 1.У вас есть список строковых значений, и вы должны вернуть список со всеми этими строковыми значениями в нижнем регистре (или в верхнем регистре)
 * 2.У вас есть список значений int и вы должны вернуть список, каждое значение которого умножается на 2
 * 3.У вас есть список значений String, и вы должны вернуть список длины каждого из этих значений String.
 */
public class Task1 {

    public static List task1A(ArrayList<String> list) {
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            newList.add(list.get(i).toUpperCase());
        }
        return newList;
    }

    public static List task1B(ArrayList<String> list) {
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            newList.add(list.get(i).toLowerCase());
        }
        return newList;
    }

    public  static List task2(ArrayList<Integer> list){
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            newList.add(list.get(i)* 2);
        }
        return newList;
    }

    public  static List task3(ArrayList<String> list){
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            newList.add(list.get(i).length());
        }
        return newList;
    }
}
