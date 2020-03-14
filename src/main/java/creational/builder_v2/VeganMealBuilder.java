package creational.builder_v2;

public class VeganMealBuilder extends MealBuilder {
    @Override
    public void setDishItems() {
        dish.addItem(new VeganPizza());
    }

    @Override
    public void setDishPackage() {
        dish.setPackageType(new Wrapper());
    }

    @Override
    public void setDrinkItems() {
        drink.addItem(new Cola());
    }

    @Override
    public void setDrinkPackage() {
        drink.setPackageType(new Bottle());
    }
}
