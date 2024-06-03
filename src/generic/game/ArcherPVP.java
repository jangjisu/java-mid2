package generic.game;

public class ArcherPVP {
    private Archer archer;

    public void set(Archer archer) {
        this.archer = archer;
    }

    public Archer PVP(Archer anotherArcher) {
        return archer.getLevel() > anotherArcher.getLevel() ? archer : anotherArcher;
    }
}
