package lection2;

import java.util.*;

/**
 * Возьмите список, удалите все элементы, которые не соответствуют определенным критериям.
 * Распространенный сценарий:
 * <p>
 * 1.вам дан список значений
 * 2.у вас есть критерии для этих значений
 * 3.вернуть список только с теми значениями из исходного списка, которые соответствуют этим критериям
 * <p>
 * Задачи:
 * <p>
 * 1. У вас есть список значений String и вы должны вернуть список со всеми значениями String определенной длины
 * 2. У вас есть список значений int и вы должны вернуть список, содержащий только нечетные числа
 * 3. У вас есть список значений String, и вы должны вернуть список этих значений без каких-либо дубликатов.
 * 4. Удалить слишком короткие слова (меньше 4 букв)
 */

public class Template2 {

    public static List<String> task1(List<String> list, int size) {
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == size) {
                newList.add(list.get(i));
            }
        }
        return newList;
    }

    public static List<Integer> task2(ArrayList<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 1) {
                newList.add(list.get(i));
            }
        }
        return newList;
    }

    public static List task3(List<String> list) {
        List<String> newList = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }

        for (String elt : set) {
            newList.add(elt);
        }
        return newList;
    }

    public static List<String> task4(List<String> list) {
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > 4) {
                newList.add(list.get(i));
            }
        }
        return newList;
    }
}
