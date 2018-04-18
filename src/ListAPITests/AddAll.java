package ListAPITests;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class AddAll extends ListTesting{
    private final static String METHOD_NAME = ".addAll()";

    public static void addFewElementsToListUsingAddAllMethod_shouldBeDoable(List actualList) {
        // given
        actualList.add(0);
        List expectedList0123 = Arrays.asList(0,1,2,3);
        // when
        actualList.addAll(Arrays.asList(1,2,3));
        // then
        assertListsEqual(actualList.getClass() + METHOD_NAME, expectedList0123, actualList);
    }

    public static void addFewElementsToListAtSpecifiedIndex_shouldBeDoable(List actualList) {
        // given
        actualList.add(0);
        actualList.add(4);
        List expectedList01234 = Arrays.asList(0,1,2,3,4);
        // when
        actualList.addAll(1, Arrays.asList(1,2,3));
        // then
        assertListsEqual(actualList.getClass() + METHOD_NAME, expectedList01234, actualList);
    }

    public static void addFewElementsAtPositiveIndexThatIsOutOfBounds_shouldResultInIndexOutOfBoundsException(List list) {
        assertExceptionExpected(list, new Object[]{10, Arrays.asList(1,2,3)}
                , IndexOutOfBoundsException.class, "addAll", int.class, Collection.class);


    }

    public static void addFewElementsAtNegativeIndex_shouldResultInIndexOutOfBoundsException(List list) {
        assertExceptionExpected(list, new Object[]{-1, Arrays.asList(1, 2, 3)}
        , IndexOutOfBoundsException.class, "addAll", int.class, Collection.class);
    }
}