package praktikum.ingredientTests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;
import praktikum.TestData;

@RunWith(Parameterized.class)
public class IngredientTypeAndNameParametrizedTest {
    private final IngredientType TYPE;
    private final String NAME;


    public IngredientTypeAndNameParametrizedTest(IngredientType type, String name) {
        this.TYPE = type;
        this.NAME = name;
    }
    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][] {
                { IngredientType.SAUCE, TestData.SAUCE},
                { IngredientType.FILLING, TestData.FILLING},
        };
    }
    @Test
    public void getIngredientTypeTest() {
        Ingredient ingredient = new Ingredient(TYPE, NAME, TestData.INGREDIENT_PRICE);
        Assert.assertEquals(TYPE, ingredient.getType());
        Assert.assertEquals(NAME, ingredient.getName());
    }
}
