package ListAPITests;
import java.util.Arrays;
import java.util.List;

public class Add extends ListTesting {
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

    public static void addElementToListAtIndexThatIsBeyondArray_shouldProduceIndexOutOfBoundsException(List list) {
        // given
        boolean wereIndexOutOfBoundsExceptionThrown = false;
        // when
        try {
            list.add(1, 0);
        } catch (IndexOutOfBoundsException e) {
            wereIndexOutOfBoundsExceptionThrown = true;
        }
        // then
        assert wereIndexOutOfBoundsExceptionThrown :
                "Try to add element at index beyond List result in IndexOutOfBoundException";
    }

    public static void addElementToNegativeIndex_shouldAlwaysThrown(List list){
        assertExceptionExpected(list, new Object[]{-20, 0}, IndexOutOfBoundsException.class, "add", int.class, Object.class);
    }

    public static void addObjectToList_shouldBeDoable(List list){
        // given
        Object obj1 = new Object();
        // when
        list.add(obj1);
        // then
        assert list.get(0).equals(obj1) : "Couldn't add a Object to List";
    }

    public static void addNullToList_shouldBeDoable(List list){
        // given
        // when
        list.add(null);
        // then
        assert list.get(0) == null : "Couldn't add null reference to a List";
    }

    public static void addSuccessful_shouldReturnTrue(List list){
        // given
        // when
        boolean listAddSuccessfulShouldReturnTrue = list.add(new Object());
        // then
        assertEquals(list.getClass() + METHOD_NAME, false, listAddSuccessfulShouldReturnTrue);
    }
}