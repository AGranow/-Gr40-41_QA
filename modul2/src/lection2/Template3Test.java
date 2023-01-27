package lection2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Template3Test {

    @Test
    public void testTask1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        String rezString = "HelloHelloHello";
        assertEquals(rezString, Template3.task1(list));
    }
}