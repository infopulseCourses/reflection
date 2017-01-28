package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Stepan
 */
public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException, InstantiationException {
        Class c = A.class;
     /*   Class c1 = Class.forName("reflection.A");
        A a = new A();
        Class c2 = a.getClass();*/

       /* Field[] fields = c.getDeclaredFields();
        Arrays.stream(fields).forEach(field -> System.out.println(field.getName()));*/
   //    A pa = new A();

    //   Field f = c.getDeclaredField("field");
     //  f.setAccessible(true);

     //  f.set(pa, 5);

     //  System.out.println(Modifier.isPrivate(f.getModifiers()));
    //   System.out.println(f.getType());
     //  System.out.println(pa.getField());

      /* Method[] methods = c.getDeclaredMethods();
       Arrays.stream(methods).forEach(method -> System.out.println(method.getName()));
*/
       Class[] paramTypes = {int.class};
       Method m = c.getDeclaredMethod("setField",paramTypes);
       MyAnnotation annotation = m.getAnnotation(MyAnnotation.class);
       System.out.println(annotation.value());
       A a = new A();
       m.invoke(a, 100);
       System.out.println(a.getField());
       System.out.println(m.getReturnType());

     /*  A pa = (A)c.newInstance();
       System.out.println(pa.getField());

       Constructor constructor = c.getDeclaredConstructor(int.class);
       A pa1 = (A)constructor.newInstance(200);
       System.out.println(pa1.getField());

       MyAnnotation annotation = (MyAnnotation) c.getAnnotation(MyAnnotation.class);
       System.out.println(annotation.value());*/
    }
}
