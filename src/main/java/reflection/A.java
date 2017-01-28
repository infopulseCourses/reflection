package reflection;

/**
 * @author Stepan
 */

public class A {

    private int field;

    public A() {

    }

    public A(int field) {
        this.field = field;
    }

    public int getField() {
        return field;
    }

    @MyAnnotation(value=100)
    public void setField(int field) {
        this.field = field;
    }

}
