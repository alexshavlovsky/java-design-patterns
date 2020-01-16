package abstractfactory.textviews;

import abstractfactory.ListView;
import abstractfactory.TableView;
import abstractfactory.ViewFactory;

import java.util.List;

public class TextViewFactory implements ViewFactory {

    private static final TextViewFactory INSTANCE = new TextViewFactory();

    private TextViewFactory() {
    }

    public static TextViewFactory getInstance() {
        return INSTANCE;
    }


    @Override
    public ListView createListView(List<String> list) {
        return new TextListView(list);
    }

    @Override
    public TableView createTableView(List<List<String>> cells) {
        return new TextTableView(cells);
    }
}
