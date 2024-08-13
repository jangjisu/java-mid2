package effective.eight.finalizer;

public class Resource {
    private String resourceName;

    public Resource(String resourceName) {
        this.resourceName = resourceName;
        System.out.println("resourceName = " + resourceName + " initalized");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("reoucrceName = " + resourceName + " finalized");

        super.finalize();
    }
}
