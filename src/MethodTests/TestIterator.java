package MethodTests;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestIterator extends ListTesting{
    // TODO refactor names
    private final static String METHOD_NAME = ".iterator()";

    public static void testIfEmptyHasNoNextItem(List list) {
        // given
        Iterator iterator = list.iterator();

        // when
        boolean expected = false;
        boolean actual = iterator.hasNext();
        // then
        assertEquals(list.getClass() + METHOD_NAME, expected, actual);
    }

    public static void testIteratorWithSomeElements(List list) {
        // given
        int[] tab = {1, 2, 3, 4, 5};
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        Iterator iterator = list.iterator();
        for (int aTab : tab) {
            // when
            int expected = (Integer) iterator.next();
            int actual = aTab;
            // then
            assertEquals(list.getClass() + METHOD_NAME, expected, actual);
        }
        assert !iterator.hasNext() : list.getClass() + METHOD_NAME + " iterator should setted on last item.";
    }

}
