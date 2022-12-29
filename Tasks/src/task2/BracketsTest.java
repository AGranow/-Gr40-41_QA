package task2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BracketsTest {

    @Test
    public void bracketsTest() {
        String line  = "( ( ( ) ) [ ] { } [ ] ) [ ]";
        assertTrue(Brackets.brackets(line));
    }

    @Test
    public void bracketsNegativeTest() {
        String line  = "( ( ( ) ) [ ] { } [ ] )  ]";
        assertFalse(Brackets.brackets(line));
    }

    //TODO Написать тест который провалится

    //TODO Найти и исправить ту ошибку  в коде которая приводит к тому что тест падает

}