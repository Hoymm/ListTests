package ListAPITests;
import java.util.Arrays;
import java.util.List;

public class Sort extends ListTesting{
    private final static String METHOD_NAME = ".sort()";

    public static void listOfIntegers31254_compareToASubstractB_resultsInList12345(List <Integer> actualListShouldBe12345) {
        // given
        actualListShouldBe12345.addAll(Arrays.asList(3,1,2,5,4));
        List expectedList12345 = Arrays.asList(1,2,3,4,5);
        // when
        actualListShouldBe12345.sort((a, b) -> a - b);
        // then
        assertListsEquals(actualListShouldBe12345.getClass() + METHOD_NAME
                , expectedList12345, actualListShouldBe12345);
    }
}