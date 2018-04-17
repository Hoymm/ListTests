package ListAPITests;

import java.util.Arrays;
import java.util.List;

public class Add extends ListTesting {

    // TODO handle two add methods
    private final static String METHOD_NAME = ".add()";

    public static void addElementToListAtSpecifiedIndex_shouldBeDoable(List actualList) {
        // given
        actualList.addAll(Arrays.asList(1, 2, 3));
        List expectedList1023 = Arrays.asList(1, 0, 2, 3);
        // when
        actualList.add(1, 0);
        // then
        assertEquals(actualList.getClass() + METHOD_NAME, expectedList1023, actualList);
    }

    public static void addElementToListAtIndexThatIsBeyondArray_shouldProduceIndexOutOfBoundsException(List actualList1023) {
        // given
        boolean isIndexOutOfBoundsExceptionThrown = false;
        // when
        try {
            actualList1023.add(1, 0);
        } catch (IndexOutOfBoundsException e) {
            isIndexOutOfBoundsExceptionThrown = true;
        }
        // then
        assert isIndexOutOfBoundsExceptionThrown :
                "Add element at 1 index, when List is empty should result in IndexOutOfBoundException";
    }
}