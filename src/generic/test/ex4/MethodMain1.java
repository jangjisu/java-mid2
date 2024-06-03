package generic.test.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        System.out.println("명시작 타입 인자 전달");
        Integer integer = GenericMethod.<Integer>genericMethod(i);

        System.out.println("제한 타입 인자 전달");
        String a= "";
        Integer integer1 = GenericMethod.<Integer>numberMethod(i);
        Double aDouble = GenericMethod.<Double>numberMethod(100.0);

        //static 메소드에서는 타입매개변수를 활용할수 없다.

        //제네릭 메소드는 static, instance 형 모두 사용이 가능하다.

        //타입 매개변수 제한 (명시적 타입 인자 전달)
        //타입추론..

    }
}
