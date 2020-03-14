package creational.builder_v2;

public class Cola implements Item {
    @Override
    public String getItemName() {
        return "Cola";
    }

    @Override
    public double getItemPrice() {
        return 0.75;
    }
}
