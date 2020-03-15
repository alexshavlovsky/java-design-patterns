package structural.composite;

public class Leaf extends Item {
    private int size;

    public Leaf(int size, String name) {
        super(name);
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    int[] count() {
        return new int[]{0, 1};
    }

    @Override
    StringBuilder getTree(StringBuilder prefix) {
        return formatItem(prefix, () -> Integer.toString(getSize())).append('\n');
    }
}
