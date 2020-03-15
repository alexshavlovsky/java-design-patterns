package structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Group extends Item {
    private List<Item> list = new ArrayList<>();

    public Group(String name) {
        super(name);
    }

    public void addItem(Item item) {
        list.add(item);
    }

    @Override
    public int getSize() {
        return list.stream().map(Item::getSize).reduce(0, Integer::sum);
    }

    @Override
    int[] count() {
        return list.stream().map(Item::count).reduce(new int[]{1, 0}, (a, b) -> {
            a[0] += b[0];
            a[1] += b[1];
            return a;
        });
    }

    @Override
    public StringBuilder getTree(StringBuilder prefix) {
        StringBuilder res = formatItem(prefix, this::formatSizeCount).append('\n');
        for (Iterator<Item> itr = list.iterator(); itr.hasNext(); )
            res.append(itr.next().getTree(formatPrefix(prefix, itr.hasNext())));
        return res;
    }
}
