package generic.test.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        //문제 1: 개 병원에 고양이 전달
        dogHospital.set(cat); //다른 타입 입력 : 컴파일 오류

        //문제 2: 개 타입 반환
        //dogHospital.set(dog);
        dogHospital.set(cat);
        Dog dog2 = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));

        //문제 : down casting 문제 가 발생함
    }
}
