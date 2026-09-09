import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Product");
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object obj = constructor.newInstance();
        Method method = clazz.getDeclaredMethod("printlnf");
        method.invoke(obj);
    }
}
