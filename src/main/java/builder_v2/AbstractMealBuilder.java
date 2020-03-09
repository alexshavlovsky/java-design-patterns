package builder_v2;

public abstract class AbstractMealBuilder {
    abstract void setDishItems();

    abstract void setDishPackage();

    abstract void setDrinkItems();

    abstract void setDrinkPackage();

    public abstract Meal getMealInstance();
}
