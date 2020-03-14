package creational.abstractfactory;

import java.util.List;

public abstract class ListView implements ViewInterface {
    protected final List<String> items;

    protected ListView(List<String> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return representAsString();
    }
}
