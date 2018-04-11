import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_Size extends ArrayListTesting {
    private final static String METHOD_NAME = ".size()";

    static void fiveToFive() {
        // given
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        // when
        int expected = 5;
        int actual = arrayList.size();
        // then
        assertTrue(METHOD_NAME, expected, actual);
    }

    static void zeroToZero() {
        // given
        List arrayList = new ArrayList<>();
        // when
        int expected = 0;
        int actual = arrayList.size();
        // then
        assertTrue(METHOD_NAME, expected, actual);
    }
}
