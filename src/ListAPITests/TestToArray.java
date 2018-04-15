package ListAPITests;

import java.util.Arrays;
import java.util.List;

public class TestToArray extends ListTesting {
    // TODO refactor names
    private final static String METHOD_NAME = ".toArray()";

    public static void equalsEmptyArray(List list) {
        // given
        // when
        boolean expected = true;
        boolean actual = Arrays.equals(list.toArray(), new Object []{});
        // then
        assertEquals(list.getClass() + METHOD_NAME, expected, actual);
    }

    public static void equalsExampleArrays(List list) {
        // given
        list.addAll(Arrays.asList(1,2,3,4));
        // when
        boolean expected = Arrays.equals(new Object[]{1,2,3,4}, list.toArray());
        boolean actual = true;
        // then
        assertEquals(list.getClass() + METHOD_NAME, expected, actual);
    }
}
