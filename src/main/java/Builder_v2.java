import builder_v2.*;

public class Builder_v2 {
    public static void main(String[] args) {
        MealDirector mealDirector = new MealDirector();
        MealBuilder exoticMealBuilder = new ExoticMealBuilder();
        MealBuilder veganMealBuilder = new VeganMealBuilder();
        mealDirector.construct(exoticMealBuilder);
        mealDirector.construct(veganMealBuilder);
        Meal exoticMeal = exoticMealBuilder.getMealInstance();
        Meal veganMeal = veganMealBuilder.getMealInstance();
        System.out.println(exoticMeal);
        System.out.println(veganMeal);
    }
}
