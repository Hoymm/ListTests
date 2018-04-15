package ListAPITests;


import java.util.Arrays;
import java.util.List;

public class ListIterator extends ListTesting{
    private final static String METHOD_NAME = ".listIterator()";

    public static void testListIterator(List list) {
        list.addAll(Arrays.asList(1,2,3,4,5));
        // given
        java.util.ListIterator listIterator = list.listIterator();
        // when

        // then
        assertEquals(list.getClass() + METHOD_NAME, false ,listIterator.hasPrevious());
        assertEquals(list.getClass() + METHOD_NAME, 1,listIterator.next());
        assertEquals(list.getClass() + METHOD_NAME, 2,listIterator.next());
        assertEquals(list.getClass() + METHOD_NAME, 2,listIterator.previous());
        assertEquals(list.getClass() + METHOD_NAME, 2,listIterator.next());
        assertEquals(list.getClass() + METHOD_NAME, 3,listIterator.next());
        assertEquals(list.getClass() + METHOD_NAME, 4,listIterator.next());
        assertEquals(list.getClass() + METHOD_NAME, 5,listIterator.next());
        assertEquals(list.getClass() + METHOD_NAME, false ,listIterator.hasNext());
    }
}
