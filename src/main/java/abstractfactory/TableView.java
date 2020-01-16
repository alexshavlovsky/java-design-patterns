package abstractfactory;

import java.util.List;

public abstract class TableView implements ViewInterface {
    protected final List<List<String>> cells;

    protected TableView(List<List<String>> cells) {
        this.cells = cells;
    }

    @Override
    public String toString() {
        return representAsString();
    }
}
