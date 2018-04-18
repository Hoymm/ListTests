package ListAPITests;

import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

abstract class ListTesting {
    // TODO add method assertSortedEquals() (Tomek's tip)

    public static <T> void assertEquals(String comment, T expected, T actual) {
        assert expected.equals(actual) : printMessageShouldBeEquals(comment, expected, actual);
    }

    public static void assertListsEqual(String comment, List expectedList, List actualList) {
        assert areListsEqual(expectedList, actualList) : printMessageShouldBeEquals(comment, expectedList, actualList);
    }

    public static void assertListsDifferent(String comment, List expectedList, List actualList) {
        assert !areListsEqual(expectedList, actualList) : printMessageShouldNotBeEquals(comment, expectedList, actualList);
    }

    // TODO refactor method too many args here
    public static void assertExceptionExpected(List<Integer> list, Object [] args, Class exception, String methodName, Class<?>... methodParamTypes) {
        try {
            Method methodGet = list.getClass().getMethod(methodName, methodParamTypes);
            InvocationTargetException exceptionThrown = null;
            try {
                System.out.println(methodGet.invoke(list, args));
            } catch (IllegalAccessException e) {
                System.out.println("IllegalAccessException!!!!!!!!");
            } catch (InvocationTargetException e) {
                exceptionThrown = e;
            }
            assert exceptionThrown != null && exception == exceptionThrown.getTargetException().getClass() :
                    Colors.CYAN + "List == (" + list + ") " + "list." + methodName + Arrays.asList(args) + Colors.RESET
                            + " should thrown " + Colors.YELLOW + exception.getName() + Colors.RESET;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    private static boolean areListsEqual(List list1, List list2){
        return areListsSameSize(list1, list2) && areListsIdentical(list1, list2);
    }

    private static boolean areListsSameSize(List list1, List list2) {
        return list1.size() == list2.size();
    }

    private static boolean areListsIdentical(List list1, List list2) {
        Iterator iteratorL1 = list1.iterator(), iteratorL2 = list2.iterator();
        while (iteratorL1.hasNext())
            if (iteratorL1.next() != iteratorL2.next())
                return false;
        return true;
    }

    private static <T> String printMessageShouldBeEquals(String comment, T expected, T actual) {
        return printShouldBeSameOrDifferent(comment, expected, actual, true);
    }

    private static <T> String printMessageShouldNotBeEquals(String comment, T expected, T actual) {
        return printShouldBeSameOrDifferent(comment, expected, actual, false);
    }

    private static <T> String printShouldBeSameOrDifferent(String comment, T expected, T actual, boolean shouldBeEqual) {
        return comment + "\n(expected): " + Colors.GREEN + expected + Colors.RESET
                + (shouldBeEqual ? ", should equal " : ", shouldn't equal ")
                + "(actual): " + Colors.BLACK + actual + Colors.RESET;
    }

}
