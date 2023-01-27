package lection2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Task1Test {

    @Test
    public void testTask1A() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("NOT");
        List<String> newList = new ArrayList<>();
        newList.add("HELLO");
        newList.add("NOT");

        assertEquals(newList, Task1.task1A(list));
    }

    @Test
    public void testTask1B() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("NOT");
        List<String> newList = new ArrayList<>();
        newList.add("hello");
        newList.add("not");

        assertEquals(newList, Task1.task1B(list));
    }

    @Test
    public void testTask2() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(9);
        list.add(2);
        List<Integer> newList = new ArrayList<>();
        newList.add(10);
        newList.add(6);
        newList.add(14);
        newList.add(18);
        newList.add(4);

        assertEquals(newList, Task1.task2(list));
    }

    @Test
    public void testTask3() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("NOT");
        list.add("Sorry");
        list.add("HeLp");
        List<Integer> newList = new ArrayList<>();
        newList.add(5);
        newList.add(3);
        newList.add(5);
        newList.add(4);

        assertEquals(newList, Task1.task3(list));
    }

}