package ListAPITests;


import java.util.Arrays;
import java.util.List;

public class SubList extends ListTesting{
    private final static String METHOD_NAME = "subList()";

    public static void list0123456_subList3and6_shouldGiveList345(List list) {
        // given
        list.addAll(Arrays.asList(0,1,2,3,4,5,6));
        List expectedList345 = Arrays.asList(3,4,5);
        // when
        list = list.subList(3,6);
        // then
        assertEquals(list.getClass() + METHOD_NAME, expectedList345, list);
    }

    public static void list0123_sublistFrom0To20_shouldThrowIndexOutOfBoundsException (List list){
        // given
        // when
        // then
        assertExceptionExpected(list, IndexOutOfBoundsException.class, "subList", new Object[]{0,20}, int.class, int.class);
    }
}