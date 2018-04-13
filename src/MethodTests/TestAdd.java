package MethodTests;

import java.util.Arrays;
import java.util.List;

public class TestAdd extends ListTesting{
    private final static String METHOD_NAME = ".add()";

    public static void addNull_GetNullAllowed(List list){
        // given
        list.add(null);
        // when
        Boolean nullExpected = (Boolean) list.get(0);
        // then
        assert nullExpected == null;
    }

    public static void listAferAdd1_equalToListWith1(List list){
        // given
        list.add(1);
        // when
        boolean expected = Arrays.equals(new Object[]{1}, list.toArray());
        boolean actual = true;
        // then
        assertEquals(list.getClass() + METHOD_NAME, expected, actual);
    }
}
