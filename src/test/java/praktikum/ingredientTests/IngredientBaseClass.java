package praktikum.ingredientTests;

import praktikum.Ingredient;
import praktikum.IngredientType;
import praktikum.TestData;

public abstract class IngredientBaseClass extends TestData {
    Ingredient ingredient = new Ingredient(IngredientType.SAUCE, SAUCE, PRICE_INGREDIENT);

}
