package creational.builder_v2;

public class ExoticMealBuilder extends MealBuilder {
    @Override
    public void setDishItems() {
        dish.addItem(new HawaiianPizza());
    }

    @Override
    public void setDishPackage() {
        dish.setPackageType(new Wrapper());
    }

    @Override
    public void setDrinkItems() {
        drink.addItem(new Juice());
    }

    @Override
    public void setDrinkPackage() {
        drink.setPackageType(new Glass());
    }
}
