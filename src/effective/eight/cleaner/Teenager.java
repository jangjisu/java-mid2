package effective.eight.cleaner;

public class Teenager {
    public static void main(String[] args) {
        Room room = new Room(99);

        try {
            room = null;
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("아무렴");
    }
}
