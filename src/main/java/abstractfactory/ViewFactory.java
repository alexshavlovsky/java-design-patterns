package abstractfactory;

import java.util.List;

public interface ViewFactory {
    ListView createListView(List<String> list);

    TableView createTableView(List<List<String>> cells);
}
