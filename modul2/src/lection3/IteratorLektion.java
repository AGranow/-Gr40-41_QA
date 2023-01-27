package lection3;

import java.util.ArrayList;
import java.util.List;

public class IteratorLektion {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList();

        list.add(6);
        list.add(4);
        list.add(3);
        list.add(1);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // foreach
        for (Integer num : list) {
            System.out.print(num + " ");
        }

        // Iterable - интерфейс, который содержит в себе один метод iterator().
        // Этот метод возвращает Iterator
        // Iterator - это оже интерфейс, который содержит в себе два метода.

        // boolean hasNext() - отвечает на вопрос, есть ли ещё что перебирать.

        // Typ next() - возвращает нам текущий элемент и содержит в себе функционал
        // по переходу к следующему элементу

        // foreach
        for (Integer num : list) {
            System.out.print(num + " ");
        }

        /**
         Iterator<Typ> iterator = iterableCollection.iterator

         while(iterable.hasNext()){
         <Typ> elt = iterator.next
         </логика>
         }
         */
    }
}
