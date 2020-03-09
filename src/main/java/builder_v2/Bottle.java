package builder_v2;

public class Bottle implements PackageType {
    @Override
    public String getPackageName() {
        return "Bottle";
    }

    @Override
    public int getMaxCapacity() {
        return 1;
    }
}
