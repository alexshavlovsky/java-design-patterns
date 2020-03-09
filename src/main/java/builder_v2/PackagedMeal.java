package builder_v2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PackagedMeal extends AbstractPackagedMeal {
    private PackageType packageType;
    private List<Item> itemList = new ArrayList<>();

    void setPackageType(PackageType packageType) {
        this.packageType = packageType;
    }

    void addItem(Item item) {
        itemList.add(item);
    }

    void addItems(Collection<Item> items) {
        itemList.addAll(items);
    }

    int capacityAvailable() {
        return packageType.getMaxCapacity() - itemList.size();
    }

    @Override
    public PackageType getPackageType() {
        return packageType;
    }

    @Override
    public List<Item> getItems() {
        return Collections.unmodifiableList(itemList);
    }
}
