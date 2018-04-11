import java.util.ArrayList;
import java.util.Arrays;

class ArrayList_Size extends ArrayListTesting {
    static void fiveToFive() {
        // given
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        // when
        int expected = 5;
        int actual = arrayList.size();
        // then
        assert expected == actual : message(".size()", expected, actual);
    }

    static void zeroToZero() {
        // given
        ArrayList arrayList = new ArrayList<>();
        // when
        int expected = 0;
        int actual = arrayList.size();
        // then
        assert expected == actual : message(".size()", expected, actual);
    }
}
