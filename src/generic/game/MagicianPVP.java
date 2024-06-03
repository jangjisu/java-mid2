package generic.game;

public class MagicianPVP {
    private Magician magician;

    public void set(Magician magician) {
        this.magician = magician;
    }

    public Magician PVP(Magician anotherMagician) {
        return magician.getLevel() > anotherMagician.getLevel() ? magician : anotherMagician;
    }
}
