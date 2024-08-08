package collection.set;

public class StringHashMain {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        char charA = 'A';
        char charB = 'B';
        System.out.println((int)charA);
        System.out.println((int)charB);

        System.out.println("hashCode(\"A\") = " + hashCode("AVVVVV"));

        int hashCodeA = hashCode("A");
        int hashIndex = hashIndex(hashCode("A"));

        System.out.println("hashIndex(A) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(A) = " + hashIndex(hashCode("AB")));
        System.out.println("hashIndex(A) = " + hashIndex(hashCode("B")));

        System.out.println("getHashSet(\"test\") = " + getHashSet("test"));
    }

    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += c;
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }

    static int getHashSet(Object val) {
        return val.hashCode();
    }
}
