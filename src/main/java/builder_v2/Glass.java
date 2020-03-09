package builder_v2;

public class Glass implements PackageType {
    @Override
    public String getPackageName() {
        return "Glass";
    }

    @Override
    public int getMaxCapacity() {
        return 1;
    }
}
