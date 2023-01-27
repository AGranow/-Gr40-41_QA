package lection2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Template2Test {

    @Test
    public void testTask1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("NOT");
        list.add("Sorry");
        list.add("HeLp");
        List<String> newList = new ArrayList<>();
        newList.add("Hello");
        newList.add("Sorry");

        assertEquals(newList, Template2.task1(list,5));
    }


    @Test
    public void testTask2() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(3);
        list.add(1);
        List<Integer> newList = new ArrayList<>();
        newList.add(5);
        newList.add(3);
        newList.add(1);

        assertEquals(newList, Template2.task2(list));
    }

    @Test
    public void testTask3() {
        String [] lines = {"Hello", "Hello","Buy","Hello","Buy","Hello","Hello","Sorry",};
        List<String> list = Arrays.asList(lines);

        String [] nowLines = {"Hello", "Buy","Sorry",};
        List<String> newList = Arrays.asList(nowLines);

        assertEquals(newList, Template2.task3(list));
    }

    @Test
    public void testTask4() {
        String [] lines = {"Hello", "Hello","Buy","Hello","Buy","Hello","Hello","Sorry"};
        List<String> list = Arrays.asList(lines);

        String [] nowLines = {"Hello", "Hello","Hello","Hello","Hello","Sorry",};
        List<String> newList = Arrays.asList(nowLines);

        assertEquals(newList, Template2.task4(list));
    }


}
