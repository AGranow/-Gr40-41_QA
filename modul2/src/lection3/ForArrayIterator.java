package lection3;

import java.util.Iterator;

public class ForArrayIterator implements Iterator<Integer> {

    Integer [] array;
    int currantIndex;

    public ForArrayIterator(Integer[] array) {
        this.array = array;
    }

    /**
     * boolean hasNext() - отвечает на вопрос, есть ли ещё что перебирать.
     * @return
     */
    @Override
    public boolean hasNext() {
        return currantIndex < array.length-1;    // 1 ,3 , 6 , 8
    }

    /**
     * Typ next() - возвращает нам текущий элемент и содержит в себе функционал
     *  по переходу к следующему элементу
     * @return
     */
    @Override
    public Integer next() {
        Integer res = array[currantIndex];
        currantIndex++;
        return res;
//      return array[currantIndex++];   можно написать одной строкой вместо трёх
    }
}
