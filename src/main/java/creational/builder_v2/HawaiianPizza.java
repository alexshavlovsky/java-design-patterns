package creational.builder_v2;

public class HawaiianPizza implements Item{
    @Override
    public String getItemName() {
        return "HawaiianPizza";
    }

    @Override
    public double getItemPrice() {
        return 2.8;
    }
}
