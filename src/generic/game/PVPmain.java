package generic.game;

public class PVPmain {
    public static void main(String[] args) {
        Archer archer = new Archer("궁수1", 100);
        Archer archer1 = new Archer("궁수2",200);

        archer1.attack();
        archer.attack();

        ArcherPVP archerPVP = new ArcherPVP();

        archerPVP.set(archer);

        Archer pvp = archerPVP.PVP(archer1);
        System.out.println(pvp);

        Magician magician = new Magician("마법사1", 200);
        Magician magician1 = new Magician("마법사2", 150);

        MagicianPVP magicianPVP = new MagicianPVP();

        magicianPVP.set(magician);

        Magician pvp1 = magicianPVP.PVP(magician1);
        System.out.println(pvp1);
    }
}
