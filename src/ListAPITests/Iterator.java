package ListAPITests;

import java.util.Arrays;
import java.util.List;

public class Iterator extends ListTesting{
    private final static String METHOD_NAME = ".iterator()";

    public static void emptyIterator_hasNext_shouldReturnFalse(List list) {
        // given
        java.util.Iterator iterator = list.iterator();

        // when
        boolean emptyIteratorHasNext_False = iterator.hasNext();
        // then
        assertEquals(list.getClass() + METHOD_NAME, false, emptyIteratorHasNext_False);
    }

    public static void compareTable12345_toList12345_usingIterator(List list) {
        // given
        int[] tab = {1, 2, 3, 4, 5};
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        java.util.Iterator iterator = list.iterator();
        for (int aTab : tab) {
            // when
            int expected = (Integer) iterator.next();
            int actual = aTab;
            // then
            assertEquals(list.getClass() + METHOD_NAME, expected, actual);
        }
        assert !iterator.hasNext() : list.getClass() + METHOD_NAME + ". Here iterator should be setted on last item.";
    }

}
