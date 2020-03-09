package builder_v2;

public class MealDirector {
    public void construct(MealBuilder mealBuilder) {
        mealBuilder.setDishItems();
        mealBuilder.setDishPackage();
        mealBuilder.setDrinkItems();
        mealBuilder.setDrinkPackage();
    }
}
