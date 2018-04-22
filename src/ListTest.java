import ListAPITests.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import ListAPITests.Colors;
import java.util.logging.Logger;

import static ListAPITests.Colors.*;

class ListTest {
    private static final Logger LOGGER = Logger.getLogger(IndexOf.class.getName());
    final static private Class [] classesToTest = new Class[]{
            Size.class,
            IsEmpty.class,
            Contains.class,
            Iterator.class,
            ToArray.class,
            ContainsAll.class,
            AddAll.class,
            RemoveAll.class,
            RetainAll.class,
            ReplaceAll.class,
            Sort.class,
            Clear.class,
            RemoveAll.class,
            Equals.class,
            HashCode.class,
            Get.class,
            Set.class,
            Add.class,
            Remove.class,
            IndexOf.class,
            LastIndexOf.class,
            ListIterator.class,
            SubList.class
    };

    static void runTestsForListImplementation(ListType listType) {
        for (Class classToTest : classesToTest)
            runAllMethodsFromClass(classToTest, listType);
    }

    private static void runAllMethodsFromClass(Class classToTest, ListType listType) {
        Method [] toTestMethods = classToTest.getDeclaredMethods();
        runAllMethods(toTestMethods, listType);
    }

    private static void runAllMethods(Method[] toTestMethods, ListType listType) {
        for (Method testMethod : toTestMethods) {
            if (isPublicStaticNotMain(testMethod))
                testMethodInSepThread(testMethod, listType);
        }
    }

    private static boolean isPublicStaticNotMain(Method methodName) {
        return !methodName.getName().equalsIgnoreCase("main") &&
                Modifier.isPublic(methodName.getModifiers()) &&
                Modifier.isStatic(methodName.getModifiers());
    }

    private static void testMethodInSepThread(Method testMethod, ListType listType) {
        new Thread(() -> {
            long startTime = System.currentTimeMillis();
            StringBuffer info = new StringBuffer();

            try {
                testMethod.invoke(null, listType.createNewObj());
                info.append(Colors.GREEN).append(" Test Passed ").append(Colors.RESET);
            } catch (IllegalAccessException e) {
                LOGGER.warning("Error when trying to invoke method " + testMethod.getName());
            } catch (InvocationTargetException e) {
                info.append(Colors.RED).append(" Test Failed ").append(Colors.RESET);
                e.printStackTrace();
            }
            info.append(String.valueOf(listType)).append(" ")
                    .append(Colors.PURPLE).append(testMethod.getDeclaringClass().getName()).append(" ")
                    .append(CYAN).append(testMethod.getName())
                    .append(Colors.BLACK).append(", Time: ").append(System.currentTimeMillis()-startTime).append("ms.");

            System.out.println(info);

        }).start();
    }
}
