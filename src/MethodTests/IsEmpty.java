package MethodTests;
import java.util.Arrays;
import java.util.List;

public class IsEmpty extends ArrayListTesting {
    private final static String METHOD_NAME = ".isEmpty()";

    public static void testEmptyArray(List list){
        // given

        // when
        boolean expected = false;
        boolean actual = list.isEmpty();
        // then
        assertTrue(list.getClass() + METHOD_NAME, expected, actual);
    }

    public static void testNonEmptyArray(List list){
        // given
        list.addAll(Arrays.asList(1,2,3,4,500));
        // when
        boolean expected = false;
        boolean actual = list.isEmpty();
        // then
        assertTrue(list.getClass() + METHOD_NAME, expected, actual);
    }
}
