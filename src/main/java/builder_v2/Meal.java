package builder_v2;

public class Meal implements MealInterface {
    private AbstractPackagedMeal dish;
    private AbstractPackagedMeal drink;

    void setDish(AbstractPackagedMeal dish) {
        this.dish = dish;
    }

    void setDrink(AbstractPackagedMeal drink) {
        this.drink = drink;
    }

    @Override
    public AbstractPackagedMeal getDish() {
        return dish;
    }

    @Override
    public AbstractPackagedMeal getDrink() {
        return drink;
    }

    @Override
    public String toString() {
        return "Meal:" +
                "\n" + dish +
                "\n" + drink;
    }
}
