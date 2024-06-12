package generic.game;

import generic.ex5.Box;
import generic.ex5.EraserBox;

public class PVPmain2 {
    public static void main(String[] args) {
        Archer archer = new Archer("궁수1", 100);
        Archer archer1 = new Archer("궁수2",200);


        Magician magician = new Magician("마법사1", 200);
        Magician magician1 = new Magician("마법사2", 150);

        Box<Archer> archerBox = new Box<>();
        archerBox.set(archer);

        LEVELUP.levelup(archerBox);

        LEVELUP.levelupWildcard(archerBox);

        Box<Magician> magicianBox = new Box<>();
        magicianBox.set(magician);

        LEVELUP.levelup(magicianBox);

        LEVELUP.levelupWildcard(magicianBox);

        Box<Integer> eraserBox = new Box<>();

        eraserBox.set(10);

        Integer i = eraserBox.get();


    }
}
