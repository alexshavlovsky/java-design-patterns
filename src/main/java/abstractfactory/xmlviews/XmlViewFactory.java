package abstractfactory.xmlviews;

import abstractfactory.ListView;
import abstractfactory.TableView;
import abstractfactory.ViewFactory;

import java.util.List;

public class XmlViewFactory implements ViewFactory {

    private static final XmlViewFactory INSTANCE = new XmlViewFactory();

    private XmlViewFactory() {
    }

    public static XmlViewFactory getInstance() {
        return INSTANCE;
    }

    @Override
    public ListView createListView(List<String> list) {
        return new XmlListView(list);
    }

    @Override
    public TableView createTableView(List<List<String>> cells) {
        return new XmlTableView(cells);
    }
}
