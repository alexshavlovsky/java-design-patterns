package creational;

import creational.abstractfactory.ListView;
import creational.abstractfactory.TableView;
import creational.abstractfactory.ViewFactory;
import creational.abstractfactory.htmlviews.HtmlViewFactory;
import creational.abstractfactory.textviews.TextViewFactory;
import creational.abstractfactory.xmlviews.XmlViewFactory;

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

        // TEXT VIEW
        print("===Text representation===");
        print("===List===");
        print(list);
        print("===Table===");
        print(table);

        // HTML VIEW
        factory = HtmlViewFactory.getInstance();
        list = factory.createListView(listModel);
        table = factory.createTableView(tableModel);

        print("");
        print("===HTML representation===");
        print("===List===");
        print(list);
        print("===Table===");
        print(table);

        // XML VIEW
        factory = XmlViewFactory.getInstance();
        list = factory.createListView(listModel);
        table = factory.createTableView(tableModel);

        print("");
        print("===XML representation===");
        print("===List===");
        print(list);
        print("===Table===");
        print(table);
    }
}
