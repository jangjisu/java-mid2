package generic.ex3;

public class AnimalHospitalV2 <T> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        //T의 타입을 메소드 정의하는 시점에 알 수 없다.. getName 메소드가 있는지를 모름.. Object의 타입으로 가정하고, 해당 Object의 기능만 사용할수있도록 제한한다.
        //System.out.println("동물 이름: " + animal.getName());
        //System.out.println("동물 크기: " + animal.getSize());
        //animal.sound();
        animal.toString();
        animal.equals(null);
    }

    public T bigger(T target) {
        return null;
        //return animal.getSize() > target.getSize() ? animal : target;
    }
}
