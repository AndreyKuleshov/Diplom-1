package praktikum.ingredientTests;

import org.junit.Assert;
import org.junit.Test;

public class IngredientTest extends IngredientBaseClass{
    @Test
    public void getIngredientPriceTest() {
        Assert.assertEquals(getPRICE_INGREDIENT(), ingredient.getPrice(), 0);
    }
}
