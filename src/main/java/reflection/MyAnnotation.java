package reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Stepan
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    int value();
}
