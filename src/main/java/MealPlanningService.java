public class MealPlanningService {

    public boolean validateFamilySize(int familySize) {
        return familySize >= 1 && familySize <= 6;
    }

    public boolean validateMeal(String meal) {
        return meal != null && !meal.trim().isEmpty();
    }

    public boolean createMealPlan(int familySize, String breakfast, String lunch, String dinner) {
        if (!validateFamilySize(familySize)) {
            return false;
        }

        if (!validateMeal(breakfast)) {
            return false;
        }

        if (!validateMeal(lunch)) {
            return false;
        }

        if (!validateMeal(dinner)) {
            return false;
        }

        return true;
    }
}