package ListAPITests;
import java.util.Arrays;
import java.util.List;

public class Size extends ListTesting {
    private final static String METHOD_NAME = ".size()";

    public static void list12345_sizeOfShouldReturnInValueOf5(List list) {
        // given
        list.addAll(Arrays.asList(1,2,3,4,5));
        // when
        int list12345_sizeShouldBe5 = list.size();
        // then
        assertEquals(list.getClass() + METHOD_NAME, 5, list12345_sizeShouldBe5);
    }

    public static void emptyList_size_shouldReturnValueOf0(List list) {
        // given
        // when
        int sizeOfEmptyListShouldBeZero = list.size();
        // then
        assertEquals(list.getClass() + METHOD_NAME, 0, sizeOfEmptyListShouldBeZero);
    }
}
