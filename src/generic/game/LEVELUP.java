package generic.game;

import generic.ex5.Box;

public class LEVELUP<T extends Character>{
//    private T character;
//
//    public void set(T character) {
//        this.character = character;
//    }
//
//    public T PVP(T anotherCharacter) {
//        return character.getLevel() > anotherCharacter.getLevel() ? character : anotherCharacter;
//    }
//
//
//    public static <Z extends Character> Z sameCharacterPVP(Z z1, Z z2) {
//        return z1.getLevel() > z2.getLevel() ? z1 : z2;
//    }

    public static <Z extends Character> Z levelup (Box<Z> box) {
        int level = box.get().getLevel() + 1;
        box.get().setLevel(level);
        System.out.printf("캐릭터 레벨이 %d 이 되었습니다.\n", level);
        box.get().attack();

        return box.get();
    }

    public static Character levelupWildcard (Box<? extends Character> box) {
        int level = box.get().getLevel() + 1;
        box.get().setLevel(level);
        System.out.printf("캐릭터 레벨이 %d 이 되었습니다.\n", level);
        box.get().attack();
        return box.get();
    }
}
