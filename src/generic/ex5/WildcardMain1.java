package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 10));
        catBox.set(new Cat("냐옹이", 15));

        WildcardEx.printGenericV1(dogBox);

        WildcardEx.printWildcardV1(dogBox);

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildcardV2(dogBox);

        Animal animal = WildcardEx.printAndReturnWildcardV3(dogBox);
        Animal animal1 = WildcardEx.printAndReturnWildcardV3(catBox);
        // 와일드 카드는 이미 만들어진 제네릭타입을 활용할ㄸㅐ 사용하는 것으로,
        // Generic 과 같이 return 타입을 선언한 타입과 동일하게 맞쳐줄 수 있는 기능을 가지고 있지 않다

        // 비제한 와일드 카드는 ? 만 적거나 extends Object 한마디로 모든 타입을 받을 수 있는것
        // 상한 와일드카드 제한이 정해진(해당 클래스나, 해당 클래스의 자식만 올 수 있게 제한된 와일드카드)

        // Generic vs 와일드카드
        // Generic 을 사용하게 되면, 전달받는 Type을 타입 추론을 통해 전달받은 타입인자로 변경하는 과정을 거쳐 변경하는 작업이 일어난다.
        // 와일드카드를 사용하면, 단순히 전달받은 값을 꺼내 쓰므로 훨씬 작업이 단순하다.



        Dog dog = WildcardEx.printAndReturnGenericV3(dogBox);
        Cat cat = WildcardEx.printAndReturnGenericV3(catBox);

        WildcardEx.printWildcard(dogBox);
    }
}
