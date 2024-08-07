package collection.list.test.ex2;

public class Item {
    private String name;
    private int price;
    private int quanity;

    public Item(String name, int price, int quanity) {
        this.name = name;
        this.price = price;
        this.quanity = quanity;
    }

    public String getName() {
        return name;
    }

    public int getTotalPrice() {
        return price * quanity;
    }
}
