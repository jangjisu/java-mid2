package generic.game;

public class Archer extends Character {
    public Archer(String name, int level) {
        super(name, level);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " 화살 공격!");
    }

}
