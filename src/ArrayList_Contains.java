import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Contains extends ArrayListTesting {
    private final static String METHOD_NAME = ".contains()";

    static void checkIfEmptyListCointainsNull() {
        // given
        ArrayList <Integer> arrayList = new ArrayList<>();
        // when
        boolean expected = arrayList.contains(null);
        boolean actual = false;
        // then
        assertTrue(METHOD_NAME, expected, actual);
    }

    static void checkIfICanFindAStringInObjectsArray(){
        // given
        ArrayList arrayList = new ArrayList<>(Arrays.asList(1,2,3, new Object(), "heheh"));
        // when
        boolean expected = true;
        boolean actual = arrayList.contains("heheh");
        // then
        assertTrue(METHOD_NAME, expected, actual);
    }

    static void checkIfICannotFindAStringInObjectsArray(){
        // given
        ArrayList arrayList = new ArrayList<>(Arrays.asList(1,2,3, new Object(), "heheh"));
        // when
        boolean expected = false;
        boolean actual = arrayList.contains("NIE MA");
        // then
        assertTrue(METHOD_NAME, expected, actual);
    }
}
