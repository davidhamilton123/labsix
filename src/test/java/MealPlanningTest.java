import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MealPlanningTest {

    MealPlanningService service = new MealPlanningService();

    @Test
    public void testValidMealPlan() {
        assertTrue(service.createMealPlan(4, "Pancakes", "Sandwich", "Pasta"));
    }

    @Test
    public void testFamilySizeTooSmall() {
        assertFalse(service.createMealPlan(0, "Pancakes", "Sandwich", "Pasta"));
    }

    @Test
    public void testFamilySizeTooLarge() {
        assertFalse(service.createMealPlan(7, "Pancakes", "Sandwich", "Pasta"));
    }

    @Test
    public void testFamilySizeAtMinimum() {
        assertTrue(service.createMealPlan(1, "Eggs", "Soup", "Chicken"));
    }

    @Test
    public void testFamilySizeAtMaximum() {
        assertTrue(service.createMealPlan(6, "Bagels", "Rice", "Steak"));
    }

    @Test
    public void testInvalidBreakfast() {
        assertFalse(service.createMealPlan(4, "", "Sandwich", "Pasta"));
    }

    @Test
    public void testInvalidLunch() {
        assertFalse(service.createMealPlan(4, "Pancakes", "", "Pasta"));
    }

    @Test
    public void testInvalidDinner() {
        assertFalse(service.createMealPlan(4, "Pancakes", "Sandwich", ""));
    }

    @Test
    public void testNullBreakfast() {
        assertFalse(service.createMealPlan(4, null, "Sandwich", "Pasta"));
    }

    @Test
    public void testNullLunch() {
        assertFalse(service.createMealPlan(4, "Pancakes", null, "Pasta"));
    }

    @Test
    public void testNullDinner() {
        assertFalse(service.createMealPlan(4, "Pancakes", "Sandwich", null));
    }
}