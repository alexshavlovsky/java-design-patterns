package creational.abstractfactory.textviews;

import creational.abstractfactory.ListView;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TextListView extends ListView {

    TextListView(List<String> items) {
        super(items);
    }

    @Override
    public String representAsString() {
        return IntStream.range(0, items.size())
                .mapToObj(i -> (i + 1) + ". " + items.get(i))
                .collect(Collectors.joining("\n"));
    }
}
