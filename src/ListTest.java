import ListAPITests.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.logging.Logger;

class ListTest {
    private static final Logger LOGGER = Logger.getLogger(IndexOf.class.getName());
    final static private Class [] classesToTest = new Class[]{
            Size.class
            , IsEmpty.class
            , Contains.class
            , Iterator.class
            , ToArray.class
            , ContainsAll.class
            , AddAll.class
            , RemoveAll.class
            , RetainAll.class
            , ReplaceAll.class
            , Sort.class
            , Clear.class
            , RemoveAll.class
            , Equals.class
            , HashCode.class
            , Get.class
            , Set.class
            , Add.class
            , Remove.class
            , IndexOf.class
            , LastIndexOf.class
            , ListIterator.class
            , SubList.class
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
            String info = listType + " "
                    + Colors.PURPLE + testMethod.getDeclaringClass().getName() + " "
                    + Colors.CYAN + testMethod.getName();
            try {
                testMethod.invoke(null, listType.createNewObj());
                System.out.println(Colors.GREEN + " Test Passed " + Colors.RESET + info);
            } catch (IllegalAccessException | InvocationTargetException e) {
                System.out.println(Colors.RED + " Test Failed " + Colors.RESET + info);
                e.printStackTrace();
            }

        }).start();
    }
}
