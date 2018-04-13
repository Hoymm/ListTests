import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        testArrayAndLinkedLists();
    }

    private static void testArrayAndLinkedLists() {
        Method[] listTestMethods = ListTest.class.getDeclaredMethods();
        for (Method curMethod : listTestMethods)
            if (isPublicStaticNotMain(curMethod)) {
                testMethodInSepThread(curMethod, ListType.arrayList);
                testMethodInSepThread(curMethod, ListType.linkedList);
            }
    }

    private static boolean isPublicStaticNotMain(Method methodName) {
        return !methodName.getName().equalsIgnoreCase("main") &&
            Modifier.isPublic(methodName.getModifiers()) &&
                Modifier.isStatic(methodName.getModifiers());
    }

    private static void testMethodInSepThread(Method method, ListType listType) {
        new Thread(() -> {
            try {
                method.invoke(null, listType);
            } catch (IllegalAccessException e) {
                //TODO handle it
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                //TODO handle it
                e.printStackTrace();
            }
        }).start();
    }
}
