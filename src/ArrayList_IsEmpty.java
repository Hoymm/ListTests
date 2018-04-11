import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_IsEmpty extends ArrayListTesting {

    static void testEmptyArray(){
        // given
        ArrayList<Integer> arrayList = new ArrayList<>(100);
        // when
        boolean expected = true;
        boolean actual = arrayList.isEmpty();
        // then
        assert expected == actual : message(".testEmptyArray()", expected, actual);
    }

    static void testNonEmptyArray(){
        // given
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,500));
        // when
        boolean expected = false;
        boolean actual = arrayList.isEmpty();
        // then
        assert expected == actual : message(".testEmptyArray()", expected, actual);
    }
}
