package builder_v2;

public class Juice implements Item {
    @Override
    public String getItemName() {
        return "Juice";
    }

    @Override
    public double getItemPrice() {
        return 1.25;
    }
}
