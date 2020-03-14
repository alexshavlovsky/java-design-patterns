package structural.bridge;

public abstract class Representation {
    protected Resource resource;

    public Representation(Resource resource) {
        this.resource = resource;
    }

    public abstract String show();
}
