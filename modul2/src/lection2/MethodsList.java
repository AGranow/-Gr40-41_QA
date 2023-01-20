package lection2;

import java.util.ArrayList;
import java.util.List;

public class MethodsList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList();
// TODO Прокомментировать код
        list.add(5); // 5
        list.add(7);  // 5,7
        list.add(9);  //5/7/9
        list.add(0);  // 5,7,9,0

        list.add(1,3);// 5,3,7,9,0
        list.get(2);
        list.remove(2);
        list.clear();
        list.indexOf(9);
        list.isEmpty();
        list.contains(3);
        list.removeAll(list);
    }
    class Person{

    }

}
