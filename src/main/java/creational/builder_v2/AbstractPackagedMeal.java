package creational.builder_v2;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractPackagedMeal {
    public abstract PackageType getPackageType();

    public abstract List<Item> getItems();

    private double getPrice() {
        return getItems().stream().map(Item::getItemPrice).reduce((double) 0, Double::sum);
    }

    private String getItemsList() {
        return getItems().stream().map(Item::getItemName).collect(Collectors.joining(", "));
    }

    @Override
    public String toString() {
        return "- " + getItemsList() + " ($" + getPrice() + ") in " + getPackageType().getPackageName();
    }
}
