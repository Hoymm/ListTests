package ListAPITests;

import java.util.Arrays;
import java.util.List;

public class TestContains extends ListTesting {
    // TODO refactor names
    private final static String METHOD_NAME = ".contains()";

    public static void checkIfEmptyListCointainsNull(List list) {
        // given

        // when
        boolean expected = list.contains(null);
        boolean actual = false;
        // then
        assertEquals(list.getClass() + METHOD_NAME, expected, actual);
    }

    public static void checkIfICanFindAStringInObjectsArray(List list){
        // given
        list.addAll(Arrays.asList(1,2,3, new Object(), "heheh"));
        // when
        boolean expected = true;
        boolean actual = list.contains("heheh");
        // then
        assertEquals(list.getClass() + METHOD_NAME, expected, actual);
    }

    public static void checkIfICannotFindAStringInObjectsArray(List list){
        // given
        list.addAll(Arrays.asList(1,2,3, new Object(), "heheh"));
        // when
        boolean expected = false;
        boolean actual = list.contains("NIE MA");
        // then
        assertEquals(list.getClass() + METHOD_NAME, expected, actual);
    }
}
