package builder_v2;

public class Wrapper implements PackageType {
    @Override
    public String getPackageName() {
        return "Wrapper";
    }

    @Override
    public int getMaxCapacity() {
        return 2;
    }
}
