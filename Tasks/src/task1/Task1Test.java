package task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Test {

    @Test
    public  void deleteElementFromArrayTest(){
        assertArrayEquals(new int []{4, 5,-3,8} , Task1.deleteElementFromArray(new int[]{4, 5, 7, -3, 7, 8}, 7));
    }

    @Test
    public  void positiveTest(){
        assertEquals(1, 1);;
    }

    @Test
    public  void negativTest(){
        assertNotEquals(1, 2);;
    }
}