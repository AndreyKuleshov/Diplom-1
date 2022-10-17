package praktikum.BurgerTests;

import org.junit.Before;
import org.mockito.Mock;
import org.mockito.Mockito;
import praktikum.*;

public abstract class BurgerBaseClass extends TestData {
    Burger burger = new Burger();
    @Mock
    Bun bun;
    @Mock
    Ingredient ingredient;
    @Mock
    Ingredient ingredientTwo;
    @Before
    public void setUp() {
        Mockito.when(bun.getPrice()).thenReturn(BUN_PRICE);
        Mockito.when(bun.getName()).thenReturn(BUN_NAME);
        Mockito.when(ingredient.getPrice()).thenReturn(INGREDIENT_PRICE);
        Mockito.when(ingredient.getType()).thenReturn(INGREDIENT_TYPE_FILLING);
        Mockito.when(ingredient.getName()).thenReturn(INGREDIENT_NAME);
        Mockito.when(ingredientTwo.getPrice()).thenReturn(INGREDIENT_TWO_PRICE);
        Mockito.when(ingredientTwo.getType()).thenReturn(INGREDIENT_TYPE_SAUCE);
        Mockito.when(ingredientTwo.getName()).thenReturn(INGREDIENT_TWO_NAME);
    }
}
