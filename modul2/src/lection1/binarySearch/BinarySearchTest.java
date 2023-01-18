package lection1.binarySearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void testBinarySearch(){
        int [] array = {4,6,8,10,16,20};
        assertEquals(3,BinarySearch.binarySearch(array,10, 0,array.length));
    }

//    @Test
//    public void testIdenticalElements(){
//        int [] array = {5,5,5,5,5,5,5};
//        assertEquals(2,BinarySearch.binarySearch(array,5, 0,array.length));
//    }

//    @Test
//    public void testIdenticalElements1(){
//        int [] array = {4,6,8,10,16,16,20};;
//        assertEquals(5,BinarySearch.binarySearch(array,16, 0,array.length));
//    }

    @Test
    public void testBinarySearchNegative(){
        int [] array = {4,6,8,10,16,20};
        assertNotEquals(5,BinarySearch.binarySearch(array,10, 0,array.length));
    }

    @Test
    public void testBinarySearch1(){
        int [] array = {};
        assertEquals(-1,BinarySearch.binarySearch(array,10, 0,array.length));
    }
}