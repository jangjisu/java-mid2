package generic.test.ex2;

public class Pair<T1, T2> {
    private T1 key;
    private T2 value;
    public void setFirst(T1 key) {
        this.key = key;
    }

    public void setSecond(T2 value) {
        this.value = value;
    }

    public T1 getFirst() {
        return key;
    }

    public T2 getSecond() {
        return value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
