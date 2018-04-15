package ListAPITests;
import java.util.Arrays;
import java.util.List;

public class Size extends ListTesting {
    // TODO refactor names
    private final static String METHOD_NAME = ".size()";

    public static void fiveToFive(List list) {
        // given
        list.addAll(Arrays.asList(1,2,3,4,5));
        // when
        int expected = 5;
        int actual = list.size();
        // then
        assertEquals(list.getClass() + METHOD_NAME, expected, actual);
    }

    public static void zeroToZero(List list) {
        // given

        // when
        int expected = 0;
        int actual = list.size();
        // then
        assertEquals(list.getClass() + METHOD_NAME, expected, actual);
    }
}
