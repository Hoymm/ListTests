import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ListTest.runTestsForListImplementation(ListType.arrayList);
        ListTest.runTestsForListImplementation(ListType.linkedList);
    }
}
