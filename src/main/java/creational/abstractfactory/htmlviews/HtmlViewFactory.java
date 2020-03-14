package creational.abstractfactory.htmlviews;

import creational.abstractfactory.ListView;
import creational.abstractfactory.TableView;
import creational.abstractfactory.ViewFactory;

import java.util.List;

public class HtmlViewFactory implements ViewFactory {

    private static final HtmlViewFactory INSTANCE = new HtmlViewFactory();

    private HtmlViewFactory() {
    }

    public static HtmlViewFactory getInstance() {
        return INSTANCE;
    }

    @Override
    public ListView createListView(List<String> list) {
        return new HtmlListView(list);
    }

    @Override
    public TableView createTableView(List<List<String>> cells) {
        return new HtmlTableView(cells);
    }
}
