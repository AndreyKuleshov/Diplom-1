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
        Mockito.when(bun.getPrice()).thenReturn(getBUN_PRICE());
        Mockito.when(bun.getName()).thenReturn(getBUN_NAME());
        Mockito.when(ingredient.getPrice()).thenReturn(getINGREDIENT_PRICE());
        Mockito.when(ingredient.getType()).thenReturn(getINGREDIENT_TYPE_FILLING());
        Mockito.when(ingredient.getName()).thenReturn(getINGREDIENT_NAME());
        Mockito.when(ingredientTwo.getPrice()).thenReturn(getINGREDIENT_TWO_PRICE());
        Mockito.when(ingredientTwo.getType()).thenReturn(getINGREDIENT_TYPE_SAUCE());
        Mockito.when(ingredientTwo.getName()).thenReturn(getINGREDIENT_TWO_NAME());
    }
}
