package praktikum.ingredientTests;

import praktikum.Ingredient;
import praktikum.IngredientType;
import praktikum.TestData;

public abstract class IngredientBaseClass extends TestData {
    Ingredient ingredientSauce = new Ingredient(IngredientType.SAUCE, SAUCE, PRICE_SAUCE);
    Ingredient ingredientFilling = new Ingredient(IngredientType.FILLING, FILLING, PRICE_FILLING);

}
