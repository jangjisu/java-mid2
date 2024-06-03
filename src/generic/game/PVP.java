package generic.game;

public class PVP <T extends Character>{
    private T character;

    public void set(T character) {
        this.character = character;
    }

    public T PVP(T anotherCharacter) {
        return character.getLevel() > anotherCharacter.getLevel() ? character : anotherCharacter;
    }
}
