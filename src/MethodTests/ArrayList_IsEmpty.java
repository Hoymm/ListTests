package MethodTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_IsEmpty extends ArrayListTesting {
    private final static String METHOD_NAME = ".isEmpty()";

    public static void testEmptyArray(){
        // given
        List<Integer> arrayList = new ArrayList<>(100);
        // when
        boolean expected = true;
        boolean actual = arrayList.isEmpty();
        // then
        ArrayListTesting.assertTrue(METHOD_NAME, expected, actual);
    }

    public static void testNonEmptyArray(){
        // given
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,500));
        // when
        boolean expected = false;
        boolean actual = arrayList.isEmpty();
        // then
        ArrayListTesting.assertTrue(METHOD_NAME, expected, actual);
    }
}
