package structural.composite;

import java.util.function.Supplier;

public abstract class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    abstract int getSize();

    abstract int[] count();

    abstract StringBuilder getTree(StringBuilder prefix);

    @Override
    public String toString() {
        return getTree(new StringBuilder()).toString();
    }

    StringBuilder formatItem(StringBuilder prefix, Supplier<String> supplier) {
        return new StringBuilder(prefix).append(name).append(" (").append(supplier.get()).append(')');
    }

    String formatSizeCount() {
        int[] count = count();
        return String.format("size: %d, groups: %d, leafs: %d", getSize(), count[0] - 1, count[1]);
    }

    static StringBuilder formatPrefix(StringBuilder prefix, boolean hasNext) {
        StringBuilder res = new StringBuilder(prefix);
        if (res.length() > 0) {
            int pos = prefix.length() - 1;
            res.setCharAt(pos, res.charAt(pos) == '└' ? ' ' : '│');
        }
        return res.append(' ').append(hasNext ? '├' : '└');
    }
}
