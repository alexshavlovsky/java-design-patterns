package structural.bridge;

public class DetailedView extends Representation {
    public DetailedView(Resource resource) {
        super(resource);
    }

    @Override
    public String show() {
        return "[" + resource.icon() + "] " + resource.title() + " in " + resource.location();
    }
}
