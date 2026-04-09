public class Main {
    public static void main(String[] args) {
        MealPlanningService service = new MealPlanningService();

        boolean result = service.createMealPlan(4, "Pancakes", "Sandwich", "Pasta");

        if (result) {
            System.out.println("Meal plan created successfully.");
        } else {
            System.out.println("Meal plan could not be created.");
        }
    }
}