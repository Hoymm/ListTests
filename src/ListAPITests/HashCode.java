package ListAPITests;


import java.util.Arrays;
import java.util.List;

public class HashCode extends ListTesting{
    private final static String METHOD_NAME = ".hashCode()";

    public static void emptyListHashCode_shouldReturn1(List list) {
        assert list.hashCode() == 1 : "Empty list hashcode due to specification should return 1, your list.hashCode is equal to " + list.hashCode();
    }

    public static void hashCodeCalculationResultShouldBe(List list) {
        // given
        list = Arrays.asList(1,2,3,4,5);
        // when
        int hashCodeReturned = list.hashCode();
        int hashCodeExpected = calculateHashCodeDueToAPIPattern(list);
        // then
        assert hashCodeExpected == hashCodeReturned : "Empty list hashcode due to specification should return 1, your list.hashCode is equal to " + list.hashCode();
    }

    private static int calculateHashCodeDueToAPIPattern(List list) {
        int hashCode = 1;
        for (Object e : list)
            hashCode = 31 * hashCode + (e == null ? 0 : e.hashCode());
        return hashCode;
    }
}