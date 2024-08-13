package effective.eight.finalizer;

public class finalizeEx {
    public static void main(String[] args) {
        Resource rs = new Resource("test");

        rs = null;

        System.gc();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
