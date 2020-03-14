package structural.bridge;

public class FullView extends Representation {
    public FullView(Resource resource) {
        super(resource);
    }

    @Override
    public String show() {
        return "--------" + resource.type() + "--------\n" +
                "[" + resource.icon() + "] " + resource.title() + " at " + resource.location() + "\n" +
                resource.description() + "\n" +
                "[" + resource.image() + "]";
    }
}
