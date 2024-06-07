package generic.test.ex3.unit;

public class UnitPrinter {
    public static <T extends BioUnit> void printv1(Shuttle<T> shuttle) {
        T out = shuttle.out();
        System.out.println("이름 = " + out.getName() + ",hp = " + out.getHp());
    }

    public static void printv2(Shuttle<? extends BioUnit> shuttle) {
        BioUnit unit = shuttle.out();
        System.out.println("이름 = " + unit.getName() + ",hp = " + unit.getHp());
    }
}
