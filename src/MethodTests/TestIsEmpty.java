package MethodTests;
import java.util.Arrays;
import java.util.List;

public class TestIsEmpty extends ListTesting {
    // TODO refactor names
    private final static String METHOD_NAME = ".isEmpty()";

    public static void testEmptyArray(List list){
        // given

        // when
        boolean expected = true;
        boolean actual = list.isEmpty();
        // then
        assertEquals(list.getClass() + METHOD_NAME, expected, actual);
    }

    public static void testNonEmptyArray(List list){
        // given
        list.addAll(Arrays.asList(1,2,3,4,500));
        // when
        boolean expected = false;
        boolean actual = list.isEmpty();
        // then
        assertEquals(list.getClass() + METHOD_NAME, expected, actual);
    }
}
