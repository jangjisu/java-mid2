package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        //문제 1: 개 병원에 고양이 전달
        dogHospital.set(dog);
        //dogHospital.set(cat); //다른 타입 입력 : 컴파일 오류

        //문제 2: 개 타입 반환
        //dogHospital.set(cat);
        dogHospital.set(dog);
        Dog dog2 = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));

        //해결한 문제

        //타입안정성 문제
        // Cat 에 해당하는 부분에 Dog로 선언된 부분을 전달할 수 없게되어 해결된다.
        // Animal 객체가 아닌 Override 를 통해 선언된, Cat, Dog 객체 자체를 사용할 수 있게된다. 다운캐스팅이 필요없다
        // Cat 타입에 Dog 가 들어와 캐스팅 예외가 발생하는 경우를 차단할 수 있다.

        //제네릭 문제
        // 타입매게변수를 활용할 경우, Integer 등 예상하지 못한 타입변수도 들어올 수 있는데, 제한이 가능하다.
        // Object 의 기능이 아닌 Animal 의 기능들을 전부 사용가능하다.

    }
}
