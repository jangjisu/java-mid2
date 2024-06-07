package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("1", 100);
        Cat cat = new Cat("2", 200);

        ComplexBox<Dog> hospital = new ComplexBox<>();

        hospital.set(dog);

        Cat cat1 = hospital.printAndReturn(cat);

        System.out.println("return Cat1 = " + cat1.toString());

        //전부 T일경우, 클래스보다 메소드가 우선순위가 더 높다. 좀더 구체적인것 가까운 것을 통해 된다
    }
}
