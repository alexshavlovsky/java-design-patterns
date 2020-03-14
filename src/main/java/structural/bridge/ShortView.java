package structural.bridge;

public class ShortView extends Representation {
    public ShortView(Resource resource) {
        super(resource);
    }

    @Override
    public String show() {
        return resource.title();
    }
}
