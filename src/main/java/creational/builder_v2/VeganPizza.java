package creational.builder_v2;

public class VeganPizza implements Item {
    @Override
    public String getItemName() {
        return "Vegan Pizza";
    }

    @Override
    public double getItemPrice() {
        return 3.5;
    }
}
