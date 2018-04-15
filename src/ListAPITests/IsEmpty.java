package ListAPITests;
import java.util.Arrays;
import java.util.List;

public class IsEmpty extends ListTesting {
    private final static String METHOD_NAME = ".isEmpty()";

    public static void emptyList_isEmptyShouldReturnTrue(List list){
        // given

        // when
        boolean actualIsEmpty = list.isEmpty();
        // then
        assertEquals(list.getClass() + METHOD_NAME, true, actualIsEmpty);
    }

    public static void list1234_isEmptyShouldReturnFalse(List list){
        // given
        list.addAll(Arrays.asList(1,2,3,4,500));
        // when
        boolean isEmptyShouldRetFalse = list.isEmpty();
        // then
        assertEquals(list.getClass() + METHOD_NAME, false, isEmptyShouldRetFalse);
    }
}
