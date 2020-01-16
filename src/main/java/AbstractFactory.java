import abstractfactory.ListView;
import abstractfactory.TableView;
import abstractfactory.ViewFactory;
import abstractfactory.htmlviews.HtmlViewFactory;
import abstractfactory.textviews.TextViewFactory;

import java.util.List;

public class AbstractFactory {

    private static List<String> listModel = List.of("First item", "Second item", "Third item");

    private static List<List<String>> tableModel = List.of(
            List.of("", "", "", "Hello from the fourth column"),
            List.of("First column, first row"),
            List.of("First column, second row", "Second column, second row"),
            List.of("First column, third row", "Second column, third row", "Third column, third row"));

    private static void print(Object s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        ViewFactory factory = TextViewFactory.getInstance();
        ListView list = factory.createListView(listModel);
        TableView table = factory.createTableView(tableModel);

        print("===Text representation===");
        print("===List===");
        print(list);
        print("===Table===");
        print(table);

        factory = HtmlViewFactory.getInstance();
        list = factory.createListView(listModel);
        table = factory.createTableView(tableModel);

        print("");
        print("===HTML representation===");
        print("===List===");
        print(list);
        print("===Table===");
        print(table);
    }
}
