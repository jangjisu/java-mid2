package generic.ex5;

public class EraserBox<T> {
    public boolean instanceCheck (Character param) {
        //return param instanceof T;
        return false;
    }

    //runtime =
    public boolean runtimeInstanceCheck (Object param) {
        return param instanceof Object;
    }

    public T create() {
        //return new T();
        return null;
    }

    //runtime =
    public Object runtimeCreate() {
        return new Object();
    }
}
