package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("1", 1000);
        Cat cat = new Cat("2", 200);

        AnmimalMethod.checkup(dog);
        AnmimalMethod.checkup(cat);

        Dog targetDog = new Dog("3", 10000);
        Cat targetCat = new Cat("4", 2000);

        Dog bigger = AnmimalMethod.bigger(dog, targetDog);
    }
}
