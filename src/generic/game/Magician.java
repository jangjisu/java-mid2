package generic.game;

public class Magician extends Character{

    public Magician(String name, int level) {
        super(name, level);
    }

    @Override
    public void attack() {
        System.out.println(getName() + "마법 공격!");
    }
}
