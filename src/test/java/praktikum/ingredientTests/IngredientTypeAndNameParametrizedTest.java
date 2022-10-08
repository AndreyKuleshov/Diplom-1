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
    private static final TestData TEST_DATA = new TestData();
    private final IngredientType TYPE;
    private final String NAME;


    public IngredientTypeAndNameParametrizedTest(IngredientType type, String name) {
        this.TYPE = type;
        this.NAME = name;
    }
    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][] {
                { IngredientType.SAUCE, TEST_DATA.getSAUCE()},
                { IngredientType.FILLING, TEST_DATA.getFILLING()},
        };
    }
    @Test
    public void getIngredientTypeTest() {
        Ingredient ingredient = new Ingredient(TYPE, NAME, TEST_DATA.getINGREDIENT_PRICE());
        Assert.assertEquals(TYPE, ingredient.getType());
        Assert.assertEquals(NAME, ingredient.getName());
    }
}
