package lection3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ForArrayIteratorTest {

    /**
     * Iterator<Typ> iterableCollection = iterableCollection.iterator
     * <p>
     * while(iterableCollection.hasNext()){
     * <Typ> elt = iterableCollection.next
     * логика
     * }
     */

    @Test
    public void forArrayIteratorTest() {
        Integer[] array = new Integer[]{5, 8, 1, 9, 4};
        List afterIteration = new ArrayList();
        List expected = Arrays.asList(5, 8, 1, 9, 4);

        ForArrayIterator forArrayIterator = new ForArrayIterator(array);
        while (forArrayIterator.hasNext()) {
            int num = forArrayIterator.next();
            afterIteration.add(num);
        }
        assertEquals(expected, afterIteration);
    }
}