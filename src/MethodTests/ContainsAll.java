package MethodTests;
import java.util.Arrays;
import java.util.List;

public class ContainsAll {

    public static void list12_checkIfContainsList13(List list123) {
        // given
        list123.add(1);
        list123.add(2);
        list123.add(3);
        List list13 = Arrays.asList(1, 3);
        // when
        boolean list13IsSubsetOfList123 = list123.containsAll(list13);
        // then
        assert  list13IsSubsetOfList123 : "List " + list13 + " is a subset of " + list123 +
                ", but method list123.containsAll(list12) returns false";
    }
}
