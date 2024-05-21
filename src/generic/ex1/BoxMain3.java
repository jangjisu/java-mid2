package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {

        GenericBox<Integer> integerBox = new GenericBox<>(); //생성시점에 타입 결정
        integerBox.set(123);
        //integerBox.set("1"); //Integer 타입만 허용
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println(str);

        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(5.4);
        System.out.println(doubleBox.get());

        //타입 추론 new 에 따로 Integer 를 적지않아도됨
        GenericBox<Integer> integerGenericBox = new GenericBox<>();

        //Generic 이란 ? 사용할 타입을 미리 결정하지 않는 것

        //매개변수 (parameter) 인자 (Argument)
        //Generic 은 타입 매개변수를 받아 사용하는것
        //제네릭 타입
        // 사용할 타입을 사용 시점에 정해 사용할 수 있게 선언하는것
        // GenericBox 에서 <T> 로 여러가지 타입을 받을 수 잇게 해놓은것
        //타입 매개변수
        // <T> 그 자체 생성 시점에 실제 타입으로 변경되는 부분
        //타입 인자
        // 제네릭 타입을 사용할 시점에 전해지는 인자 ex Integer, String ...
        // 타입 인자는 기본형이 아닌 참조형 으로만 생성가능하다.

        //기본형
        // 실제 값을 직접 저장하는 것 이기때문에, null 로 생성할 수 없다
        //참조형
        // 저장되는 값의 주소를 저장하고, 주소를 통해 값을 가져오기 때문에 값이 null 도 가능
    }
}
