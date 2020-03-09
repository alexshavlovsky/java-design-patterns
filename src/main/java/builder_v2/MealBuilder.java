package builder_v2;

public abstract class MealBuilder extends AbstractMealBuilder {
    PackagedMeal dish = new PackagedMeal();
    PackagedMeal drink = new PackagedMeal();

    @Override
    public Meal getMealInstance() {
        Meal meal = new Meal();
        if (dish.capacityAvailable() < 0) throw new RuntimeException("Incompatible dish package capacity");
        if (drink.capacityAvailable() < 0) throw new RuntimeException("Incompatible drink package capacity");
        meal.setDish(dish);
        meal.setDrink(drink);
        return meal;
    }
}
