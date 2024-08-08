package collection.set;

public class SelfHashSetV2Main {
    public static void main(String[] args) {
        SelfHashSetV2<String> set = new SelfHashSetV2<>(10);

        set.add("PRNCE");
        set.add("FRT");
        set.add("PRNCE");
        set.add("AFW");
        set.add("ASSS");
        set.add("VV");
        set.add("9");
        System.out.println(set);

        //검색
        String searchValue = "9";
        boolean contains = set.contains(searchValue);
        System.out.println("set.(contains" + searchValue +") = " + contains);

        boolean remove = set.remove(searchValue);
        System.out.println("remove = " + remove);
        System.out.println(set);
    }
}
